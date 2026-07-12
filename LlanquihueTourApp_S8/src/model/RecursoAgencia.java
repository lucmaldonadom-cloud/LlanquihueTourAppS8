package model;

public abstract class RecursoAgencia implements Registrable {
    protected String codigo;

    public RecursoAgencia(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }
}
