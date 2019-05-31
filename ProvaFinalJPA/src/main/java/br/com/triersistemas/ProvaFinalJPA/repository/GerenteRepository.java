package br.com.triersistemas.ProvaFinalJPA.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.triersistemas.ProvaFinalJPA.domain.Gerente;
import br.com.triersistemas.ProvaFinalJPA.model.CorrentistasPorGerente;

@Repository
public interface GerenteRepository extends JpaRepository<Gerente, Integer> {

	@Query("SELECT new br.com.triersistemas.ProvaFinalJPA.model.CorrentistasPorGerente(c, g.nome) FROM correntista c JOIN c.gerente g group by c")
	List<CorrentistasPorGerente> correntistasPorGerente();

	List<Gerente> findByNomeWithIgnoreCase(String nome);

}
