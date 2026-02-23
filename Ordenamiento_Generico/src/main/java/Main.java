
public class Main {
    static void main(String[] args) {
        //Declaracion de un arreglo de tipo primitivo
        int[] intVector = {101, 99, 12, 19, 21, 111, 345, 25, 77, 81};
        System.out.print("Array Desornado int: ");
        for (int i = 0; i < intVector.length; i++) {
            System.out.print(intVector[i] + " ");
        }
        int[] resulInt = Utils.ordena(intVector);
        System.out.print("\nArray Ordenado int: ");
        Utils.Imprimir(resulInt);

        System.out.println();
        /* Se le puso f a los float debido a que java los tipo decimales los toma por defecto como double que
         * en memoria ocupan 64 bits mientras que los float solo ocupan 32 bits, por lo cual es como hacer
         * un typecasting de double a float */
        float[] floatVector = {19.1f, 456.6f, 23.45f, 12.34f, 11.11f, 354.55f, 78.45f, 28.33f, 45.99f, 108.88f};
        System.out.print("\nArray Desornado float: ");
        for (int i = 0; i < floatVector.length; i++) {
            System.out.print(floatVector[i] + " ");
        }
        System.out.print("\nArray Ordenado float: ");
        float[] resultFloat = Utils.ordena(floatVector);
        Utils.Imprimir(resultFloat);

        /*No hay metodo puente para tipo String por lo cual siempre que se compile algun array de strings
        * el programa fallará */
        /* String [] strVector = {"zz", "aa", "cc", "hh", "bb", "ee", "ll"};
        String [] resultStr = Utils.ordena(strVector);
        */
    }
}

