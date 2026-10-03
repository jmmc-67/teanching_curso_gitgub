import java.util.Scanner;

// Autor: José Manuel Montes Castillo
public class MovimientoVertical {
    
    // Constante para gravedad
    static final double GRAVEDAD = 9.81;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("\nMOVIMIENTO VERTICAL");
            System.out.println("1. Calcular altura de caída libre dado el tiempo");
            System.out.println("2. Calcular tiempo de caída dada la altura");
            System.out.println("3. Calcular velocidad final en caída libre dado el tiempo");
            System.out.println("4. Calcular velocidad final en caída libre dada la altura");
            System.out.println("5. Calcular altura máxima de un lanzamiento vertical");
            System.out.println("6. Calcular tiempo para alcanzar la altura máxima");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Tiempo (s): ");
                    double t1 = entrada.nextDouble();
                    if (t1 < 0) {
                        System.out.println("ERROR: El tiempo no puede ser negativo.");
                    } else {
                        double h1 = calcularAlturaDadoTiempo(t1);
                        System.out.println("h = (1/2) * " + GRAVEDAD + " * (" + t1 + ")^2");
                        System.out.println("Altura = " + h1 + " m");
                    }
                    break;
                case 2:
                    System.out.print("Altura (m): ");
                    double h2 = entrada.nextDouble();
                    if (h2 < 0) {
                        System.out.println("ERROR: La altura no puede ser negativa.");
                    } else {
                        double t2 = calcularTiempoDadoAltura(h2);
                        System.out.println("Tiempo = " + t2 + " s");
                    }
                    break;
                case 3:
                    System.out.print("Tiempo (s): ");
                    double t3 = entrada.nextDouble();
                    if (t3 < 0) {
                        System.out.println("ERROR: El tiempo no puede ser negativo.");
                    } else {
                        double v3 = calcularVelocidadDadoTiempo(t3);
                        System.out.println("Velocidad = " + v3 + " m/s");
                    }
                    break;
                case 4:
                    System.out.print("Altura de caída (m): ");
                    double h4 = entrada.nextDouble();
                    if (h4 < 0) {
                        System.out.println("ERROR: La altura no puede ser negativa.");
                    } else {
                        double v4 = calcularVelocidadDadoAltura(h4);
                        System.out.println("Velocidad = " + v4 + " m/s");
                    }
                    break;
                case 5:
                    System.out.print("Ingrese la rapidez inicial (m/s): ");
                    double v0_5 = entrada.nextDouble();
                    if (v0_5 < 0) {
                        System.out.println("ERROR: La rapidez inicial debe ser positiva.");
                    } else {
                        double hmax = calcularAlturaMaxima(v0_5);
                        System.out.println("Altura máxima = " + hmax + " m");
                    }
                    break;
                case 6:
                    System.out.print("Ingrese la rapidez inicial (m/s): ");
                    double v0_6 = entrada.nextDouble();
                    if (v0_6 < 0) {
                        System.out.println("ERROR: La rapidez inicial debe ser positiva.");
                    } else {
                        double tMax = calcularTiempoAlturaMaxima(v0_6);
                        System.out.println("Tiempo = " + tMax + " s");
                    }
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("ERROR: Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 7);
        
        entrada.close();
    }

    // Métodos modulares
    static double calcularAlturaDadoTiempo(double tiempo) {
        return 0.5 * GRAVEDAD * Math.pow(tiempo, 2);
    }

    static double calcularTiempoDadoAltura(double altura) {
        return Math.sqrt((2 * altura) / GRAVEDAD);
    }

    static double calcularVelocidadDadoTiempo(double tiempo) {
        return GRAVEDAD * tiempo;
    }

    static double calcularVelocidadDadoAltura(double altura) {
        return Math.sqrt(2 * GRAVEDAD * altura);
    }

    static double calcularAlturaMaxima(double velocidadInicial) {
        return Math.pow(velocidadInicial, 2) / (2 * GRAVEDAD);
    }

    static double calcularTiempoAlturaMaxima(double velocidadInicial) {
        return velocidadInicial / GRAVEDAD;
    }
}