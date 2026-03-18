
public class Film {

    private String title;
    private int year;

    public Film (String title, int year)
    {
        this.title = title;
        this.year = year;
    }

    //Sobreescribimos el metodo toString para darle formato a la salida, sin este metodo sobreescrito, el formato interno del println en el main devolveria caracteres raros
    // Basicamente se quiere imprimir un objeto con formato legible que por defecto Java maneja en nombre de la clase + código hexadecimal que es el hashcode del objeto.
    @Override
    public String toString() {
        return title + " (" + year + ")";
    }
}
