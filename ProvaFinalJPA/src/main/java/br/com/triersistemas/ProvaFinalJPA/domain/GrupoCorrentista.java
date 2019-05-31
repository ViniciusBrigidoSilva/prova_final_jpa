package br.com.triersistemas.ProvaFinalJPA.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class GrupoCorrentista {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "grupo_correntista_gen")
	@SequenceGenerator(name = "grupo_correntista_gen", sequenceName = "grupo_correntista_id_seq")
	private Integer id;

	private String nome;

	@OneToMany(mappedBy = "grupo_correntista")
	private List<Correntista> correntistas;

}
//id integer NOT NULL,
//nome text NOT NULL,