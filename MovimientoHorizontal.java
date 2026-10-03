import java.util.Scanner;

// Autor: José Manuel Montes Castillo
public class MovimientoHorizontal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("\nMOVIMIENTO HORIZONTAL - MRU");
            System.out.println("1. Calcular distancia");
            System.out.println("2. Calcular rapidez");
            System.out.println("3. Calcular tiempo");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Rapidez del objeto (m/s): ");
                    double v1 = entrada.nextDouble();
                    System.out.print("Tiempo de movimiento (s): ");
                    double t1 = entrada.nextDouble();
                    
                    if (v1 < 0 || t1 < 0) {
                        System.out.println("ERROR: La rapidez y el tiempo no pueden ser negativos.");
                    } else {
                        double dist = calcularDistancia(v1, t1);
                        System.out.println("Distancia = " + v1 + " * " + t1);
                        System.out.println("Distancia recorrida = " + dist + " m");
                    }
                    break;
                case 2:
                    System.out.print("Distancia recorrida (m): ");
                    double d2 = entrada.nextDouble();
                    System.out.print("Tiempo (s): ");
                    double t2 = entrada.nextDouble();
                    
                    if (t2 <= 0) {
                        System.out.println("ERROR: El tiempo debe ser mayor que cero.");
                    } else if (d2 < 0) {
                        System.out.println("ERROR: La distancia no puede ser negativa.");
                    } else {
                        double rap = calcularRapidez(d2, t2);
                        System.out.println("Rapidez = " + d2 + " / " + t2);
                        System.out.println("Rapidez = " + rap + " m/s");
                    }
                    break;
                case 3:
                    System.out.print("Distancia recorrida (m): ");
                    double d3 = entrada.nextDouble();
                    System.out.print("Rapidez (m/s): ");
                    double v3 = entrada.nextDouble();
                    
                    if (v3 <= 0) {
                        System.out.println("ERROR: La rapidez debe ser mayor que cero.");
                    } else if (d3 < 0) {
                        System.out.println("ERROR: La distancia no puede ser negativa.");
                    } else {
                        double tiem = calcularTiempo(d3, v3);
                        System.out.println("Tiempo = " + d3 + " / " + v3);
                        System.out.println("Tiempo = " + tiem + " s");
                    }
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("ERROR: Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 4);
        
        entrada.close();
    }

    // Métodos para cálculos modulares
    static double calcularDistancia(double rapidez, double tiempo) {
        return rapidez * tiempo;
    }

    static double calcularRapidez(double distancia, double tiempo) {
        return distancia / tiempo;
    }

    static double calcularTiempo(double distancia, double rapidez) {
        return distancia / rapidez;
    }
}