package br.com.caelum.ingresso.model.form;

import java.time.LocalTime;

import br.com.caelum.ingresso.model.Filme;
import br.com.caelum.ingresso.model.Sala;

public class Sessao {
	
	private Integer ID;
	private LocalTime horario;
	private Sala sala;
	private Filme filme;
	
	public Sessao(LocalTime horario, Filme filme, Sala sala) {
		this.horario = horario;
		this.filme = filme;
		this.sala = sala;
	}
	
	public Integer getID() {
		return ID;
	}
	
	public void setID(Integer iD) {
		this.ID = iD;
	}
	
	public LocalTime getHorario() {
		return horario;
	}
	
	public void setHorario(LocalTime horario) {
		this.horario = horario;
	}
	
	public Filme getFilme() {
		return filme;
	}
	
	public void setFilme(Filme filme) {
		this.filme = filme;
	}
	
	public Sala getSala() {
		return sala;
	}
	
	public void setSala(Sala sala) {
		this.sala = sala;
	}

}
