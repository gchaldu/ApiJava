package net.youtics.genericasSinCast;

import net.youtics.pilagenerica.Cliente;
import net.youtics.pilagenerica.PilaGenerica;

import java.util.ArrayList;
import java.util.List;

public class MainGenericasSinCast {
    public static void main(String[] args) {

        PilaSinCast<Cliente> p = new PilaSinCast<>();
        p.addGenericoT(new Cliente(15, "Gabriel Chaldu"));
        p.addGenericoT(new Cliente(13, "Carolina Arc."));

        for (Cliente c: p) {
            System.out.println("Apellido = " + c.getApellido());
            System.out.println("Dni = " + c.getDni());
            System.out.println("------------------------------------");
        }

    }
}
