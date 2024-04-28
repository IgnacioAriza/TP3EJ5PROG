import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaDeTareas listaDeTareas = new ListaDeTareas();

        while (true) {
            System.out.println("Selecciona una opción:");
            System.out.println("1. Agregar una nueva tarea");
            System.out.println("2. Mostrar todas las tareas");
            System.out.println("3. Eliminar una tarea");
            System.out.println("4. Salir");
            System.out.print("Opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la descripción de la tarea: ");
                    String descripcion = scanner.nextLine();
                    System.out.print("Ingrese la prioridad de la tarea: ");
                    int prioridad = scanner.nextInt();
                    scanner.nextLine();
                    listaDeTareas.agregarTarea(new Tarea(descripcion, prioridad));
                    break;
                case 2:
                    System.out.println("Todas las tareas:");
                    for (Tarea tarea : listaDeTareas) {
                        System.out.println(tarea);
                    }
                    break;
                case 3:
                    System.out.print("Ingrese la descripción de la tarea a eliminar: ");
                    String tareaEliminar = scanner.nextLine();
                    listaDeTareas.eliminarTarea(tareaEliminar);
                    System.out.println("Tarea eliminada correctamente.");
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        }
    }
}
