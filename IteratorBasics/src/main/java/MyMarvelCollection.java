
import java.util.Iterator; //Importamos la libreria Iterator para poder usar la interfaz Iterable, para que pueda recorrer el objeto sin necesidad
// de implementar un import de List, ArrayList, LinkedList, etc

// Implementamos Iterable para poder usar for each
public class MyMarvelCollection implements Iterable <Film> {
    // Definir comportamiento de colección
    private Film[] data; //Es el arreglo fisico donde se guardan los objetos, Se usa un array simple
    private int count = 0; //Es un puntero, este valdra lo mismo que el arreglo tenga de espacio

    //Recibe la referencia del arreglo que viene desde Main. Esto vincula la coleccion al espacio de memoria reservado
    public MyMarvelCollection (Film[] filmVector) {
        this.data = filmVector;
    }


    // Metodo para añadir peliculas al arreglo
    public void add(Film film) {
        if (count < data.length){ //Primero verifica que el arreglo no este lleno
            data[count] = film; //Si se cumple la condicion se asigna una pelicula a la posicion actual de count
            count++; //Se incrementa count para que pase a la siguiente posicion del arreglo y se guarde la proxima pelicula
        }
    }

    // Metodo que sobreescribe, cada vez que el main inicio un ciclo for, se crea una nueva instancia de la clase interna, permitiendo que el recorrido siempre inicie en 0
    @Override
    public Iterator <Film> iterator() {
        return new MyMarvelIterator();
    }

    // Clase interna, para localizar o mantener la ubicacion para moverse dentro del arreglo, implementa iterator film, lo que obliga a sobreescribir los métodos
    // hasNext(), compara la posición actual del iterador, contra el numero de peliculas reales guardadas, si index es 0 y count 3, devuelve true, Si index = 3 devuelve false
    // next(), Retorna la pelicula en posición actual, el operador incrementa de acuerdo al retorno del resultado, el index sube a uno para la siguiente llamada
    public class MyMarvelIterator implements Iterator<Film> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < count;
        }

        @Override
        public Film next() {
            return data[index++];
        }
    }
}
