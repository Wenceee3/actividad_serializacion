package BibliotecaLibros;

public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Titulo1", "Cervantes", "123123", 19.99, 0.10);
        Libro libro2 = new Libro("Titulo2", "Gongora", "456456", 25.50, 0.15);
        Libro libro3 = new Libro("Titulo3", "Juan", "789789", 30.00, 0.20);

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);

        biblioteca.mostrarLibros();

        biblioteca.serializarBiblioteca("biblioteca.ser");

        biblioteca.deserializarBiblioteca("biblioteca.ser");

    }
}
