package net.youtics.pilagenerica;

import java.util.ArrayList;
import java.util.List;

public class EjemploGenericos {
    public static void main(String[] args) {
        List<Integer> Pila = new ArrayList<>();
        PilaGenerica p = new PilaGenerica(Pila);
        p.addGenerico(1);
        p.toString();
        p.mostrarGenerico();

        List<Cliente> clientes = new ArrayList<>();
        PilaGenerica pilaClientes = new PilaGenerica(clientes);
        pilaClientes.addGenerico(new Cliente(22, "Chaldu"));
        pilaClientes.addGenerico(new Cliente(32, "Patoii"));
        pilaClientes.mostrarGenerico();
        for (Object o: pilaClientes) {
            Cliente c = (Cliente) o;
            System.out.println("DNI = " + c.getDni());
            System.out.println("Apellido = " + c.getApellido());
            System.out.println("-------------------------------");
        }
    }
}
