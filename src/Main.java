public class Main {
    public static void main(String[] args) {

        System.out.println("Iniciando...");

        /**
         * Código para ejecutar por un administrativo de la empresa.
         * Código para introducir información de procesadores.
         */

        Autonomos selfemployed = new Autonomos();

        selfemployed.setCodcli(1);
        selfemployed.setNombre("Diego Lopez");
        selfemployed.setApellido("Dragones");
        selfemployed.setDni("Fantasia");
        selfemployed.setDirecpos("1/2/2003");
        selfemployed.setPobla("Fantasia");
        selfemployed.setProvin("1/2/2003");
        selfemployed.setEmail("Fantasia");
        selfemployed.setTelefono(87987974);

        System.out.println(selfemployed.getCodcli());
        System.out.println(selfemployed.getNombre());
        System.out.println(selfemployed.getApellido());
        System.out.println(selfemployed.getDni());
        System.out.println(selfemployed.getDirecpos());
        System.out.println(selfemployed.getPobla());
        System.out.println(selfemployed.getProvin());
        System.out.println(selfemployed.getEmail());
        System.out.println(selfemployed.getTelefono());

        Facturas bills = new Facturas();
        bills.setCodfactura(213);
        bills.setFechafactura("Lopez");
        bills.setCodcli(1);
        bills.setCodpro("17/8/2000");
        bills.setCodser("Lopez");
        bills.setBaseimp("Calle Arroz");
        bills.setTotal("17/8/2000");

        System.out.println(bills.getCodfactura());
        System.out.println(bills.getFechafactura());
        System.out.println(bills.getCodcli());
        System.out.println(bills.getCodpro());
        System.out.println(bills.getCodser());
        System.out.println(bills.getBaseimp());
        System.out.println(bills.getTotal());


        Impresion print = new Impresion();

        print.setCodfacturas(1);
        print.setNifcliente("Garcia");
        print.setNombrecliente("70800900A");
        print.setDircliente("Calle Cocido");
        print.setPoblacioncliente("FAF");
        print.setProvinciacliente("70800900A");
        print.setBaseimp("Calle Cocido");
        print.setTotal("AFAF");

        System.out.println(print.getCodfacturas());
        System.out.println(print.getNifcliente());
        System.out.println(print.getNombrecliente());
        System.out.println(print.getDircliente());
        System.out.println(print.getPoblacioncliente());
        System.out.println(print.getProvinciacliente());
        System.out.println(print.getBaseimp());
        System.out.println(print.getTotal());

        Productos product = new Productos();

        product.setCodpro(1);
        product.setNombre("Garcia");
        product.setMarca("70800900A");
        product.setModelo("");
        product.setPrecio("Garcia");
        product.setIva("70800900A");


        System.out.println(product.getCodpro());
        System.out.println(product.getNombre());
        System.out.println(product.getMarca());
        System.out.println(product.getModelo());
        System.out.println(product.getPrecio());
        System.out.println(product.getIva());

        Servicios service = new Servicios();

        service.setCodcli(1);
        service.setNombre("Garcia");
        service.setMarca("70800900A");
        service.setModelo("");
        service.setPrecio("Garcia");
        service.setIva("70800900A");


        System.out.println(service.getCodcli());
        System.out.println(service.getNombre());
        System.out.println(service.getMarca());
        System.out.println(service.getModelo());
        System.out.println(service.getPrecio());
        System.out.println(service.getIva());

        Sociedades societies = new Sociedades();

        societies.setCodcli(1);
        societies.setRazonSoc("Garcia");
        societies.setCif(2);
        societies.setDirecionpos("Garcia");
        societies.setPoblacion("Pepe");
        societies.setProvincia("Garcia");
        societies.setEmail("Pepe");
        societies.setTelefono(1414242424);


        System.out.println(societies.getCodcli());
        System.out.println(societies.getRazonSoc());
        System.out.println(societies.getCif());
        System.out.println(societies.getDirecionpos());
        System.out.println(societies.getPoblacion());
        System.out.println(societies.getProvincia());
        System.out.println(societies.getEmail());
        System.out.println(societies.getTelefono());
}
}