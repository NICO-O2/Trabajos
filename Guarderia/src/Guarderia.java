import java.util.ArrayList;
import java.util.List;

public class Guarderia {
    private String nombre;
    private List<Estudiante> listaEstudiantes;

    public Guarderia(String nombre) {
        this.nombre = nombre;
        this.listaEstudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante estudiante) {
        listaEstudiantes.add(estudiante);
    }

    public Estudiante buscarEstudiante(int id) {
        for (Estudiante e : listaEstudiantes) {
            if (e.getId() == id) {
                return e;
            }
        }
        return null; // No encontrado
    }

    public boolean actualizarEstudiante(int id, String nuevoNombre, int nuevaEdad) {
        Estudiante estudiante = buscarEstudiante(id);
        if (estudiante != null) {
            estudiante.setNombre(nuevoNombre);
            estudiante.setEdad(nuevaEdad);
            return true;
        }
        return false;
    }

    public boolean eliminarEstudiante(int id) {
        Estudiante estudiante = buscarEstudiante(id);
        if (estudiante != null) {
            return listaEstudiantes.remove(estudiante);
        }
        return false;
    }

    public void mostrarTodosLosEstudiantes() {
        System.out.println("Estudiantes registrados en la guardería " + nombre + ":");
        for (Estudiante estudiante : listaEstudiantes) {
            estudiante.mostrarInformacion();
        }
    }

    public List<Estudiante> obtenerEstudiantesMayoresA5() {
        List<Estudiante> mayoresA5 = new ArrayList<>();
        for (Estudiante estudiante : listaEstudiantes) {
            if (estudiante.getEdad() > 5) {
                mayoresA5.add(estudiante);
            }
        }
        return mayoresA5;
    }

    public void mostrarEstudiantesMayoresA5() {
        List<Estudiante> mayoresA5 = obtenerEstudiantesMayoresA5();
        if (mayoresA5.isEmpty()) {
            System.out.println("No hay estudiantes mayores a 5 años.");
        } else {
            System.out.println("Lista de estudiantes mayores a 5 años:");
            for (Estudiante estudiante : mayoresA5) {
                estudiante.mostrarInformacion();
            }
        }
    }
}
{
}
