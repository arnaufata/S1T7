package n1exercici2.models;

public class TreballadorOnline extends Treballador {

    // ATRIBUT(S)

    private static final double TARIFA_INTERNET = 70.0;

    // CONSTRUCTOR

    public TreballadorOnline(String nom, String cognom, double preuHora) {
        super(nom, cognom, preuHora);
    }

    // MÈTODES

    @Override
    public double calcularSou (double horesTreballades){
        return (horesTreballades * getPreuHora()) + TARIFA_INTERNET;
    }

    @Deprecated
    public double calcularSouAnual (double horesTreballades){
        return ((horesTreballades * getPreuHora()) + TARIFA_INTERNET) * 12;
    }
}
