/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana9;

/**
 *
 * @author Carlos Juca
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        double suma;
        double promedio;
        double[] calificacion_progr = {18, 19, 15, 16, 17, 10};
        double[] calificacion_bd = {10, 12, 13, 20, 17, 20};
        double[] promedios = new double[6];

        for (int i = 0; i < calificacion_progr.length; i++) {
            suma = calificacion_progr[i] + calificacion_bd[i];
            promedio = suma / 2;
            promedios[i] = promedio;
        }
        System.out.println("TABLA DE CALIFICACIONES");
        for (int j = 0; j < calificacion_bd.length; j++) {
            System.out.printf("%s %d\t\t%.1f\t%.1f\t%.1f\n", "Estdudiante #", j + 1, calificacion_progr[j], calificacion_bd[j], promedios[j]);
        }
    }
}
