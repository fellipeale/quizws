package br.ufpr.ees.quizws.service;

import java.util.List;

import br.ufpr.ees.quizws.domain.Questao;

public interface QuestaoService {

	List<Questao> listAll();
	
	List<Questao> listQuantidade(int quantidade);
	
}
