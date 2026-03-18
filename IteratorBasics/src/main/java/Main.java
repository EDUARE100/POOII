

public class Main {
    static Film[] filmVector = new Film[10]; //Instanciamos el arreglo debido a la gestión de memoria de Java, reservamos memoria, definimos un límite fijo y es nuestro
    // puente entre la clase main y MyMarvelCollection, este es el path por asi decirlo
    // Se crea el array (filmVector) -> se pasa a la colección (var myCol = new MyMarvelCollection (filmVector)); Al instanciarlo como static se hace global el array
    // Es necesario como creacion del array para guardar las peliculas ahi y es la unica forma que vi para que la variable se convierta en un objeto real
     public static void main(String[] args) {

        var myCol = new MyMarvelCollection (filmVector);
        myCol.add (new Film ("Ironman", 2008));
        myCol.add (new Film ("Captain America", 2010));
        myCol.add (new Film ("The Avengers", 2012));

        var iterator = myCol.iterator ();
        while (iterator.hasNext ()) {
            System.out.println (iterator.next ());
        }

        System.out.println();

        for (var film: myCol) {
            System.out.println (film);
        }

    }
}