package vigilancia.sistema;

import java.util.ArrayList;

public class Sucursal {
    private EntidadBancaria entidad;
    private int codigo;
    private int cantidadEmpleados = 0;
    private String domicilio;
    private ArrayList<Contrato> contratosVigentes;

    public Sucursal(EntidadBancaria entidad) {
        this.setEntidad(entidad);
        this.contratosVigentes = new ArrayList<>();
    }

    public Sucursal(EntidadBancaria entidad, int codigo, String domicilio) {
        this.setCodigo(codigo);
        this.setDomicilio(domicilio);
        this.setEntidad(entidad);
        this.contratosVigentes = new ArrayList<>();
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

    public ArrayList<Contrato> getContratosVigentes() {
        return contratosVigentes;
    }

    public void addContrato(Contrato contrato) {
        this.contratosVigentes.add(contrato);
    }
}
