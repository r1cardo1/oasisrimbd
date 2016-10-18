/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oasiscrud;

import classes.Asistencia;
import classes.Busqueda;
import classes.Cliente;
import classes.Invitado;
import classes.Login;
import classes.Plan;
import classes.Reserva;
import classes.Usuario;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author Ricardo Marcano
 */
public interface oasisrimbd extends Remote {

    public Usuario login(Usuario user) throws RemoteException;

    public ArrayList<Cliente> searchClientbyCI(String str) throws RemoteException;

    public ArrayList<Cliente> searchClientbyContract(String str) throws RemoteException;

    public ArrayList<Cliente> searchClientbyName(String str) throws RemoteException;

    public void openTable(String contrato, String ninvitados, String invad, String fecha, String hora, String usuario) throws RemoteException;

    public ArrayList<Asistencia> visits() throws RemoteException;

    public ArrayList<Cliente> getRestringido() throws RemoteException;

    public void logLogin(String nombre, String apellido, String usuario, String fecha, String hora) throws RemoteException;

    public void logfailLogin(String usuario, String clave, String equipo, String fecha, String hora) throws RemoteException;

    public void search(String usuario, String modo, String filtro, String fecha, String hora) throws RemoteException;

    public ArrayList<Usuario> getUsuarios() throws RemoteException;

    public void newUser(Usuario u) throws RemoteException;

    public ArrayList<Usuario> searchUserbyUsername(String u) throws RemoteException;

    public void deleteUserByUsername(String u) throws RemoteException;

    public int getLogins(String u) throws RemoteException;
    
    public int getSearchByUser(String u) throws RemoteException;
    
    public ArrayList<Busqueda> getAllSearch() throws RemoteException;
    
    public ArrayList<Login> getLogLogins() throws RemoteException;
    
    public ArrayList<Plan> getPlans() throws RemoteException;
    
    public void addPlan(Plan plan) throws RemoteException;
    
    public void deletePlan(Plan plan) throws RemoteException;
    
    public void updatePlan(Plan neww, Plan old) throws RemoteException;
    
    public int getCantByPlan(String plan) throws RemoteException;
    
    public void addInvad(String nombre, String apellido, String cedula, String contrato,String fecha) throws RemoteException;
    
   public ArrayList<Invitado> getInvitados() throws RemoteException;
   
   public ArrayList<Asistencia> getAsistenciaPorContrato(String contrato) throws RemoteException;
   
   public ArrayList<Reserva> getReservas() throws RemoteException;
   
   public ArrayList<Reserva> getReservasByName(String titular) throws RemoteException;
   
   public ArrayList<Reserva> getReservasByCI(String ci) throws RemoteException;
   
   public void guardaReservacion(Reserva reserva) throws RemoteException;
   
   public void actualizaReservacion(Reserva old, Reserva neww) throws RemoteException;
   
   public void eliminaReserva(Reserva r) throws RemoteException;

}