package br.com.triersistemas.ProvaFinalJPA.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.triersistemas.ProvaFinalJPA.domain.GrupoCorrentista;
import br.com.triersistemas.ProvaFinalJPA.model.SomaSaldoContaCorrentes;

@Repository
public interface GrupoCorrentistaRepository extends JpaRepository<GrupoCorrentista, Integer>{
	
	@Query("SELECT new br.com.triersistemas.ProvaFinalJPA.model.SomaSaldoContaCorrentes(g, sum(c.saldo)) FROM grupo_correntista g JOIN g.conta_bancaria c group by g")
	List<SomaSaldoContaCorrentes> somaSaldoContasCorrentes();


}