package comp.roundrock;

public class TarjetaVideo extends Componente {
    private String modelo;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public TarjetaVideo(int rating, String tipoComponente, int idComponente, double precio, String modelo) {
        super(rating, tipoComponente, idComponente, precio);
        super.setTipoComponente("Tarjeta de Video");
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Tipo de componente: " + getTipoComponente() +
                "\nModelo: " + getModelo() +
                "\nPrecio: " + getPrecio() +
                "\nId Componente: " + getIdComponente() +
                "\nRating: " + getRating();


    }

}