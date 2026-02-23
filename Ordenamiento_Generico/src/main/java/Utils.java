
public class Utils {

    /*Necesito crear metodos para unboxing ya que de manera primitiva osea variables tipo int, float, etc
     la clase generica no acepta este tipo de datos, serán metodos puente que realicen boxing */

    public static int[] ordena(int[] array){
        Integer[] temp = new Integer[array.length]; /* Creamos un array temporal de tipo integer,
        lo creo de tipo integer porque mi metodo generico solo acepta de tipo objeto se reserva de manera
        temporal espacio de memoria de tipo objeto */

        /* Proceso de boxing que es extrapolar del array de enteros tipo int a un arreglo de tipo integer
        * java automaticamente hace boxing (AutoBoxing) un int a un integer para guardarlo en temp[i] */
        for(int i = 0; i < array.length; i++) temp[i] = array[i];

        //Se envian los objetos del metodo de quicksort, aqui la T se transforma en tipo Integer
        Integer[] ordenado = ordenagenerico(temp);
        //Creamos un nuevo arreglo de tipo entero (int) para ir vaciando los resultados en ese nuevo array
        int[] resultado = new int[array.length];
        /*Proceso de unboxing, toma cada objeto ya ordenado y lo extrae para guardarlo en el nuevo
        arreglo de tipo entero(int) */
        for(int i = 0; i < array.length; i++) resultado[i] = ordenado[i];

        return resultado;
    }

    public static float[] ordena(float[] array){
        Float[] temp = new Float[array.length];
        for(int i = 0; i < array.length; i++) temp[i] = array[i];

        Float[] ordenado = ordenagenerico(temp);

        float[] resultado = new float[array.length];
        for(int i = 0; i < array.length; i++) resultado[i] = ordenado[i];
        return resultado;
    }

    /* Se crea una clase publica estática donde se le indica un parámetro de tipo genérico, que es basicamente
    un marcador de posición, representa un dato que aun no conocemos pero que se definirá al momento de ser
    usado T = Type, en este caso se usará para filtrar números y que ademas sean comparables entre si con
    el metodo Comparable para usar el metodo CompareTo para numeros de tipo integer y tipo float. */
    public static <T extends Number & Comparable<T>> T[] ordenagenerico(T[] array) {
        quicksort(array,0, array.length - 1);
        return array;
    }

    private static <T extends Number & Comparable<T>> void quicksort(T[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);
            quicksort(array, low, pi - 1);
            quicksort(array, pi + 1, high);
        }
    }
    /*La T, funciona como una variable de tipo universal entre NUMEROS ya que se le indico solo numeros, se
     transforma en el momento indicado */
    private static <T extends Number & Comparable<T>> int partition(T[] array, int low, int high) {
        T pivot = array[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (array[j].compareTo(pivot) <= 0) {
                i++;
                T temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        T temp = array[i + 1];
        array[i+1] = array[high];
        array[high] = temp;
        return i + 1;
    }

    // Sobrecarga de métodos
    public static <T> void Imprimir(int array[]){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static <T> void Imprimir(float array[]){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
