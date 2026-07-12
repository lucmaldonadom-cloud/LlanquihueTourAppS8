# Agencia de Turismo - Llanquihue Tour

## Descripción del sistema
Este proyecto corresponde a la actualización del sistema orientado a objetos para la agencia Llanquihue Tour. En esta versión se ha incorporado una estructura más flexible y mantenible para gestionar otras entidades relevantes para las operaciones de la agencia[cite: 1]. El sistema permite administrar guías turísticos, vehículos y colaboradores externos, unificándolos mediante un contrato de comportamiento común y organizándolos en una colección genérica[cite: 1]. Además, incluye una interfaz gráfica básica que facilita el ingreso y visualización de registros por parte de usuarios no técnicos[cite: 1].

## Clases e interfaces utilizadas
*   **`model.Registrable` (Interfaz):** Define el contrato de comportamiento común mediante el método abstracto `mostrarResumen()`[cite: 1].
*   **`model.RecursoAgencia`:** Superclase base utilizada para aplicar herencia a las distintas entidades del sistema[cite: 1].
*   **`model.GuiaTuristico`, `model.Vehiculo`, `model.ColaboradorExterno`:** Clases que representan las entidades del sistema e implementan la interfaz `Registrable` aplicando polimorfismo[cite: 1].
*   **`data.GestorEntidades`:** Clase que almacena una colección genérica (`ArrayList<Registrable>`) y utiliza el operador `instanceof` para diferenciar los tipos de objetos en tiempo de ejecución y aplicar lógica diferenciada[cite: 1].
*   **`ui.Main`:** Clase principal que contiene la interfaz gráfica simple construida con `JOptionPane`[cite: 1].

## Instrucciones para ejecutar el programa
1. Abre este proyecto en el entorno de desarrollo IntelliJ IDEA.
2. En el panel de proyecto, despliega la carpeta `src` y busca el paquete `ui`[cite: 1].
3. Abre el archivo `Main.java`[cite: 1].
4. Haz clic en el botón de ejecución (triángulo verde) junto a la declaración `public static void main` y selecciona **Run 'Main.main()'**[cite: 1].
5. Sigue las instrucciones de los cuadros de diálogo en pantalla para ingresar datos de las diferentes entidades y visualizar el resumen[cite: 1].