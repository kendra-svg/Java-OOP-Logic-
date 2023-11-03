package comp.roundrock;

public class Servidor extends Computadora {

    public Servidor() {super.setFamilia("Servidor");}

    public String ToString(){
        return "Familia: " + getFamilia() +
                "\nPrecio: " + getPrecio() +
                "\nComponentes: " + getListaComponentes() +
                "\nRating: " + getRating();
    }
}
