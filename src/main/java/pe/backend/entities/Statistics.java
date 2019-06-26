package pe.backend.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name="statistics")
@ApiModel(value="Representa la tabla statistics.")
public class Statistics{	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@ApiModelProperty(value="Es la PK de la tabla, entero, auto incremental")
	private int Id;
	
	@JsonBackReference
	@ManyToOne(fetch=FetchType.LAZY)
	private Match Match;
	
	@JsonBackReference
	@ManyToOne(fetch=FetchType.LAZY)
	private Player Player;
	
	@NotNull(message = "El valor no puede ser nulo")
	private float Kills;
	@NotNull(message = "El valor no puede ser nulo")
	private float Deaths;
	@NotNull(message = "El valor no puede ser nulo")
	private float Assits;
	@NotNull(message = "El valor no puede ser nulo")
	private float Damage;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public Match getMatch() {
		return Match;
	}
	public void setMatch(Match match) {
		Match = match;
	}
	public Player getPlayer() {
		return Player;
	}
	public void setPlayer(Player player) {
		Player = player;
	}
	public float getKills() {
		return Kills;
	}
	public void setKills(float kills) {
		Kills = kills;
	}
	public float getDeaths() {
		return Deaths;
	}
	public void setDeaths(float deaths) {
		Deaths = deaths;
	}
	public float getAssits() {
		return Assits;
	}
	public void setAssits(float assits) {
		Assits = assits;
	}
	public float getDamage() {
		return Damage;
	}
	public void setDamage(float damage) {
		Damage = damage;
	}
}