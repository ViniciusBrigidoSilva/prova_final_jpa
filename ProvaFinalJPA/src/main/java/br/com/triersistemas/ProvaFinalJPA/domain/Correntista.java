package br.com.triersistemas.ProvaFinalJPA.domain;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Correntista {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "correntista_gen")
	@SequenceGenerator(name = "correntista_gen", sequenceName = "correntista_id_seq", allocationSize = -1)
	private Integer id;

	private String nome;

	private String endereco;

	@Column(name = "correntista_desde")
	private LocalDate correntistaDesde;

	@ManyToOne
	@JoinColumn(name = "grupo_correntista_id", referencedColumnName = "id")
	private GrupoCorrentista grupoCorrentista;
	
	@ManyToOne
	@JoinColumn(name = "gerente_id", referencedColumnName = "id")
	private Gerente gerente;

	@OneToMany(mappedBy = "correntista")
	private List<ContaBancaria> contaBancaria;
	
	 @OneToMany(mappedBy = "correntista")
	    private List<ExtratoContaBancaria> extratoContaBancaria;

}
//id integer NOT NULL,
//nome text NOT NULL,
//endereco text NOT NULL,
//correntista_desde date NOT NULL,
//grupo_correntista_id integer NOT NULL,