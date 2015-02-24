package br.ufpr.ees.quizws.persistence;

import java.util.List;

import br.ufpr.ees.quizws.domain.Questao;

public interface QuestaoDAO {

	public List<Questao> list();
	
}
