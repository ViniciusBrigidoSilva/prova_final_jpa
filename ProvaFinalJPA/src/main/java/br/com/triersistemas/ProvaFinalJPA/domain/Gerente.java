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
public class Gerente {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gerente_gen")
	@SequenceGenerator(name = "gerente_gen", sequenceName = "gerente_id_seq", allocationSize = -1)
	private Integer id;

	private String nome;

	@OneToMany(mappedBy = "gerente")
	private List<ContaBancaria> contaBancaria;

}
//id integer NOT NULL,
//nome text NOT NULL,