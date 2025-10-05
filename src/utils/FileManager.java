package utils;

import java.io.*;
import java.util.List;

/**
 * Clase utilitaria para la gestión de archivos que permite exportar y leer listas
 * genéricas de objetos en formatos CSV y binario (.dat).
 */
public class FileManager {

    /**
     * Metodo genérico para exportar cualquier lista a un archivo CSV.
     * Cada elemento de la lista se escribe en una línea usando su metodo toString().
     *
     * @param lista Lista genérica de elementos a exportar.
     * @param path Ruta del archivo destino.
     */
    public static <T> void exportarArchivoCsv(List<T> lista, String path) {
        File file = new File(path);
        PrintWriter printWriter = null;

        try {
            printWriter = new PrintWriter(new FileWriter(file));
            for (T ele : lista) { //Recorremos la lista y escribimos cada ele en una línea
                printWriter.println(ele.toString()); // toString define el contenido
            }
        } catch (IOException e) {
            System.out.println("Error al escribir CSV: ");
        } finally {
            printWriter.close();
        }
    }


    /**
     * Metodo genérico para exportar cualquier lista de objetos serializables a un archivo binario (.dat).
     *
     * @param lista Lista genérica de objetos que implementan Serializable.
     * @param path Ruta del archivo destino.
     */
    public static <T extends Serializable> void exportarArchivoDat(List<T> lista, String path) {
        File file = new File(path);
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            fos = new FileOutputStream(file); //Abrimos flujo
            oos = new ObjectOutputStream(fos); //Serializamos toda la lista
            oos.writeObject(lista); //Escribimos lista serializada en el archivo
        } catch (FileNotFoundException e) {
            System.out.println("El fichero no existe");
        } catch (IOException ex) {
            System.out.println("No tienes permisos de escritura");
        } finally {
            try {
                oos.close();
            } catch (IOException e) {
                System.out.println("Error en el cerrado");
            }
        }
    }


    /**
     * Metodo para leer un archivo CSV y mostrar su contenido línea a línea por consola.
     *
     * @param path Ruta del archivo CSV a leer.
     */
    public static void leerArchivoCsv(String path) {
        File file = new File(path);
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(file));

            String linea;
            while ((linea = reader.readLine()) != null) { //Leemos hasta que no queden más líneas
                System.out.println(linea); //Mostramos cada linea en consola
            }

        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        } catch (IOException e) {
            System.out.println("Error en la lectura del archivo");
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                System.out.println("Error al cerrar el archivo CSV");
            }
        }
    }


    /**
     * Metodo genérico para leer un archivo binario (.dat) que contiene una lista de objetos serializables,
     * y mostrar cada objeto en consola.
     *
     * @param path Ruta del archivo binario a leer.
     * @param <T> Tipo genérico que debe implementar Serializable.
     */
    public static <T extends Serializable> void leerArchivoDat(String path) {

        File file = new File(path);
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            fis = new FileInputStream(file); //Abrimos flujo
            ois = new ObjectInputStream(fis); //Deserializamos objetos

            List<T> lista = (List<T>) ois.readObject(); // Leemos lista y la casteamos

            for (T ele : lista) { //Recorremos la lista y mostramos cada objeto
                System.out.println(ele);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error, el fichero no se encuentra");
        } catch (IOException e) {
            System.out.println("No tienes permisos de lectura");
        } catch (ClassNotFoundException e) {
            System.out.println("Error en la clase de lectura");
        } finally {
            try {
                ois.close();
            } catch (IOException e) {
                System.out.println("Error en el cerrado");
            }
        }
    }

}
