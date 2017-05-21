package br.com.voo.model;

import java.util.Date;

public class Pessoa extends Entidade {

	
	private String nome;
	private Cpf cpf;
	private Cnpj cnpj;
	private String endereco;
	private Date dataNascimento;
	private EstadoCivil estadoCivil;
	private boolean isPessoaFisisca;
	
    
	
	public Pessoa(String nome, String cpf, String cnpj, String endereco, Date dataNascimento, EstadoCivil estadoCivil,
			boolean isPessoaFisisca) {
		super();
		this.nome = nome;
		this.cpf = new Cpf(cpf);
		this.cnpj = new Cnpj(cnpj);
		this.endereco = endereco;
		this.dataNascimento = dataNascimento;
		this.estadoCivil = estadoCivil;
		this.isPessoaFisisca = isPessoaFisisca;
	}
	public Pessoa(long id,String nome, String cpf, String cnpj, String endereco, Date dataNascimento, EstadoCivil estadoCivil,
			boolean isPessoaFisisca) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = new Cpf(cpf);
		this.cnpj = new Cnpj(cnpj);
		this.endereco = endereco;
		this.dataNascimento = dataNascimento;
		this.estadoCivil = estadoCivil;
		this.isPessoaFisisca = isPessoaFisisca;
	}

	public Pessoa() {
		super();
	}
	
	public String getNome() {
		return nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}


	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}


	public Cpf getCpf() {
		return cpf;
	}


	public Cnpj getCnpj() {
		return cnpj;
	}

	public boolean isPessoaFisisca() {
		return isPessoaFisisca;
	}

	

	
}
