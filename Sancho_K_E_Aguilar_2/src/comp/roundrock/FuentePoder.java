package comp.roundrock;

public class FuentePoder extends Componente {

    private String duracionBateria;

    public String getDuracionBateria() {
        return duracionBateria;
    }

    public void setDuracionBateria(String duracionBateria) {
        this.duracionBateria = duracionBateria;
    }

    public FuentePoder(int rating, String tipoComponente, int idComponente, double precio, String duracionBateria) {
        super(rating, tipoComponente, idComponente, precio);
        this.duracionBateria = duracionBateria;
        super.setTipoComponente("Fuente de Poder");
    }


    @Override
    public String toString() {
        return "Tipo de componente: " + getTipoComponente() +
                "\nDuración de la batería: " + getDuracionBateria() +
                "\nPrecio: " + getPrecio() +
                "\nId Componente: " + getIdComponente() +
                "\nRating: " + getRating();


    }

}