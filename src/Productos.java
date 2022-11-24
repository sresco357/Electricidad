public class Productos {
    private Integer codpro;
    private String nombre;
    private String marca;
    private String modelo;
    private String precio;
    private String iva;


    /**
     * Metodos, secciones, comportamiento,
     */
    public Integer getCodpro() {
        return codpro;
    }
    public void setCodpro(Integer codpro) {
        this.codpro = codpro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPrecio() {
        return precio;
    }
    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getIva() {
        return iva;
    }
    public void setIva(String iva) {
        this.iva = iva;
    }

}
