package Inscripciones;

import java.util.HashMap;
import java.util.Map;

public class Alumno {

    private int legajo;
    private String apellido;
    private String nombre;
    private Map<Integer, Materia> materias;

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
        materias = new HashMap<>();
    }

    public Alumno() {
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean agregarMateria(Materia m) {
        boolean agregado = false;
        if (!materias.containsKey(m.getIdMateria())) {
            if (materias.containsValue(m.getNombre())) {
                if (!materias.containsValue(m.getAnio())) {
                    materias.put(m.getIdMateria(), m);
                    agregado = true;
                }
            } else {
                materias.put(m.getIdMateria(), m);
                agregado = true;
            }

        }
        return agregado;
    }

    public int cantidadMaterias() {
        int tamanio = materias.size();
        return tamanio;
    }
}
