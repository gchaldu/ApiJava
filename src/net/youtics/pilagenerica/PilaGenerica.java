package net.youtics.pilagenerica;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class PilaGenerica implements Iterable{

    private List listaNumeros;

    public List getListaNumeros() {
        return listaNumeros;
    }

    public PilaGenerica(List list) {

        this.listaNumeros = list;
    }


    public void addGenerico(Object objeto) {

        listaNumeros.add(0,objeto);
    }


    public Object deleteGenerico() {
        Object eliminado = listaNumeros.get(0);
        listaNumeros.remove(listaNumeros.get(0));
        return eliminado;
    }


    public boolean vaciaGenerico() {
        if(listaNumeros.size()==0)
            return false;
        return true;
    }

    public void mostrarGenerico() {
        System.out.print("Inicio - ");
        for (Object n:listaNumeros) {
            System.out.print(" " + n.toString());
        }
        System.out.println(" - Fin");
    }

    @Override
    public Iterator iterator() {
        return this.listaNumeros.iterator();
    }
}
