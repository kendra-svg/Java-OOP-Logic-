package comp.roundrock;

public class Escolar extends Computadora{
    public Escolar() {super.setFamilia("Escolar");}

    public String toString() {
        return "Familia: " + getFamilia() +
                "\nPrecio: " + getPrecio() +
                "\nComponentes: " + getListaComponentes() +
                "\nRating: " + getRating();
    }

}
