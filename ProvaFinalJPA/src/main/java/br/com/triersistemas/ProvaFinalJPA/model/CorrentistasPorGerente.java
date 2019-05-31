package br.com.triersistemas.ProvaFinalJPA.model;

import br.com.triersistemas.ProvaFinalJPA.domain.Correntista;
import br.com.triersistemas.ProvaFinalJPA.domain.Gerente;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class CorrentistasPorGerente {
	
	private Correntista correntista;
	private Gerente gerente;

}
