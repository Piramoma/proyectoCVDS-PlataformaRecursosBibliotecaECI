package edu.eci.cvds.persistence;

import com.google.inject.Inject;
import edu.eci.cvds.entities.Recurso;

import java.util.List;

public interface RecursoDAO {

    public void save(int idInterno, String estado, String nombre, String ubicacion, String tipo, int capacidad);

    public Recurso load(int id);

    public List<Recurso> consultarLibros();

    public List<Recurso> consultarEquipos();

    public List<Recurso> consultarSalasEstudio();

    public void nuevoRecurso(int idInterno, String estado, String nombre, String ubicacion, String tipo, int capacidad);
}
