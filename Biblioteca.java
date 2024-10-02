package BibliotecaLibros;

import java.io.*;
import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> Libros;

    public Biblioteca() {
        Libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        Libros.add(libro);
    }

    public void mostrarLibros() {
        for (Libro libro : Libros) {
            System.out.println(libro);
        }
    }

    public void serializarBiblioteca(String archivo) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))) {
            oos.writeObject(Libros);
            System.out.println("La Biblioteca ha sido serializada correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void deserializarBiblioteca(String archivo) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            Libros = (ArrayList<Libro>) ois.readObject();
            System.out.println("La Biblioteca ha sido deserializada correctamente.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

