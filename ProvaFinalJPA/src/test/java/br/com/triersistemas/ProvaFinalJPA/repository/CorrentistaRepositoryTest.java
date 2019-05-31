package br.com.triersistemas.ProvaFinalJPA.repository;

import java.time.LocalDate;
import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.triersistemas.ProvaFinalJPA.domain.Correntista;
import br.com.triersistemas.ProvaFinalJPA.domain.ExtratoContaBancaria;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CorrentistaRepositoryTest {

	@Autowired
	private CorrentistaRepository correntistaRepository;

	@Test
	public void testFindByCorrentistaId() {
		Correntista correntista = correntistaRepository.findByCorrentistaId(1);
		Assertions.assertThat(correntista.getNome()).isEqualTo("Tião Macalé");
	}

	@Test
	public void buscarCorrentistaEONomeDoSeuGerente() {

		List<Correntista> correntistas = correntistaRepository.findAll();

		for (Correntista correntista : correntistas) {
			System.out.println(String.format("%s -> %s", correntista.getNome(),
					correntista.getGerente() != null ? correntista.getGerente().getNome() : "Sem Gerente"));

		}

		Assertions.assertThat(correntistas.size()).isEqualTo(5);
		Assertions.assertThat(correntistas.get(0).getGerente().getId()).isEqualTo(1);

	}

	@Test
	public void buscaTotalCorrentistas() {
		List<Correntista> correntistas = correntistaRepository.findAll();
		Assertions.assertThat(correntistas.size()).isEqualTo(5);
	}

	@Test
	public void buscaDataCorrentistaMaisAntiga() {
		LocalDate correntistaDesde = correntistaRepository.buscarDataCorrentistaMaisAntiga();
		Assertions.assertThat(correntistaDesde).isEqualTo(LocalDate.of(1958, 1, 8));
	}

	@Test
	public void buscaCorrentistaPeloEndereco() {
		List<Correntista> correntistas = correntistaRepository.findByEnderecoWithIgnoreCase("Rua dos Caramujos");

		Assertions.assertThat(correntistas.size()).isEqualTo(1);
	}

	@Test
	public void buscarCorrentistaSemMovimentacao() {
		List<Correntista> correntistas = correntistaRepository.findByMovimentacaoIsNull();
		Assertions.assertThat(correntistas.size()).isEqualTo(1);
		Assertions.assertThat(correntistas.get(0).getNome()).isEqualTo("Sandro Plâncton");
	}
    @Test
    public void buscarColaboradorComMaismovimentos() {

        List<Correntista> correntistas = correntistaRepository.findByCorrentistaComMaisTransacoes();

        for (Correntista correntista : correntistas) {

            for (ExtratoContaBancaria extratoContaBancaria : correntista.getExtratoContaBancaria()) {
                System.out.println(String.format("%s -> %s", correntista.getNome(), extratoContaBancaria.getContaBancaria().getCorrentista().getNome()));
            }

        }

        Assertions.assertThat(correntistas.size()).isEqualTo(4);
        Assertions.assertThat(correntistas.get(0).getId()).isEqualTo(4);

    }

}
