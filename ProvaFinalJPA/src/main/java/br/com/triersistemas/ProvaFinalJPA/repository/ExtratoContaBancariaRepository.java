package br.com.triersistemas.ProvaFinalJPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.triersistemas.ProvaFinalJPA.domain.ExtratoContaBancaria;

@Repository
public interface ExtratoContaBancariaRepository extends JpaRepository<ExtratoContaBancaria, Integer>{
	


}
