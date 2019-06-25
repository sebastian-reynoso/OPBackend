package pe.backend.services;

import java.util.List;
import java.util.Optional;

import pe.backend.entities.Match;

public interface MatchService {
	
	public boolean insertar(Match entity);
	
	public List<Match> listarTodas();
	
	public Optional<Match> buscarPorID(int id);
	
	public boolean actualizar(Match entity);
	
	public boolean eliminar(int id);
}
