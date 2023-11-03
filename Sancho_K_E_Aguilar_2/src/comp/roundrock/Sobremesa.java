package comp.roundrock;

public class Sobremesa extends Computadora{

    private String subFamilia;
    public Sobremesa(){
        super.setFamilia("Sobremesa");
    }

    public String ToString(){
        return "Familia: " + getFamilia() +
                "\nPrecio: " + getPrecio() +
                "\nComponentes: " + getListaComponentes() +
                "\nSub Familia: " + subFamilia +
                "\nRating: " + getRating();
    }
}
