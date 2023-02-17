package net.youtics.genericasSinCast;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PilaSinCast<T> implements Iterable<T>{

    private List<T> listaNumeros;

    public List<T> getListaNumeros() {
        return listaNumeros;
    }

    public PilaSinCast() {

        this.listaNumeros = new ArrayList<>();
    }

    public void addGenericoT(T objeto) {

        listaNumeros.add(0,objeto);
    }

    public T deleteGenericoT() {
        T eliminado = listaNumeros.get(0);
        listaNumeros.remove(listaNumeros.get(0));
        return eliminado;
    }

    public boolean vaciaGenericoT() {
        if(listaNumeros.size()==0)
            return false;
        return true;
    }
    public void mostrarGenericoT() {
        System.out.print("Inicio - ");
        for (T n:listaNumeros) {
            System.out.print(" " + n.toString());
        }
        System.out.println(" - Fin");
    }

    @Override
    public Iterator<T> iterator() {
        return this.listaNumeros.iterator();
    }
}
