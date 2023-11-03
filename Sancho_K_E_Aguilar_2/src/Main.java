import comp.roundrock.Controller.ComponenteControlador;
import comp.roundrock.Controller.FamiliaControlador;
import comp.roundrock.DAO.ComponenteDAO;
import comp.roundrock.DAO.FamiliaDAO;
import comp.roundrock.DAO.Memory.ComponenteDAOMemoria;
import comp.roundrock.DAO.Memory.FamiliaDAOMemoria;
import comp.roundrock.View.Vista;
import comp.roundrock.Utilitarios.Utils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ComponenteDAO componenteDAO = new ComponenteDAOMemoria();
        Vista vista = new Vista();
        ComponenteControlador componenteControlador = new ComponenteControlador(componenteDAO, vista);
        componenteControlador.registrarComponente();
        FamiliaDAO familiaDAO = new FamiliaDAOMemoria();
        //FamiliaControlador familiaControlador = new FamiliaControlador(familiaDAO, vista);

        Scanner scanner = new Scanner(System.in);
        int opcion;
        String[] opciones = null;
        String seleccion = null;

        do {


            opciones = new String[]{
                    "Registrar Componente",
                    "Listar componente",
                    "Registrar familia de computadoras",
                    "Listar familias",
                    "Agregar componentes permitidos a una familia",
                    "Salir"};
            opcion = Utils.seleccionarElementoTexto("MENU", opciones);
            opcion--; // para volverlo base 0 y poder escoger del arreglo
            seleccion = opciones[opcion];

            switch (seleccion) {
                case "Registrar Componente":
                    componenteControlador.registrarComponente();
                    break;
                case "Listar componente":
                    componenteControlador.listarComponente();
                   break;
                //case "Registrar familia de computadoras":
                    //FamiliaControlador.agregarFamilia();
                    //break;
                //case "Listar familias":
                    //FamiliaControlador.listarFamilia();
                    //break;
                //case "Agregar componentes permitidos a una familia":
                   // FamiliaControlador.agregarComponentePermitido();
                    //break;
            }
        } while (opcion != opciones.length - 1); // Mientras no sea la última opción (salir siempre es la última)
    }
}