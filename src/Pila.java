import java.util.ArrayList;
import java.util.List;

public class Pila implements Tda{

    List<Integer> listaNumeros;

    public List<Integer> getListaNumeros() {
        return listaNumeros;
    }

    public Pila() {
        this.listaNumeros = new ArrayList<>();
    }

    @Override
    public void addNumber(Integer numero) {
        listaNumeros.add(0,numero);
    }

    @Override
    public Integer deleteNumber() {
        Integer eliminado = listaNumeros.get(0);
        listaNumeros.remove(listaNumeros.get(0));
        return eliminado;
    }

    @Override
    public boolean vacia() {
        if(listaNumeros.size()==0)
            return false;
        return true;
    }

    @Override
    public void mostrar() {
        System.out.print("Inicio - ");
        for (Integer n:listaNumeros) {
            System.out.print(" " + n.toString());
        }
        System.out.println(" - Fin");
    }
}
