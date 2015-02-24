package br.ufpr.ees.quizws.service.impl;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ufpr.ees.quizws.domain.Questao;
import br.ufpr.ees.quizws.persistence.QuestaoDAO;
import br.ufpr.ees.quizws.service.QuestaoService;

@Service
public class DefaultQuestaoService implements QuestaoService {

	@Autowired
	private QuestaoDAO questaoDAO;
	
	@Override
	public List<Questao> listAll() {
		return questaoDAO.list();
	}

	@Override
	public List<Questao> listQuantidade(int quantidade) {
		
		List<Questao> questoes = questaoDAO.list();
		
		Collections.shuffle(questoes);
		
		return questoes.stream().limit(quantidade).collect(Collectors.toList());
	}

}
