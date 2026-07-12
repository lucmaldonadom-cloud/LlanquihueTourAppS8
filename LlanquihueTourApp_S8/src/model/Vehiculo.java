package model;

public class Vehiculo extends RecursoAgencia {
    private String patente;

    public Vehiculo(String codigo, String patente) {
        super(codigo);
        this.patente = patente;
    }

    @Override
    public String mostrarResumen() {
        return "Vehículo Asignado: Patente " + patente + " (Código: " + codigo + ")";
    }
}
