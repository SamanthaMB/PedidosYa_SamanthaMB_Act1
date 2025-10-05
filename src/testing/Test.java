package testing;

import model.Cliente;
import model.Pedido;
import utils.FileManager;
import utils.ListGenerator;

import java.util.List;

/**
 * Clase principal para probar la generación, exportación y lectura de datos de clientes y pedidos.
 *
 * Autor: Samantha Mohedano Barrena
 */

public class Test {

    public static void main(String[] args) {
        // Generación de listas de ejemplo de clientes y pedidos
        List<Cliente> listaClientes = ListGenerator.crearListaClientes();
        List<Pedido> listaPedidos = ListGenerator.crearListaPedidos();

        // Rutas de archivos para guardar/exportar la información
        String pathClientesCsv = "src/resources/clientes.csv";
        String pathClientesDat = "src/resources/clientes.dat";

        String pathPedidosCsv = "src/resources/pedidos.csv";
        String pathPedidosDat = "src/resources/pedidos.dat";

        // Exportación de listas de clientes a CSV y DAT
        FileManager.exportarArchivoCsv(listaClientes,pathClientesCsv);
        System.out.println("Lista Clientes CSV exportada en: " + pathClientesCsv);
        FileManager.exportarArchivoDat(listaClientes, pathClientesDat);
        System.out.println("Lista Clientes DAT exportada en: " + pathClientesDat);

        // Exportación de listas de pedidos a CSV y DAT
        FileManager.exportarArchivoCsv(listaPedidos,pathPedidosCsv);
        System.out.println("Lista Pedidos CSV exportada en: " + pathPedidosCsv);
        FileManager.exportarArchivoDat(listaPedidos,pathPedidosDat);
        System.out.println("Lista Pedidos DAT exportada en: " + pathPedidosDat);

        //Lectura de listas de clientes desde archivos CSV y DAT
        /*System.out.println("Lectura de la Lista Clientes CSV");
        FileManager.leerArchivoCsv(pathClientesCsv);
        System.out.println();//para dejar un espacio
        System.out.println("Lectura de la Lista Clientes DAT");
        FileManager.leerArchivoDat(pathClientesDat);
        System.out.println();

        // Lectura de listas de pedidos desde archivos CSV y DAT
        System.out.println("Lectura de la Lista Pedidos CSV");
        FileManager.leerArchivoCsv(pathPedidosCsv);
        System.out.println();
        System.out.println("Lectura de la Lista Pedidos DAT");
        FileManager.leerArchivoDat(pathPedidosDat);*/

    }

}