package edu.eci.cvds.tests;

import edu.eci.cvds.entities.Recurso;
import edu.eci.cvds.services.ServiciosBibliotecaFactory;
import edu.eci.cvds.services.ServiciosBiblioteca;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RecursosTest {

    ServiciosBiblioteca serviciosBiblioteca;

    public RecursosTest(){
        serviciosBiblioteca = ServiciosBibliotecaFactory.getInstance().getServiciosBiblioteca();
    }

    @Before
    public void setUp(){
    }

    @Test
    public void deberiaConsultarSoloLibros(){
        List<Recurso> recursosLibros = serviciosBiblioteca.consultarLibros();
        for(Recurso libro:recursosLibros){
            Assert.assertEquals("libro", libro.getTipo());
            Assert.assertEquals("disponible", libro.getEstado());
        }
    }

    @Test
    public void deberiaConsultarSoloSalas(){
        List<Recurso> recursosSalas = serviciosBiblioteca.consultarSalasEstudio();
        for (Recurso sala:recursosSalas){
            Assert.assertEquals("sala", sala.getTipo());
            Assert.assertEquals("disponible", sala.getEstado());
        }
    }

    @Test
    public void deberiaConsultarSoloEquipos(){
        List<Recurso> recursosEquipos = serviciosBiblioteca.consultarEquipos();
        for (Recurso equipo:recursosEquipos){
            Assert.assertEquals("equipo",equipo.getTipo());
            Assert.assertEquals("disponible", equipo.getEstado());
        }
    }


}
