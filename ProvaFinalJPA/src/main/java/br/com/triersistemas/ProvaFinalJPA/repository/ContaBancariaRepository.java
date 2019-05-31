package br.com.triersistemas.ProvaFinalJPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.triersistemas.ProvaFinalJPA.domain.ContaBancaria;

@Repository
public interface ContaBancariaRepository extends JpaRepository<ContaBancaria, Integer>{

}
