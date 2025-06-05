package vigilancia.sistema;

import java.util.Date;

public class Contrato {
    private boolean activo = false;
    private Date fechaContratacion;
    private Date fechaCierre;
    private boolean conArma = false;
    private Vigilante vigilante;

    public Contrato() {}

    public Contrato(Vigilante vigilante) {
        this.setVigilante(vigilante);
    }

    public Contrato(Date fechaContratacion, Date fechaCierre) {
        this.setFechaContratacion(fechaContratacion);
        this.setFechaCierre(fechaCierre);
    }

    public Contrato(Vigilante vigilante, Date fechaContratacion, Date fechaCierre) {
        this.setFechaContratacion(fechaContratacion);
        this.setFechaCierre(fechaCierre);
        this.setVigilante(vigilante);
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public Date getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(Date fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public Date getFechaCierre() {
        return fechaCierre;
    }

    public void setFechaCierre(Date fechaCierre) {
        this.fechaCierre = fechaCierre;
    }

    public boolean isConArma() {
        return conArma;
    }

    public Vigilante getVigilante() {
        return vigilante;
    }

    public void setVigilante(Vigilante vigilante) {
        this.vigilante = vigilante;
    }
}
