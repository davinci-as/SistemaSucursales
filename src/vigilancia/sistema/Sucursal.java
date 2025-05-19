package vigilancia.sistema;

public class Sucursal {
    private EntidadBancaria entidad;
    private int codigo;
    private int cantidadEmpleados = 0;
    private String domicilio;

    public Sucursal(EntidadBancaria entidad) {
        this.setEntidad(entidad);
    }

    public Sucursal(EntidadBancaria entidad, int codigo, String domicilio) {
        this.setCodigo(codigo);
        this.setDomicilio(domicilio);
        this.setEntidad(entidad);
    }

    public EntidadBancaria getEntidad() {
        return entidad;
    }

    private void setEntidad(EntidadBancaria entidad) {
        this.entidad = entidad;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCantidadEmpleados() {
        return cantidadEmpleados;
    }
}
