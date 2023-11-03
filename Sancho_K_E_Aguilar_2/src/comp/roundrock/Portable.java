package comp.roundrock;

public class Portable extends Computadora{

    private String subFamilia;
    private float peso;
    public Portable(){
        super.setFamilia("Portable");
    }

    public String ToString(){
        return "Familia: " + getFamilia() +
                "\nPrecio: " + getPrecio() +
                "\nComponentes: " + getListaComponentes() +
                "\nSub Familia: " + subFamilia +
                "\nPeso: " + peso +
                "\nRating: " + getRating();
    }
}
