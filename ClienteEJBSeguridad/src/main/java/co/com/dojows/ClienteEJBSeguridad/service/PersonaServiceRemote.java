package co.com.dojows.ClienteEJBSeguridad.service;

import java.util.List;

import co.com.dojows.ClienteEJBSeguridad.domain.Persona;

public interface PersonaServiceRemote {

	public List<Persona> listarPersonas();
	public Persona encontrarPersonaPorId(Persona persona);
	public Persona encontrarPersonaPorEmail(Persona persona);
	public void registrarPersona(Persona persona);
	public void modificarPersona(Persona persona);
	public void eliminarPersona(Persona persona);
}
