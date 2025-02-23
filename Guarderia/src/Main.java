//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Crear guardería
        Guarderia guarderia = new Guarderia("Pequeños Gigantes");

        // Crear estudiantes y agregarlos a la guardería
        guarderia.agregarEstudiante(new Estudiante("Juan Pérez",4 , "Masculino", "12345678","Ninguna" ,"María Pérez" ,"555-1234"  ));
        guarderia.agregarEstudiante(new Estudiante("Ana Gómez",6 , "Femenino","87654321" , "Polen", "Carlos Gómez","555-5678"));
        guarderia.agregarEstudiante(new Estudiante("Luis Rodríguez", 3, "Masculino","11223344" ,"Lácteos" ,"Elena Rodríguez" , "555-7890"));

        // Mostrar todos los estudiantes
        guarderia.mostrarTodosLosEstudiantes();

        // Mostrar estudiantes mayores a 5 años
        guarderia.mostrarEstudiantesMayoresA5();

        // Prueba de CRUD: actualizar un estudiante
        guarderia.actualizarEstudiante(1, "Juan Pérez López", 5);

        // Prueba de CRUD: eliminar un estudiante
        guarderia.eliminarEstudiante(2);

        // Mostrar lista final después de actualizaciones
        guarderia.mostrarTodosLosEstudiantes();
    }
}
