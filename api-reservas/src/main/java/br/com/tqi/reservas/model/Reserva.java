package br.com.tqi.reservas.model;

import java.time.LocalDateTime;

public class Reserva {

	private Long codigo;
	private String descricao;
	private LocalDateTime data;
	private LocalDateTime devolucao;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public LocalDateTime getDevolucao() {
		return devolucao;
	}

	public void setDevolucao(LocalDateTime devolucao) {
		this.devolucao = devolucao;
	}

}
