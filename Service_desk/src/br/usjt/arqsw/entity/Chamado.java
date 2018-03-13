package br.usjt.arqsw.entity;

import java.sql.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Chamado {
	
	@NotNull(message="O chamado nao pode estar vazio")
	@Min(value=1, message="O chamado nao pode estar vazio")
	private int Id;
	
	@NotNull
	@Size(min=5, max=100, message="A descricao do chamado deve estar entre 5 e 100 caracteres.")
	private String Desc;
	
	@NotNull
	@Size(min=5, max=10, message="O status do chamado deve estar entre 5 e 10 caracteres.")	
	private String Status;
	
	@NotNull
	@Size(max=10, message="A data de abertura do chamado deve conter 10 caracteres.")	
	private Date Dt_Abertura;
	
	@Size(max=10, message="A data de fechamento do chamado deve conter 10 caracteres.")
	private Date Dt_Fechamento;
	
	@NotNull(message="A fila nao pode estar vazia")
	@Min(value=1, message="A fila nao pode estar vazia")
	private Fila fila;
	
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getDesc() {
		return Desc;
	}
	public void setDesc(String desc) {
		Desc = desc;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public Date getDt_Abertura() {
		return Dt_Abertura;
	}
	public void setDt_Abertura(Date dt_Abertura) {
		Dt_Abertura = dt_Abertura;
	}
	public Date getDt_Fechamento() {
		return Dt_Fechamento;
	}
	public void setDt_Fechamento(Date dt_Fechamento) {
		Dt_Fechamento = dt_Fechamento;
	}
	public Fila getFila() {
		return fila;
	}
	public void setFila(Fila fila) {
		this.fila = fila;
	}
	public String toString() {
		return "Chamado [id_chamado=" + Id + ", descricao=" + Desc + ", status" + Status + ", data_abertura" + Dt_Abertura 
				+ ", data_fechamento" + Dt_Fechamento + ", id_fila" + fila +  "]";
	}
	

}
