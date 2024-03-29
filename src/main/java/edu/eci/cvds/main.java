package edu.eci.cvds;

import edu.eci.cvds.entities.Horario;
import edu.eci.cvds.entities.Recurso;
import edu.eci.cvds.entities.Reserva;
import edu.eci.cvds.entities.Usuario;
import edu.eci.cvds.persistence.exception.PersistenceException;
import edu.eci.cvds.services.ServiciosBiblioteca;
import edu.eci.cvds.services.ServiciosBibliotecaFactory;

import java.util.List;

//https://proyecto-cvds-piramoma.herokuapp.com
public class main {

    public static void main(String[] args) throws PersistenceException {
        ServiciosBiblioteca instance = ServiciosBibliotecaFactory.getInstance().getServiciosBiblioteca();

        //Reservas Recurso
        //instance.nuevoRecurso(1002, "disponible", "Awa", "Bloque G", "libro", 5, "Daniel Ramos");

//        System.out.println("Recursos Libros");
//        List<Recurso> Recursolibros = instance.consultarLibros();
//        for(Recurso r: Recursolibros){
//            System.out.println(r.toString());
//        }
//        System.out.println("Recursos Equipos");
//        List<Recurso> RecursoEquipos = instance.consultarEquipos();
//        for(Recurso r: RecursoEquipos){
//            System.out.println(r.toString());
//        }
//        System.out.println("Recursos Salas");
//        List<Recurso> RecursosSalas = instance.consultarSalasEstudio();
//        for(Recurso r: RecursosSalas){
//            System.out.println(r.toString());
//        }
//        System.out.println("Usuarios con Reservas");
//        List<Usuario> usuariosConReservas = instance.consultarUsuariosConReservas();
//        for(Usuario u: usuariosConReservas){
//            System.out.println(u.toString());
//        }
//        System.out.println("Reservas De Usuario");
//        List<Reserva> reservasuser = instance.consultarPorUsuarioPocaInfo("yesid.mora");
//        for(Reserva r: reservasuser){
//            System.out.println(r.toString());
//        }
//        System.out.println("Horarios");
//        List<Horario> horarios = instance.consultarHorarios();
//        for(Horario h: horarios){
//            System.out.println(h.toString());
//        }
//
//        System.out.println("Consultar reservas Pasadas");
//        List<Reserva> reservasPasadas = instance.consultarReservasPasadas("yesid.mora");
//        for(Reserva r: reservasPasadas){
//            System.out.println(r.toString());
//        }
//
//        System.out.println("Consultar reservas Canceladas");
//        List<Reserva> reservasCanceladas = instance.consultarReservasCanceladas("yesid.mora");
//        for(Reserva r: reservasCanceladas){
//            System.out.println(r.toString());
//        }
//
//        System.out.println("Reservas de un recurso");
//        List<Reserva> reservasRecurso = instance.listarReservasRecurso(17);
//        for(Reserva r: reservasRecurso){
//            System.out.println(r.toString());
//        }
//
//        System.out.println("Consultar Recurso Horarios");
//        List<Horario> horariosRecurso = instance.consultaHorariosRecurso(1);
//        for(Horario r: horariosRecurso){
//            System.out.println(r.toString());
//        }
//
//        System.out.println("Consultar Horario Especifico");
//        Horario horarioespecifico = instance.consultarHorario(1, 1);
//        System.out.println(horarioespecifico.toString());
//
//        System.out.println("Consultar Reserva Especifico");
//        Reserva reservaespecifica = instance.consultarReserva(3, 68);
//        System.out.println(reservaespecifica.getRecurso().getCapacidad());
//        System.out.println(reservaespecifica.toString());
//
//        System.out.println("Consultar Recurso");
//        Recurso recurso = instance.consultarRecurso(1);
//        System.out.println(recurso.toString());

        //Reserva Nueva
        //instance.nuevaReserva("yesid.mora", 13, new Date(2022,05,04), new Timestamp(2022,05,04,8,0,0,0), new Timestamp(2022,05,04,10,0,0,0),  false, "activa",new Timestamp(2022,05,04,10,0,0,0));

//        for (Reserva reserva: instance.consultarPorUsuarioPocaInfo("daniel.ramos")){
//            System.out.println(reserva.toString());
//        }

        System.out.println("Recursos mas Usados");
        List<Reserva> recursosMasUsadas = instance.recursosMasUsados();
        for(Reserva r: recursosMasUsadas) {
            System.out.println(r.getCantidad()+" " + r.getTitulo());
        }

        System.out.println("Recursos menos Usados");
        List<Reserva> recursosMenosUsadas = instance.recursosMenosUsados();
        for(Reserva r: recursosMenosUsadas) {
            System.out.println(r.getCantidad()+" " + r.getTitulo());
        }

        System.out.println("Recursos Por carrera");
        List<Reserva> recursosPorCarrera = instance.consultarReservasPorCarrera();
        for(Reserva r: recursosPorCarrera) {
            System.out.println(r.getCantidad()+" " + r.getCarrera());
        }

        System.out.println("Recursos Por Usuarios");
        List<Reserva> recursosPorUsuarios = instance.consultarReservasPorUsuario();
        for(Reserva r: recursosPorUsuarios) {
            System.out.println(r.getCantidad()+" " + r.getTitulo());
        }

        System.out.println("Horarios con mayor ocupacion");
        List<Reserva> PorMayorHorario = instance.consultarHorariosMayorOcupacion();
        for(Reserva r: PorMayorHorario) {
            System.out.println(r.getInicio()+" "+r.getFin()+" "+r.getCantidad());
        }

        System.out.println("Horarios con menor ocupacion");
        List<Reserva> PorMenorHorario = instance.consultarHorariosMenorOcupacion();
        for(Reserva r: PorMenorHorario) {
            System.out.println(r.getInicio()+" "+r.getFin()+" "+r.getCantidad());
        }

        System.out.println("Reservas Canceladas Grafico");
        List<Reserva> reservasCanceladasGrafico = instance.consultarReservasCanceladasGrafico();
        for(Reserva r: reservasCanceladasGrafico) {
            System.out.println(r.getCantidad()+" " + r.getTitulo());
        }
    }
}
