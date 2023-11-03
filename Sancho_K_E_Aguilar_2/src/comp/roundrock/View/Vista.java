package comp.roundrock.View;
import comp.roundrock.*;
import comp.roundrock.Utilitarios.Utils;

import java.util.List;

public class Vista {

    public Componente capturarNuevoComponente() {

        Componente componente = null;
        String modelo, tipoComponente, categoria, capacidad, duracionBateria, opcionComponente, chipset;
        int rating, idComponente, cantidadNucleos, cantidadVentiladores;
        double precio;
        Utils.limpiar();

        Utils.establecerColorAzul();
        System.out.println("Registro de Componente:");
        Utils.reiniciarColores();
        opcionComponente = Utils.leerString(String.format("%-20s: ", "Tipo de componente (Seleccione una de las siguientes opciones)\n1.Ram \n2.Procesador \n3.Almacenamiento \n4.Fuente de Poder \n5.Tarjeta Madre \n6.Tarjeta de Video "));

        if (opcionComponente.equals("1")) {
            System.out.println("A continuación ingrese las siguientes características de la RAM");
            modelo = Utils.leerString(String.format("%-20s: ", "Modelo"));
            capacidad = Utils.leerString(String.format("%-20s: ", "Capacidad (Elija entre 64, 128, 256,  512, 1024 GB)"));
            idComponente = Utils.leerEntero(String.format("%-20s: ", "Identificador del componente"));
            tipoComponente = "Ram";
            rating = Utils.leerEntero(String.format("%-20s: ", "Rating"));
            precio = Utils.leerEntero(String.format("%-20s: ", "Precio"));

            Componente nuevoComp = new Ram(rating, tipoComponente, idComponente, precio, modelo, capacidad);
            componente = new Componente(rating, tipoComponente, idComponente, precio, modelo);


        } else if (opcionComponente.equals("2")) {
            System.out.println("A continuación ingrese las siguientes características del Procesador");
            modelo = Utils.leerString(String.format("%-20s: ", "Modelo"));
            cantidadNucleos = Utils.leerEntero((String.format("%-20s: ", "Cantidad de Nucleos")));
            idComponente = Utils.leerEntero(String.format("%-20s: ", "Identificador del componente"));
            tipoComponente = "Procesador";
            rating = Utils.leerEntero(String.format("%-20s: ", "Rating"));
            precio = Utils.leerEntero(String.format("%-20s: ", "Precio"));

            Componente nuevoComp = new Procesador(rating, tipoComponente, idComponente, precio, modelo, cantidadNucleos);
            componente = new Componente(rating, tipoComponente, idComponente, precio, modelo);

        } else if (opcionComponente.equals("3")) {
            System.out.println("A continuación ingrese las siguientes características de Almacenamiento");
            modelo = Utils.leerString(String.format("%-20s: ", "Modelo"));
            categoria = Utils.leerString((String.format("%-20s: ", "Categoria")));
            capacidad = Utils.leerString((String.format("%-20s: ", "Capacidad")));
            idComponente = Utils.leerEntero(String.format("%-20s: ", "Identificador del componente"));
            tipoComponente = "Almacenamiento";
            rating = Utils.leerEntero(String.format("%-20s: ", "Rating"));
            precio = Utils.leerEntero(String.format("%-20s: ", "Precio"));

            Componente nuevoComp = new Almacenamiento(rating, tipoComponente, idComponente, precio, categoria, capacidad, modelo);
            componente = new Componente(rating, tipoComponente, idComponente, precio, modelo);


        } else if (opcionComponente.equals("4")) {
            System.out.println("A continuación ingrese las siguientes características de la Fuente de Poder");
            modelo = Utils.leerString(String.format("%-20s: ", "Modelo"));
            duracionBateria = Utils.leerString((String.format("%-20s: ", "Duración de la batería")));
            idComponente = Utils.leerEntero(String.format("%-20s: ", "Identificador del componente"));
            tipoComponente = "Fuente de Poder";
            rating = Utils.leerEntero(String.format("%-20s: ", "Rating"));
            precio = Utils.leerEntero(String.format("%-20s: ", "Precio"));

            Componente nuevoComp = new FuentePoder(rating, tipoComponente, idComponente, precio, duracionBateria, modelo);
            componente = new Componente(rating, tipoComponente, idComponente, precio, modelo);

        } else if (opcionComponente.equals("5")) {
            System.out.println("A continuación ingrese las siguientes características de la Tarjeta Madre");
            modelo = Utils.leerString(String.format("%-20s: ", "Modelo"));
            chipset = Utils.leerString((String.format("%-20s: ", "Chipset")));
            idComponente = Utils.leerEntero(String.format("%-20s: ", "Identificador del componente"));
            tipoComponente = "Tarjeta Madre";
            rating = Utils.leerEntero(String.format("%-20s: ", "Rating"));
            precio = Utils.leerEntero(String.format("%-20s: ", "Precio"));

            Componente nuevoComp = new TarjetaMadre(rating, tipoComponente, idComponente, precio, chipset, modelo);
            componente = new Componente(rating, tipoComponente, idComponente, precio, modelo);
        } else if (opcionComponente.equals("6")) {
            System.out.println("A continuación ingrese las siguientes características de la Tarjeta de Video");
            modelo = Utils.leerString(String.format("%-20s: ", "Modelo"));
            cantidadVentiladores = Utils.leerEntero((String.format("%-20s: ", "Cantidad de Ventiladores")));
            idComponente = Utils.leerEntero(String.format("%-20s: ", "Identificador del componente"));
            tipoComponente = "Tarjeta de Video";
            rating = Utils.leerEntero(String.format("%-20s: ", "Rating"));
            precio = Utils.leerEntero(String.format("%-20s: ", "Precio"));

            Componente nuevoComp = new TarjetaVideo(rating, tipoComponente, idComponente, precio, modelo, cantidadVentiladores);
            componente = new Componente(rating, tipoComponente, idComponente, precio, modelo);

        } else
            opcionComponente = Utils.leerString(String.format("%-20s: ", "Opción Incorrecta\n(Seleccione una de las siguientes opciones)\n1.Ram \n2.Procesador \n3.Almacenamiento \n4.Fuente de Poder \n5.Tarjeta Madre \n6.Tarjeta de Video "));
        Utils.limpiar();
        return componente;
    }


    public void listarComponente(List<Componente> componentes) {
        boolean impar = false;
        Utils.limpiar();
        Utils.establecerColorAzul();
        System.out.printf("%-10s %-20s %-20s\n", "Tipo", "Precio", "Modelo");
        if (componentes != null && componentes.size() > 0) {
            for (Componente c : componentes) {
                impar = !impar;
                if (impar) {
                    Utils.establecerColorAmarillo();
                } else {
                    Utils.establecerColorVerde();
                }
                System.out.printf("%-10s %-20.2f %-20s\n", c.getTipoComponente(), c.getPrecio(), c.getModelo());
            }
            Utils.establecerColorMangenta();
            System.out.println("EOF");
        } else {
            Utils.establecerColorRojo();
            System.out.println("NO HAY DATOS");
        }
        Utils.reiniciarColores();
    }
}
