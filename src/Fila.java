public class Fila extends Pila{
    public Fila() {
        super();
    }

    @Override
    public void addNumber(Integer numero) {

        getListaNumeros().add(getListaNumeros().size(),numero);
    }

    @Override
    public Integer deleteNumber() {
        Integer eliminado = getListaNumeros().size()-1;
        getListaNumeros().remove(0);
        return eliminado;
    }

    @Override
    public boolean vacia() {
        return super.vacia();
    }

    @Override
    public void mostrar() {
        super.mostrar();
    }
}
