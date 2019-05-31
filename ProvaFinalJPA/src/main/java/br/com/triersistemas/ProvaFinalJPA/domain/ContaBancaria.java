package br.com.triersistemas.ProvaFinalJPA.domain;

import java.math.BigDecimal;
import java.util.List;

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
public class ContaBancaria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "conta_bancaria_gen")
	@SequenceGenerator(name = "conta_bancaria_gen", sequenceName = "conta_bancaria_id_seq", allocationSize = -1)
	private Integer id;
	
	@ManyToOne
    @JoinColumn(name = "correntista_id", referencedColumnName = "id")
    private Correntista correntista;
	
	private String numeroContaBancaria;
	
	@ManyToOne
    @JoinColumn(name = "gerente_id", referencedColumnName = "id")
    private Gerente gerente;
	
	private BigDecimal saldo;
	
	private BigDecimal limiteChequeEspecial;
	
	@OneToMany(mappedBy = "conta_bancaria")
	private List<ExtratoContaBancaria> extratos;
	
}
//id integer NOT NULL,
//correntista_id integer NOT NULL,
//gerente_id integer NOT NULL,
//numero_conta_bancaria text NOT NULL,
//saldo numeric(16,4) NOT NULL DEFAULT 0,
//limite_cheque_especial numeric(16,4) NOT NULL DEFAULT 0,
