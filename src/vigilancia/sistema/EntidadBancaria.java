package vigilancia.sistema;

import java.util.ArrayList;

public class EntidadBancaria {
    private int codigo;
    private String nombre;
    private String domicilio;
    private ArrayList<Sucursal> sucursales;

    public EntidadBancaria() {
        this.sucursales = new ArrayList<>();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public ArrayList<Sucursal> getSucursales() {
        return sucursales;
    }

    public void addSucursal(Sucursal sucursal) {
        this.sucursales.add(sucursal);
    }

    public void addSucursal(int codigo, String domicilio) {
        Sucursal sucursal = new Sucursal(this, codigo, domicilio);
        this.sucursales.add(sucursal);
    }

    public void removeSucursal(int codigo) {
        int indice = 0; // TODO: Buscar el indice de la sucursal a borrar
        this.sucursales.remove(indice);
    }

    public void removeSucursal(Sucursal sucursal) {
        this.sucursales.remove(sucursal);
    }
}
