package vigilancia.sistema;

public class Vigilante {
    private int codigo;
    private int edad;
    private String nombre;

    public Vigilante() {}

    public Vigilante(int codigo, int edad ,String nombre) {
        this.setEdad(edad);
        this.setNombre(nombre);
        this.setCodigo(codigo);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
