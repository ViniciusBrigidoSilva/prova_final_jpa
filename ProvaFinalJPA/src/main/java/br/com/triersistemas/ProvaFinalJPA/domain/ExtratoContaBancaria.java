package br.com.triersistemas.ProvaFinalJPA.domain;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class ExtratoContaBancaria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "extrato_conta_bancaria_gen")
	@SequenceGenerator(name = "extrato_conta_bancaria_gen", sequenceName = "extrato_conta_bancaria_id_seq", allocationSize = -1)
	private Integer id;
	
	private String tipoOperacao;
	
	private BigDecimal valor;
	
	@ManyToOne
    @JoinColumn(name = "conta_bancaria_id", referencedColumnName = "id")
    private ContaBancaria contaBancaria;

}
//id integer NOT NULL,
//tipo_operacao text NOT NULL,
//valor numeric(16,4) NOT NULL,
//conta_bancaria_id integer NOT NULL,