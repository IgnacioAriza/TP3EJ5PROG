import java.util.*;

class ListaDeTareas implements Iterable<Tarea> {
    private List<Tarea> tareas;

    public ListaDeTareas() {
        this.tareas = new ArrayList<>();
    }

    public void agregarTarea(Tarea tarea) {
        tareas.add(tarea);
        tareas.sort(Comparator.comparingInt(Tarea::getPrioridad).reversed());
    }

    public void eliminarTarea(String descripcion) {
        tareas.removeIf(t -> t.getDescripcion().equals(descripcion));
    }

    public int totalTareas() {
        return tareas.size();
    }

    @Override
    public Iterator<Tarea> iterator() {
        return tareas.iterator();
    }
}