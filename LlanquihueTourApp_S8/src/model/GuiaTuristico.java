package model;

public class GuiaTuristico extends RecursoAgencia {
    private String nombre;

    public GuiaTuristico(String codigo, String nombre) {
        super(codigo);
        this.nombre = nombre;
    }

    @Override
    public String mostrarResumen() {
        return "Guía Turístico: " + nombre + " (Código: " + codigo + ")";
    }
}
