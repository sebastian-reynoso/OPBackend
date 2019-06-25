package pe.backend.services;

import java.util.List;
import java.util.Optional;

import pe.backend.entities.Mode;


public interface ModeService {

	public boolean insertar(Mode objMode);
	
	public List<Mode> listarTodas();
	
	public Optional<Mode> buscarPorID(int id);
	
	public boolean actualizar(Mode objMode);
	
	public boolean eliminar(int id);	
	
}