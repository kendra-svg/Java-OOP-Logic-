package comp.roundrock;

public class Procesador extends Componente {

    private String cantidadNucleos;

    public String getCantidadNucleos() {
        return cantidadNucleos;
    }

    public void setCantidadNucleos(String cantidadNucleos) {
        this.cantidadNucleos = cantidadNucleos;
    }

    public Procesador(int rating, String tipoComponente, int idComponente, double precio, String cantidadNucleos) {
        super(rating, tipoComponente, idComponente, precio);
        super.setTipoComponente("Procesador");
        this.cantidadNucleos = cantidadNucleos;
    }

    @Override
    public String toString() {
        return "Tipo de componente: " + getTipoComponente() +
                "\nCantidad de Núcleos: " + getCantidadNucleos() +
                "\nPrecio: " + getPrecio() +
                "\nId Componente: " + getIdComponente() +
                "\nRating: " + getRating();


    }
}
