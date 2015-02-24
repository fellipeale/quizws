package br.ufpr.ees.quizws.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.ufpr.ees.quizws.domain.Questao;
import br.ufpr.ees.quizws.service.QuestaoService;

@Controller
@RequestMapping("/questao")
public class QuestaoController {

	@Autowired
	private QuestaoService questaoService;

	@RequestMapping(value = "/")
	public @ResponseBody List<Questao> listAll() {
		return questaoService.listAll();
	}

	@RequestMapping(value = "/quantidade/{quantidade}")
	public @ResponseBody List<Questao> listQuantidade(
			@PathVariable int quantidade) {
		return questaoService.listQuantidade(quantidade);
	}

	@RequestMapping(value = "/test")
	public @ResponseBody Questao test() {
		Questao questao = new Questao();
		questao.setId(1);
		questao.setValor("Você sabe o que é caviar?");

		return questao;
	}

}
