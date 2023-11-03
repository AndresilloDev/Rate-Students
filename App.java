import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        char continuar;
        int contadorEstudiantes = 0;
        int sumaCalificaciones = 0;
        int calificacionMaxima = Integer.MIN_VALUE;
        int calificacionMinima = Integer.MAX_VALUE;

        do {
            System.out.println("Ingrese la calificación del estudiante #" + (contadorEstudiantes + 1) + ":");
            int calificacion = read.nextInt();

            if (calificacion >= 0 && calificacion <= 100) {
                contadorEstudiantes++;
                sumaCalificaciones += calificacion;

                if (calificacion > calificacionMaxima) {
                    calificacionMaxima = calificacion;
                }

                if (calificacion < calificacionMinima) {
                    calificacionMinima = calificacion;
                }

                if (calificacion >= 60) {
                    System.out.println("Aprobado");
                } else {
                    System.out.println("Reprobado");
                }
            } else {
                System.out.println("Calificación inválida. Debe estar entre 0 y 100.");
            }

            System.out.println("¿Desea ingresar calificaciones para otro estudiante? (s/n):");
            continuar = read.next().charAt(0);
        } while (continuar == 's' || continuar == 'S');

        if (contadorEstudiantes > 0) {
            double promedio = (double) sumaCalificaciones / contadorEstudiantes;
            System.out.println("Promedio: " + promedio);
            System.out.println("Calificación más alta: " + calificacionMaxima);
            System.out.println("Calificación más baja: " + calificacionMinima);
        } else {
            System.out.println("No se ingresaron calificaciones.");
        }
        read.close();
    }
}
