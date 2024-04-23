package IndexaciónyVisualizacióndeArchivos;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class IndexadorArchivos {
    private List<String> archivosIndexados;

    public IndexadorArchivos() {
        archivosIndexados = new ArrayList<>();
    }

    public void indexarDirectorio(File directorio) {
        if (directorio.isDirectory()) {
            indexarRecursivamente(directorio);
        }
    }

    private void indexarRecursivamente(File directorio) {
        File[] archivos = directorio.listFiles();
        if (archivos != null) {
            for (File archivo : archivos) {
                if (archivo.isDirectory()) {
                    indexarRecursivamente(archivo);
                } else {
                    archivosIndexados.add(archivo.getAbsolutePath());
                }
            }
        }
    }

    public List<String> obtenerArchivosIndexados() {
        return archivosIndexados;
    }

    public void mostrarArchivosIndexados() {
        for (String archivo : archivosIndexados) {
            System.out.println(archivo);
        }
    }

    public void ordenarArchivosIndexados() {
        archivosIndexados.sort(String::compareTo);
    }
}
