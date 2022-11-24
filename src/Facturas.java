public class Facturas {
    private Integer codfactura;
    private String fechafactura;
    private Integer codcli;
    private String codpro;
    private String codser;
    private String baseimp;
    private String total;


    /**
     * Metodos, secciones, comportamiento,
     */

    public Integer getCodfactura() {
        return codfactura;
    }

    public void setCodfactura(Integer codfactura) {
        this.codfactura = codfactura;
    }

    public String getFechafactura() {
        return fechafactura;
    }

    public void setFechafactura(String fechafactura) {
        this.fechafactura = fechafactura;
    }
    public Integer getCodcli() {
        return codcli;
    }

    public void setCodcli(Integer codcli) {
        this.codcli = codcli;
    }
    public String getCodpro() {
        return codpro;
    }
    public void setCodpro(String codpro) {
        this.codpro = codpro;
    }

    public String getCodser() {
        return codser;
    }
    public void setCodser(String codser) {
        this.codser = codser;
    }

    public String getBaseimp() {
        return baseimp;
    }
    public void setBaseimp(String baseimp) {
        this.baseimp = baseimp;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }
}
