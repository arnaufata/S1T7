package n1exercici1.models;

public class TreballadorPresencial extends Treballador{

    // ATRIBUT(S)

    public static double benzina = 150.0;

    // CONSTRUCTOR

    public TreballadorPresencial(String nom, String cognom, double preuHora){
        super(nom , cognom, preuHora);
    }

    // MÈTODES

    @Override
    public double calcularSou (double horesTreballades){
        return (horesTreballades * getPreuHora()) + benzina;
    }
}
