package n1exercici2;

import n1exercici2.models.TreballadorOnline;
import n1exercici2.models.TreballadorPresencial;

public class n1exercici2 {

    @SuppressWarnings("deprecation")
    public static void runProgram (){

        TreballadorPresencial treballador1 = new TreballadorPresencial("Arnau", "Alvarez", 40);
        TreballadorOnline treballador2 = new TreballadorOnline("Clara", "Pagès", 20.5);

        System.out.println("Aquest mes, el sou del treballador presencial és de: " +
                treballador1.calcularSou(40) + " euros.");
        System.out.println("Aquest mes, el sou del treballador online és de: " +
                treballador2.calcularSou(35) + " euros.");

        System.out.println("Aquest any, el sou del treballador presencial és de: " +
                treballador1.calcularSouAnual(40) + " euros.");
        System.out.println("Aquest any, el sou del treballador online és de: " +
                treballador2.calcularSouAnual(35) + " euros.");
            }
}
