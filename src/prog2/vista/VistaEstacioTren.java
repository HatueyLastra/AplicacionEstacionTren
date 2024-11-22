/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog2.vista;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import prog2.model.EstacioTren;
import java.util.Scanner;
import prog2.model.Incidencia;
import prog2.model.Incidencia.TipusIncidencia;
import prog2.model.Menu;
import prog2.model.Via;

/**
 *
 * @author Javier Rivera Romeu
 */

enum MenuOption {
    LISTAR_VIAS,
    LISTAR_VIAS_ABIERTAS,
    LISTAR_VIAS_CERRADAS,
    LISTAR_ACCESOS_ABIERTOS,
    LISTAR_ACCESOS_CERRADOS,
    LISTAR_INCIDENCIAS,
    AGREGAR_INCIDENCIA,
    ELIMINAR_INCIDENCIA,
    CALCULAR_ACCESOS,
    CALCULAR_LONGITUD,
    GUARDAR_ESTACION,
    RECUPERAR_ESTACION,
    SALIR
}

public class VistaEstacioTren {
    private EstacioTren estacioTren;
    private Scanner scanner;

    public VistaEstacioTren(String nomEstacio) throws ExcepcioEstacio {
        this.estacioTren = new EstacioTren(nomEstacio);
        this.estacioTren.inicialitzaDadesEstacioTren();
        this.scanner = new Scanner(System.in);
    }

    public void gestioEstacioTren() throws ExcepcioEstacio {
        // Definimos las opciones del menú
        MenuOption[] options = MenuOption.values();
        // Creamos el menú
        Menu<MenuOption> menu = new Menu<>("Menú Principal", options);

        boolean exit = false;
        while (!exit) {
            menu.mostrarMenu();
            MenuOption selectedOption = menu.getOpcio(scanner);
            switch (selectedOption) {
                case LISTAR_VIAS:
                    System.out.println(estacioTren.getLlistaVies().llistarVies());
                    break;
                case LISTAR_VIAS_ABIERTAS:
                    System.out.println(estacioTren.getLlistaVies().llistarVies("Oberta"));
                    break;
                case LISTAR_VIAS_CERRADAS:
                    System.out.println(estacioTren.getLlistaVies().llistarVies("Tancada"));
                    break;
                case LISTAR_ACCESOS_ABIERTOS:
                    System.out.println(estacioTren.getLlistaAccessos().llistarAccessos(true));
                    break;
                case LISTAR_ACCESOS_CERRADOS:
                    System.out.println(estacioTren.getLlistaAccessos().llistarAccessos(false));
                    break;
                case LISTAR_INCIDENCIAS:
                    System.out.println(estacioTren.getLlistaIncidencies().llistarIncidencies());
                    break;
                case AGREGAR_INCIDENCIA :
                    try {
        
                        System.out.println("Introdueix el nombre de la incidència a afegir: ");
                        int numIncidencia = scanner.nextInt();
                        scanner.nextLine();  // Limpiar el buffer del scanner
        
                        System.out.println("Introdueix el tipus de la incidència (Reparacio, Objecte o Tancament): ");
                        String tipoIncidenciaStr = scanner.nextLine();
                        // TipusIncidencia tipoIncidencia = TipusIncidencia.valueOf(tipoIncidenciaStr.toUpperCase());
        
                        System.out.println("Introdueix el nom de la via:");
                        String nombreVia = scanner.nextLine();
                        Via viaSeleccionada = estacioTren.getLlistaVies().getVia(nombreVia);
        
                        if (viaSeleccionada == null) {
                            System.out.println("La via amb nom '" + nombreVia + "' no va ser trobada.");
                            break;
                        }
        
                        LocalDate fechaActual = LocalDate.now();
                        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                        String fechaFormateada = fechaActual.format(formato);
                        estacioTren.getLlistaIncidencies().afegirIncidencia(numIncidencia, tipoIncidenciaStr, viaSeleccionada, fechaFormateada);
        
                        System.out.println("Incidència agregada reeixidament.");
                    } catch (ExcepcioEstacio e) {
                        System.out.println("Error en agregar la incidència: " + e.getMessage());
                    }
                    break;
                
                case ELIMINAR_INCIDENCIA:
                    try {
                        System.out.println(estacioTren.getLlistaIncidencies().llistarIncidencies());
                        System.out.print("Introdueix el nombre de la incidència a eliminar: ");
                        int numeroIncidenciaEliminar = scanner.nextInt();
                        scanner.nextLine(); // Limpiar el buffer del scanner

                        // Obtener la incidencia a eliminar
                        Incidencia incidenciaEliminar = estacioTren.getLlistaIncidencies().getIncidencia(numeroIncidenciaEliminar);
                        estacioTren.getLlistaIncidencies().eliminarIncidencia(incidenciaEliminar);
                        System.out.println("Incidència eliminada reeixidament. ");
                    } catch (ExcepcioEstacio e) {
                        System.out.println("Error en eliminar la incidència: " + e.getMessage());
                    }
                    break;
                   
                case CALCULAR_ACCESOS:
                    System.out.println(estacioTren.getLlistaAccessos().calculaAccessosAccessibles()); 
                    break;
                case CALCULAR_LONGITUD:
                    System.out.println(estacioTren.getLlistaAccessos().calculaLongitudAccessosNivell());
                    break;
                case GUARDAR_ESTACION:
                    try {
                        System.out.print("Introdueix la ruta on vols desar les dades de l'estació de tren: ");
                        String rutaGuardat = scanner.nextLine();
                        estacioTren.guardar(rutaGuardat);
                        
                    } catch (ExcepcioEstacio e) {
                        System.out.println("Error en desar les dades de l'estació de tren: " + e.getMessage());
                    }
                    break;
                    
                case RECUPERAR_ESTACION:
                    try {
                        System.out.print("Introdueix la ruta des d'on vols carregar les dades de l'estació de tren: ");
                        String rutaCarrega = scanner.nextLine();
                        EstacioTren estacioTrenCarregada = EstacioTren.carregar(rutaCarrega);
                        estacioTren = estacioTrenCarregada;
                    } catch (ExcepcioEstacio e) {
                        System.out.println("Error en carregar les dades de l'estació de tren: " + e.getMessage());
                    }
                    break;
                    
                case SALIR:
                    exit = true;
                    System.out.println("Saliendo del programa...");
                    break;
            }
        }
    }
}