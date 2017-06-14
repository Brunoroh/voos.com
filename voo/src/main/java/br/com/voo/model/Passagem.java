package br.com.voo.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Passagem extends Entidade {

	private Passageiro passageiro;
	private Passageiro responsavel;
	private Voo voo;
	private String situacao;
	private String statusChekIn;
	private String hashCheckIn;
	private Poltrona poltrona;
	private boolean statusCheckIn;
	private Double valor;
	private String tipoCliente;
	


	public static final String SituacaoEmberto = "Em Aberto";
	public static final String SituacaoAlocado = "Alocada";

	public Passagem(Long codigo, Passageiro passageiro, Passageiro responsavel, String situacao, String hashCheckIn,
			boolean statusCheckIn, Double valor, Voo voo, Poltrona poltrona) {
		super();
		this.passageiro = passageiro;
		this.responsavel = responsavel;
		this.situacao = situacao;
		this.hashCheckIn = hashCheckIn;
		this.voo = voo;
		this.statusCheckIn = statusCheckIn;
		this.valor = new Double(valor);
		this.id = codigo;
		this.poltrona = poltrona;
	}
    
	public Passagem() {
		super();
	}

	public Passageiro getPassageiro() {
		return passageiro;
	}

	public void setPassageiro(Passageiro passageiro) {
		this.passageiro = passageiro;
	}

	public Passageiro getRespossavel() {
		return responsavel;
	}

	public void setRespossavel(Passageiro respossavel) {
		this.responsavel = respossavel;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public String getHashCheckIn() {
		return hashCheckIn;
	}

	public void setHashCheckIn(String hashCheckIn) {
		this.hashCheckIn = hashCheckIn;
	}

	public boolean isStatusCheckIn() {
		return statusCheckIn;
	}

	public void setStatusCheckIn(boolean statusCheckIn) {
		this.statusCheckIn = statusCheckIn;
	}

	public Double getValor() {
		return voo.getItinerario().getValor() + poltrona.getValor();
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Passageiro getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(Passageiro responsavel) {
		this.responsavel = responsavel;
	}

	public Voo getVoo() {
		return voo;
	}

	public void setVoo(Voo voo) {
		this.voo = voo;
	}

	public Poltrona getPoltrona() {
		return poltrona;
	}

	public void setPoltrona(Poltrona poltrona) {
		this.poltrona = poltrona;
	}

	public String getStatusChekIn() {
		return statusChekIn;
	}

	public void setStatusChekIn(String statusChekIn) {
		this.statusChekIn = statusChekIn;
	}
	public String getTipoCliente() {
		return tipoCliente;
	}

	public void setTipoCliente(String tipoCliente) {
		this.tipoCliente = tipoCliente;
	}

}
