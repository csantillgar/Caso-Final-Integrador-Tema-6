package MapasyAsociacióndeDatos;
import java.util.HashMap;
import java.util.Map;

public class GestionRelaciones {
    private Map<Integer, String> relacionEnterosLetras;

    public GestionRelaciones() {
        relacionEnterosLetras = new HashMap<>();
    }

    // Método para asociar un entero con una letra
    public void asociarEnteroLetra(int entero, String letra) {
        relacionEnterosLetras.put(entero, letra);
    }

    // Método para recuperar la letra asociada a un entero
    public String obtenerLetra(int entero) {
        return relacionEnterosLetras.get(entero);
    }

    // Método para eliminar la asociación de un entero con una letra
    public void eliminarAsociacion(int entero) {
        relacionEnterosLetras.remove(entero);
    }

}
