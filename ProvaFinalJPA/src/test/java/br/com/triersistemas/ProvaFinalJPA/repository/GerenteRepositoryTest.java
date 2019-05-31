package br.com.triersistemas.ProvaFinalJPA.repository;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.triersistemas.ProvaFinalJPA.domain.Gerente;
import br.com.triersistemas.ProvaFinalJPA.model.CorrentistasPorGerente;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GerenteRepositoryTest {

	@Autowired
	private GerenteRepository gerenteRepository;
	
	@Test
	public void correntistasPorGerentesTest() {

		List<CorrentistasPorGerente> listaDeCorrentistaPorGerente = gerenteRepository.correntistasPorGerente();

		for (CorrentistasPorGerente correntistasPorGerente : listaDeCorrentistaPorGerente) {
			System.out.println("Clube: " + correntistasPorGerente.getCorrentista().getNome() + " - "
					+ correntistasPorGerente.getGerente().getNome());
		}

		Assertions.assertThat(listaDeCorrentistaPorGerente.size()).isEqualTo(3);
		//Assertions.assertThat(listaDeCorrentistaPorGerente.

	}


	@Test
	public void buscaGerentesPeloNome() {
		List<Gerente> gerentes = gerenteRepository.findByNomeWithIgnoreCase("Vir");
		Assertions.assertThat(gerentes.size()).isEqualTo(1);
	}

}
