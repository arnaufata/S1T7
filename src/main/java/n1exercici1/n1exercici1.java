package n1exercici1;

import n1exercici1.models.TreballadorOnline;
import n1exercici1.models.TreballadorPresencial;

public class n1exercici1 {
    public static void runProgram (){

        TreballadorPresencial treballador1 = new TreballadorPresencial("Arnau", "Alvarez", 40);
        TreballadorOnline treballador2 = new TreballadorOnline("Clara", "Pagès", 20.5);

        System.out.println("Aquest mes, el sou del treballador presencial és de: " +
                treballador1.calcularSou(40) + " euros.");
        System.out.println("Aquest mes, el sou del treballador online és de: " +
                treballador2.calcularSou(35) + " euros.");
    }
}
