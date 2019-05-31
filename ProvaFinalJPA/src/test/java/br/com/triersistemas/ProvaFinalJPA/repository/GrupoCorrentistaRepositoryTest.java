package br.com.triersistemas.ProvaFinalJPA.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.triersistemas.ProvaFinalJPA.domain.Correntista;
import br.com.triersistemas.ProvaFinalJPA.domain.GrupoCorrentista;
import br.com.triersistemas.ProvaFinalJPA.model.SomaSaldoContaCorrentes;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GrupoCorrentistaRepositoryTest {

	@Autowired
	private GrupoCorrentistaRepository grupoCorrentistaRepository;

	@Transactional
	@Test
	public void FindAllTest() {

		List<GrupoCorrentista> grupos = grupoCorrentistaRepository.findAll();// SELECT * FROM clube.

		for (GrupoCorrentista gupoCorrentista : grupos) {
			System.out.println(gupoCorrentista);

			for (Correntista correntista : gupoCorrentista.getCorrentistas()) {// SELECT * FROM jogador WHERE
				System.out.println(correntista);

			}
		}

		Assertions.assertThat(grupos.size()).isEqualTo(3);
	}

	@Test
	public void somaSaldoPorGrupo() {

		List<SomaSaldoContaCorrentes> listaDeSaldos = grupoCorrentistaRepository.somaSaldoContasCorrentes();

		for (SomaSaldoContaCorrentes somaSaldoContaCorrentes : listaDeSaldos) {
			System.out.println("Clube: " + somaSaldoContaCorrentes.getGrupo().getNome() + " - "
					+ somaSaldoContaCorrentes.getSaldoSomado());
		}

		Assertions.assertThat(listaDeSaldos.size()).isEqualTo(3);

	}

}