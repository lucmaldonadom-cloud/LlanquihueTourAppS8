package model;

public class ColaboradorExterno extends RecursoAgencia {
    private String empresa;

    public ColaboradorExterno(String codigo, String empresa) {
        super(codigo);
        this.empresa = empresa;
    }

    @Override
    public String mostrarResumen() {
        return "Colaborador Externo: Empresa " + empresa + " (Código: " + codigo + ")";
    }
}
