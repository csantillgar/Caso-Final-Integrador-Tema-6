package MapasyAsociacióndeDatos;
import java.util.HashMap;
import java.util.Map;

public class RecuperacionEficiente {
    private Map<String, String> datos;

    public RecuperacionEficiente() {
        datos = new HashMap<>();
    }

    // Método para agregar un par clave-valor a los datos
    public void agregarDato(String clave, String valor) {
        datos.put(clave, valor);
    }

    // Método para recuperar el valor asociado a una clave
    public String obtenerValor(String clave) {
        return datos.get(clave);
    }

    // Método para eliminar un dato dado su clave
    public void eliminarDato(String clave) {
        datos.remove(clave);
    }

}
