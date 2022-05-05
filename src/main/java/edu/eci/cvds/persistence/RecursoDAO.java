package edu.eci.cvds.persistence;

import com.google.inject.Inject;
import edu.eci.cvds.entities.Recurso;
import edu.eci.cvds.entities.Reserva;
import org.postgresql.util.PSQLException;

import java.util.List;

public interface RecursoDAO {

    public void save(int idInterno, String estado, String nombre, String ubicacion, String tipo, int capacidad, String descripcion) throws PSQLException;

    public Recurso load(int id);

    public List<Recurso> consultarLibros();

    public List<Recurso> consultarEquipos();

    public List<Recurso> consultarSalasEstudio();

    public Recurso consultarRecurso(int idrecurso);

    public void nuevoRecurso(int idInterno, String estado, String nombre, String ubicacion, String tipo, int capacidad, String descripcion) throws PSQLException;
}
