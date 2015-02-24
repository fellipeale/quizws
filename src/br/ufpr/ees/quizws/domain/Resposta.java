package br.ufpr.ees.quizws.domain;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Resposta extends AbstractEntity {

	private static final long serialVersionUID = 7792132158764973105L;

	private String valor;
	private boolean correta;
	private Questao questao;

	public String getValor() {
		return valor;
	}

	public boolean isCorreta() {
		return correta;
	}

	@ManyToOne
	@JoinColumn(name = "questaoId")
	@JsonBackReference
	public Questao getQuestao() {
		return questao;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public void setCorreta(boolean correta) {
		this.correta = correta;
	}

	public void setQuestao(Questao questao) {
		this.questao = questao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (correta ? 1231 : 1237);
		result = prime * result + ((questao == null) ? 0 : questao.hashCode());
		result = prime * result + ((valor == null) ? 0 : valor.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Resposta other = (Resposta) obj;
		if (correta != other.correta)
			return false;
		if (questao == null) {
			if (other.questao != null)
				return false;
		} else if (!questao.equals(other.questao))
			return false;
		if (valor == null) {
			if (other.valor != null)
				return false;
		} else if (!valor.equals(other.valor))
			return false;
		return true;
	}

}
