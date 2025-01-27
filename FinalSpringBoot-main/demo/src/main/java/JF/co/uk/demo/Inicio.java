package JF.co.uk.demo;

import com.cultodeportivo.demo65jakartaee2.daos.*;
import com.cultodeportivo.demo65jakartaee2.models.*;
import jakarta.annotation.PostConstruct;
import jakarta.ejb.Singleton;
import jakarta.ejb.Startup;
import jakarta.inject.Inject;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Singleton
@Startup
public class Inicio {

    @Inject
    private VehiculoDAO vehiculoDAO;

    @Inject
    private RoleDAO roleDAO;

    @Inject
    private PersonaDAO personaDAO;

    @Inject
    private UsuarioDAO usuarioDAO;

    @Inject
    private TarifaDAO tarifaDAO;

    @Inject
    private EspacioDAO espacioDAO;

    @Inject
    private HorarioDAO horarioDAO;

    @Inject
    private ContratoDAO contratoDAO;

    @PostConstruct
    public void init() {
        System.out.println("Hola mundo");

        vehiculoDAO.listarVehiculos().forEach(System.out::println);

        roleDAO.getRoles().forEach(System.out::println);

        personaDAO.listarPersonas().forEach(System.out::println);

        usuarioDAO.listarUsuarios().forEach(System.out::println);

        tarifaDAO.listarTarifas().forEach(System.out::println);

        /*for (int i = 1; i <= 100; i++) {
            Espacio espacio = new Espacio();
            espacio.setOcupado(false);
            espacio.setReservado(false);
            espacioDAO.crearEspacio(espacio);
        }*/

        espacioDAO.listarEspacios().forEach(System.out::println);

        /*Horario horario = new Horario();
        horario.setTipo("Laboral");
        horario.setApertura(LocalTime.of(8 , 30));
        horario.setCierre(LocalTime.of(20, 30));

        Horario horario2 = new Horario();
        horario2.setTipo("Fin de semana");
        horario2.setApertura(LocalTime.of(8 , 30));
        horario2.setCierre(LocalTime.of(12, 30));

        horarioDAO.crearHorario(horario);
        horarioDAO.crearHorario(horario2);*/

        horarioDAO.listarHorarios().forEach(System.out::println);

        /*Tarifa tarifa = new Tarifa();
        tarifa.setValor(BigDecimal.valueOf(8.5));

        tarifaDAO.crearTarifa(tarifa);*/

        // eager y lazy loading


        tarifaDAO.listarTarifas().forEach(System.out::println);
        /*
        tarifaDAO.eliminarTarifa(2L);

        Persona persona = personaDAO.buscarPorId(1L);
        Espacio espacio = espacioDAO.buscarPorId(51L);
        Tarifa tarifa = new Tarifa();
        tarifa.setValor(BigDecimal.valueOf(11.10));

        Contrato contrato = new Contrato();
        contrato.setPersona(persona);
        contrato.setFechaInicio(LocalDateTime.now());
        contrato.setTotal(BigDecimal.valueOf(100));
        contrato.setEspacio(espacio);
        contrato.setTarifa(tarifa);

        contratoDAO.crearContrato(contrato);

        */
        contratoDAO.listarContratos().forEach(System.out::println);
        
        /*
        Horario horario = new Horario();
        horario.setTipo("Laboral");
        horario.setApertura(LocalTime.of(6 , 30));
        horario.setCierre(LocalTime.of(22, 30));

        ExcepcionHorario excepcionHorario = new ExcepcionHorario();
        excepcionHorario.setHoraApertura(LocalTime.of(6 , 30));
        excepcionHorario.setHoraCierre(LocalTime.of(12, 30));
        excepcionHorario.setFecha(LocalDate.now());
        excepcionHorario.setCierreTodoDia(false);

        ExcepcionHorario excepcionHorario2 = new ExcepcionHorario();
        excepcionHorario2.setHoraApertura(LocalTime.of(13 , 30));
        excepcionHorario2.setHoraCierre(LocalTime.of(16, 30));
        excepcionHorario2.setFecha(LocalDate.now());
        excepcionHorario2.setCierreTodoDia(false);

        horario.addExcepcion(excepcionHorario);
        horario.addExcepcion(excepcionHorario2);

        horarioDAO.crearHorario(horario);
        */
        horarioDAO.listarHorarios().forEach(System.out::println);

        System.out.println(usuarioDAO.buscarPorId(1L).getPersona().getNombre());
    }


}
