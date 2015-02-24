package br.ufpr.ees.quizws.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
		
		List<Questao> questoesFiltradas = new ArrayList<Questao>();
		List<Questao> questoes = questaoDAO.list();
		
		Collections.shuffle(questoes);
		
//		return questoes.stream().limit(quantidade).collect(Collectors.toList());
		
		for (int i = 0; i < quantidade; i++) {
			questoesFiltradas.add(questoes.get(i));
		}
		
		return questoesFiltradas;		
	}

}
