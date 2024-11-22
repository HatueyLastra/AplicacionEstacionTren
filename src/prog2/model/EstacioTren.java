/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package prog2.model;
import java.io.*; 
import java.util.ArrayList;
import java.util.Iterator;
import prog2.vista.ExcepcioEstacio; 

/**
 *
 * @author Javier Rivera Romeu
 */

// Nota: VistaEstacioTren pide información a través de esta clase y puede cambiar su estado. 
public class EstacioTren {
    private String nomEstacio; 
    private LlistaIncidencies llistaIncidencies;
    private LlistaAccessos llistaAccessos;
    private LlistaVies llistaVies; 

    public EstacioTren(String nomEstacio) {
        this.nomEstacio = nomEstacio;
        this.llistaIncidencies = new LlistaIncidencies();
        this.llistaAccessos = new LlistaAccessos(){};
        this.llistaVies = new LlistaVies();
    }
    
    public void afegirIncidencia(int num, String tipus, String nomVia, String data) throws ExcepcioEstacio {
        try {
            Via via = null;
            Iterator<Acces> accesIterator = llistaAccessos.getAccesIterator();
            while (accesIterator.hasNext()) {
                Acces acc = accesIterator.next();
                ArrayList<Via> viasList = acc.getVias();
                Iterator<Via> viaIterator = viasList.iterator();
                while (viaIterator.hasNext()) {
                    Via v = viaIterator.next();
                    if (v.getNom().equals(nomVia)) {
                        via = v;
                        break;
                    }
                }
                if (via != null) break;
            }
            if (via != null) {
                llistaIncidencies.afegirIncidencia(num, tipus, via, data);
                llistaAccessos.actualitzaEstatAccessos();
            } else {
                throw new ExcepcioEstacio("No s'ha trobat la via amb el nom especificat: " + nomVia);
            }
        } catch (ExcepcioEstacio e) {
            throw new ExcepcioEstacio("Error al afegir incidència: " + e.getMessage());
        }
    }

    public void eliminarIncidencia(int num) throws ExcepcioEstacio {
        try {
            Incidencia incidencia = llistaIncidencies.getIncidencia(num);
            llistaIncidencies.eliminarIncidencia(incidencia);
            llistaAccessos.actualitzaEstatAccessos();
        } catch (ExcepcioEstacio e) {
            throw new ExcepcioEstacio("Error al eliminar incidència: " + e.getMessage());
        }
    }
    
    public void inicialitzaDadesEstacioTren() throws ExcepcioEstacio {
    
        llistaAccessos.buidar();
        
        float desnivell = 9;
        
        float pes = 200;
        Acces Acc1 = new Ascensor(pes, desnivell, "A1", true);      
        llistaAccessos.afegirAcces(Acc1);
        
        
        String marca = "Schindler";
       
        Acces  Acc2 = new EscalaMecanica(marca, desnivell, "A2", true);     
          
        llistaAccessos.afegirAcces(Acc2);
        
        float longitud = 30;
        Acces Acc3 = new Passadis(longitud, "A3", true); 
        llistaAccessos.afegirAcces(Acc3);
        
        
        float vel = 0.3f;  
        Acces  Acc4 = new CintaTransportadora(vel, longitud, "A4", true);     
        llistaAccessos.afegirAcces(Acc4);
        
        desnivell = 7;
        pes = 300;
        Acces Acc5 = new Ascensor(pes, desnivell, "A5", true);    
        llistaAccessos.afegirAcces(Acc5);
        
        Acces Acc6 = new Escala(desnivell, "A6", true);    
        llistaAccessos.afegirAcces(Acc6);
        
        desnivell = 8.5f;
        pes = 250;
        Acces  Acc7 = new Ascensor(pes, desnivell, "A7", true);      
        llistaAccessos.afegirAcces(Acc7);
        
        Acces Acc8 = new Escala(desnivell, "A8", true);       
        llistaAccessos.afegirAcces(Acc8);
        
        longitud = 25;
        Acces Acc9 = new Passadis(longitud, "A9", true);   
        llistaAccessos.afegirAcces(Acc9);
        
        vel = 0.4f; 
        Acces Acc10 = new CintaTransportadora(vel, longitud, "A10", true);       
        llistaAccessos.afegirAcces(Acc10);
        
        desnivell = 8;
        marca = "Otis";
        Acces Acc11 = new EscalaMecanica(marca, desnivell, "A11", true);   
        llistaAccessos.afegirAcces(Acc11);
        
        longitud = 20;
        Acces Acc12 = new Passadis(longitud, "A12", true); 
        llistaAccessos.afegirAcces(Acc12);
        
        desnivell = 20;
        Acces Acc13 = new Escala(desnivell, "A13", true);       
        llistaAccessos.afegirAcces(Acc13);
        
        pes = 350;
        Acces Acc14 = new Ascensor(pes, desnivell, "A14", true);       
        llistaAccessos.afegirAcces(Acc14);
        
        /* Pistes */
        llistaVies.buidar();
        Via V1  = new Via("V1",  "Iberica", 2, true, "100%"); llistaVies.afegirVia(V1);
        Via V2  = new Via("V2",  "Iberica", 2, true, "100%"); llistaVies.afegirVia(V2);
        Via V3  = new Via("V3",  "Internacional", 2, true, "100%");  llistaVies.afegirVia(V3);
        Via V4  = new Via("V4", "Iberica", 1, true, "100%"); llistaVies.afegirVia(V4);
        Via V5  = new Via("V5", "Iberica", 1, true, "100%");  llistaVies.afegirVia(V5);
        Via V6  = new Via("V6",  "Estreta", 1, true, "100%");  llistaVies.afegirVia(V6);
        Via V7  = new Via("V7",  "Estreta", 1, true, "100%");  llistaVies.afegirVia(V7);
         
        /* Accés */
        Acc1.afegirVia(V1);
        Acc2.afegirVia(V1); 
        Acc3.afegirVia(V2);
        Acc4.afegirVia(V2);
        Acc5.afegirVia(V3);
        Acc6.afegirVia(V3);
        Acc7.afegirVia(V4); Acc7.afegirVia(V6);
        Acc8.afegirVia(V4); Acc8.afegirVia(V6);
        Acc9.afegirVia(V5); Acc9.afegirVia(V7);
        Acc10.afegirVia(V5); Acc10.afegirVia(V7);
        Acc11.afegirVia(V6);
        Acc12.afegirVia(V6);
        Acc13.afegirVia(V7);
        Acc14.afegirVia(V7);
        
    }
    
    public String getNomEstacio() {
        return nomEstacio;
    }

    public void setNomEstacio(String nomEstacio) {
        this.nomEstacio = nomEstacio;
    }

    public LlistaIncidencies getLlistaIncidencies() {
        return llistaIncidencies;
    }

    public void setLlistaIncidencies(LlistaIncidencies llistaIncidencies) {
        this.llistaIncidencies = llistaIncidencies;
    }

    public LlistaAccessos getLlistaAccessos() {
        return llistaAccessos;
    }

    public void setLlistaAccessos(LlistaAccessos llistaAccessos) {
        this.llistaAccessos = llistaAccessos;
    }

    public LlistaVies getLlistaVies() {
        return llistaVies;
    }

    public void setLlistaVies(LlistaVies llistaVies) {
        this.llistaVies = llistaVies;
    }
    
    public void guardar(String camiDesti) throws ExcepcioEstacio {
        try {
            File fitxer = new File(camiDesti);
            FileOutputStream fout = new FileOutputStream(fitxer);
            ObjectOutputStream oos = new ObjectOutputStream(fout);

            oos.writeObject(this);
            oos.close();
            System.out.println("Dades de l'estació de tren guardats correctament en: " + camiDesti);
            
        } catch (IOException e) {
            throw new ExcepcioEstacio("Error en guardar les dades de l'estació de tren: " + e.getMessage());
        }
    }
    
    public static EstacioTren carregar(String camiOrigen) throws ExcepcioEstacio {
        try {
            File fitxer = new File(camiOrigen);
            FileInputStream fin = new FileInputStream(fitxer);
            ObjectInputStream ois = new ObjectInputStream(fin);
            EstacioTren estacioTren = (EstacioTren) ois.readObject();
            ois.close();
        
            System.out.println("Dades de l'estació de tren carregats correctament des de: " + camiOrigen);
            return estacioTren;
            
        } catch (IOException | ClassNotFoundException e) {
            throw new ExcepcioEstacio("Error en guardar les dades de l'estació de tren: " + e.getMessage());
        }
    }
   
    
}
