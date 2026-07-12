package data;

import model.ColaboradorExterno;
import model.GuiaTuristico;
import model.Registrable;
import model.Vehiculo;
import java.util.ArrayList;

public class GestorEntidades {
    private ArrayList<Registrable> listaEntidades;

    public GestorEntidades() {
        listaEntidades = new ArrayList<>();
    }

    public void agregarEntidad(Registrable entidad) {
        listaEntidades.add(entidad);
    }

    public String obtenerResumenGeneral() {
        StringBuilder reporte = new StringBuilder("=== SISTEMA LLANQUIHUE TOUR ===\n\n");

        if (listaEntidades.isEmpty()) {
            return "No hay entidades registradas en el sistema.";
        }

        for (Registrable entidad : listaEntidades) {
            reporte.append(entidad.mostrarResumen()).append("\n");

            // Validación de tipos usando instanceof
            if (entidad instanceof GuiaTuristico) {
                reporte.append("   -> TAREA: Asignar grupo de turistas a este guía.\n");
            } else if (entidad instanceof Vehiculo) {
                reporte.append("   -> TAREA: Revisar bitácora de mantenimiento.\n");
            } else if (entidad instanceof ColaboradorExterno) {
                reporte.append("   -> TAREA: Renovar contrato de servicios comerciales.\n");
            }
            reporte.append("--------------------------------------------------\n");
        }
        return reporte.toString();
    }
}

