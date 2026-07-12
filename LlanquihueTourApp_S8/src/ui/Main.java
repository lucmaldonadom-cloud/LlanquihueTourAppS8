package ui;

import data.GestorEntidades;
import model.ColaboradorExterno;
import model.GuiaTuristico;
import model.Vehiculo;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        GestorEntidades gestor = new GestorEntidades();
        boolean continuar = true;

        while (continuar) {
            String[] opciones = {
                    "1. Ingresar Guía",
                    "2. Ingresar Vehículo",
                    "3. Ingresar Colaborador",
                    "4. Ver Resumen",
                    "5. Salir"
            };

            int seleccion = JOptionPane.showOptionDialog(null,
                    "Seleccione una acción para gestionar entidades:",
                    "Menú - Llanquihue Tour",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null, opciones, opciones[0]);

            switch (seleccion) {
                case 0:
                    String codGuia = JOptionPane.showInputDialog("Ingrese el código del guía:");
                    String nomGuia = JOptionPane.showInputDialog("Ingrese el nombre del guía:");
                    if (codGuia != null && nomGuia != null) {
                        gestor.agregarEntidad(new GuiaTuristico(codGuia, nomGuia));
                        JOptionPane.showMessageDialog(null, "Guía registrado con éxito.");
                    }
                    break;
                case 1:
                    String codVehiculo = JOptionPane.showInputDialog("Ingrese el código del vehículo:");
                    String patente = JOptionPane.showInputDialog("Ingrese la patente del vehículo:");
                    if (codVehiculo != null && patente != null) {
                        gestor.agregarEntidad(new Vehiculo(codVehiculo, patente));
                        JOptionPane.showMessageDialog(null, "Vehículo registrado con éxito.");
                    }
                    break;
                case 2:
                    String codColab = JOptionPane.showInputDialog("Ingrese el código del colaborador:");
                    String empresa = JOptionPane.showInputDialog("Ingrese el nombre de la empresa:");
                    if (codColab != null && empresa != null) {
                        gestor.agregarEntidad(new ColaboradorExterno(codColab, empresa));
                        JOptionPane.showMessageDialog(null, "Colaborador registrado con éxito.");
                    }
                    break;
                case 3:
                    String reporte = gestor.obtenerResumenGeneral();
                    JOptionPane.showMessageDialog(null, reporte, "Resumen de Entidades", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 4:
                case -1: // Si cierra la ventana
                    continuar = false;
                    JOptionPane.showMessageDialog(null, "Saliendo del sistema...");
                    break;
            }
        }
    }
}
