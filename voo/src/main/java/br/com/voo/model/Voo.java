package br.com.voo.model;

import java.time.LocalDate;

public class Voo extends Entidade {
	
	private LocalDate horario;
	private Itinerario itinerario;
	private Aeronave aeronave;
	
	public Voo(){
		
	}
	
	public Voo(Long id){
		super(new Long(id));
	}
	
	public Voo(LocalDate horario, Itinerario itinerario, Aeronave aeronave) {
		super();
		this.horario = horario;
		this.itinerario = itinerario;
		this.aeronave = new Aeronave(aeronave);
	}
	
	public Voo(Long id,LocalDate horario, Itinerario itinerario, Aeronave aeronave) {
		super(id);
		this.horario = horario;
		this.itinerario = itinerario;
		this.aeronave = new Aeronave(aeronave);
	}

	public LocalDate getHorario() {
		return horario;
	}

	public Itinerario getItinerario() {
		return itinerario;
	}

	public long getCodigoAeronave() {
		return aeronave.getId();
	}
	
	public long getCodigoItinerario(){
		return itinerario.getId();
	}
	
	public String getOrigem(){
		return itinerario.getOrigem();
	}
	
	public String getDestino(){
		return itinerario.getDestino();
	}
	
	public String getDescricaoAeronave(){
		return aeronave.getDescricao();
	}
	
	public Aeronave getAeronave(){
		return new Aeronave(this.aeronave);
	}
	
	

}
