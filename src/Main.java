public class Main {
    public static void main(String[] args) {

        /** Implementacion de la clase Pila */
       /* Pila pilita = new Pila();
        if(pilita.vacia()==false)
            System.out.println("La pila esta vacia...");
        pilita.addNumber(1);
        pilita.addNumber(2);
        pilita.addNumber(3);
        pilita.mostrar();
        int eliminado = pilita.deleteNumber();
        System.out.println("eliminado = " + eliminado);
        pilita.mostrar();
        if(pilita.vacia())
            System.out.println("La pila tiene info...");*/

        /** Implementacion de la clase Fila */

        Fila filita = new Fila();
        filita.addNumber(10);
        filita.addNumber(20);
        filita.addNumber(30);
        filita.mostrar();
        filita.deleteNumber();
        filita.mostrar();
        filita.addNumber(1);
        filita.mostrar();
        if(filita.vacia())
            System.out.println("Tiene info");
    }
}