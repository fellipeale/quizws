package br.ufpr.ees.quizws.persistence.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.ufpr.ees.quizws.domain.Questao;
import br.ufpr.ees.quizws.persistence.QuestaoDAO;

@Repository
@Transactional
public class HibernateQuestaoDAO implements QuestaoDAO {

	@Autowired
	private SessionFactory session;

	@SuppressWarnings("unchecked")
	@Override
	public List<Questao> list() {
		Criteria crit =  this.session.getCurrentSession().createCriteria(Questao.class);
		crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		
		return crit.list();
	}

}
