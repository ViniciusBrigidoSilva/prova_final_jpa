package br.com.triersistemas.ProvaFinalJPA.model;

import br.com.triersistemas.ProvaFinalJPA.domain.GrupoCorrentista;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class SomaSaldoContaCorrentes {
	
	private GrupoCorrentista grupo;
	private Double saldoSomado;

}
