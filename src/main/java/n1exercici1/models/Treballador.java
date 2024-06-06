package n1exercici1.models;

public class Treballador {

    // ATRIBUTS

    private String nom;
    private String cognom;
    private double preuHora;

    // CONSTRUCTOR

    public Treballador(String nom, String cognom, double preuHora){
        this.nom      = nom;
        this.cognom   = cognom;
        this.preuHora = preuHora;
    }

    // GETTERS & SETTERS

    public String getNom() {
        return nom;
    }

    public String getCognom() {
        return cognom;
    }

    public double getPreuHora() {
        return preuHora;
    }

    // MÈTODES

    public double calcularSou (double horesTreballades){
        return horesTreballades * preuHora;
    }
}
