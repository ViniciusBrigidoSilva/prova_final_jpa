package br.com.triersistemas.ProvaFinalJPA.model;

import br.com.triersistemas.ProvaFinalJPA.domain.Correntista;
import br.com.triersistemas.ProvaFinalJPA.domain.GrupoCorrentista;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ContagemCorrentistasPorGrupoCorrentista {
	
	private Correntista correntista;
	private GrupoCorrentista grupoCorrentista;

}
