package net.youtics.pilagenerica;

public class Cliente {

    private int dni;
    private String apellido;

    public Cliente(int dni, String apellido) {
        this.dni = dni;
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "dni=" + dni +
                ", apellido='" + apellido + '\'' +
                '}';
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
