package br.com.triersistemas.ProvaFinalJPA.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.triersistemas.ProvaFinalJPA.domain.Correntista;

@Repository
public interface CorrentistaRepository extends JpaRepository<Correntista, Integer> {

	@Query(value = "SELECT c FROM Correntista c JOIN FETCH c.gerente where c.id = :id")
	Correntista findByCorrentistaId(@Param("id") Integer id);

	@Query("SELECT min(c.correntistaDesde) FROM Correntista c")
	LocalDate buscarDataCorrentistaMaisAntiga();

	List<Correntista> findByEnderecoWithIgnoreCase(String endereco);

	List<Correntista> findByMovimentacaoIsNull();
	
	@Query(value = "SELECT c FROM Correntista c JOIN FETCH c.extratoContaBancaria a ORDER BY a.extratoContaBancaria DESC LIMIT 1")
    List<Correntista> findByCorrentistaComMaisTransacoes();
	
	//SELECT conta_bancaria_id, count(*) FROM	extrato_conta_bancaria GROUP BY conta_bancaria_id ORDER BY 2 DESC LIMIT 1;

}
