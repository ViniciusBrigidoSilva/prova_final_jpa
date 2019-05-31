CREATE TABLE gerente (
	id INTEGER PRIMARY KEY,
	nome TEXT NOT NULL
);

CREATE SEQUENCE gerente_id_seq;

CREATE TABLE grupo_correntista (
	id INTEGER PRIMARY KEY,
	nome TEXT NOT NULL	
);

CREATE SEQUENCE grupo_correntista_id_seq;

CREATE TABLE correntista (
	id INTEGER PRIMARY KEY,
	nome TEXT NOT NULL,
	endereco TEXT NOT NULL,
	correntista_desde DATE NOT NULL,
	grupo_correntista_id integer not null references grupo_correntista
);

CREATE SEQUENCE correntista_id_seq;

CREATE TABLE conta_bancaria (
	id INTEGER PRIMARY KEY,
	correntista_id INTEGER NOT NULL REFERENCES correntista,
	gerente_id INTEGER NOT NULL REFERENCES gerente,
	numero_conta_bancaria TEXT NOT NULL,
	saldo NUMERIC (16,4) NOT NULL DEFAULT 0,
	limite_cheque_especial NUMERIC (16, 4) NOT NULL DEFAULT 0
);

CREATE SEQUENCE conta_bancaria_id_seq;

CREATE TABLE extrato_conta_bancaria (
	id INTEGER PRIMARY KEY,
	tipo_operacao TEXT NOT NULL CHECK (tipo_operacao IN ('E', 'S')),
	valor NUMERIC (16,4) NOT NULL,
	conta_bancaria_id INTEGER NOT NULL REFERENCES conta_bancaria
);

CREATE SEQUENCE extrato_conta_bancaria_id_seq;

------------------------------
INSERT INTO gerente VALUES 
	(nextval('gerente_id_seq'), 'Toninho'),
	(nextval('gerente_id_seq'), 'Zé das Couves'),
	(nextval('gerente_id_seq'), 'Virgulino');

insert into grupo_correntista values
	(nextval('grupo_correntista_id_seq'), 'Ouro'),
	(nextval('grupo_correntista_id_seq'), 'Prata'),
	(nextval('grupo_correntista_id_seq'), 'Bronze');

insert into correntista VALUES
	(nextval('correntista_id_seq'), 'Tião Macalé', 'Rua das Capivaras', '1958-01-08', 1),
	(nextval('correntista_id_seq'), 'João de Deus', 'Rua das Cabras', '2019-05-18', 2),
	(nextval('correntista_id_seq'), 'Maçaranduba', 'Rua Sem-saída', '2019-01-10', 2),
	(nextval('correntista_id_seq'), 'Zé do Caixão', 'Rua dos Onitorrincos', '2005-02-10', 3),
	(nextval('correntista_id_seq'), 'Sandro Plâncton', 'Rua dos Caramujos', '2007-02-10', 3);

INSERT INTO conta_bancaria values
	(nextval('conta_bancaria_id_seq'), 1, 1, '003214-1', 9000.5, 100),
	(nextval('conta_bancaria_id_seq'), 2, 2, '006614-1', 600.99, 200),
	(nextval('conta_bancaria_id_seq'), 3, 3, '002313-1', -500.0, 600),
	(nextval('conta_bancaria_id_seq'), 4, 1, '003446-1', 15.0, 100),
	(nextval('conta_bancaria_id_seq'), 5, 1, '046456-1', 0, 100);

INSERT INTO extrato_conta_bancaria VALUES
	(nextval('extrato_conta_bancaria_id_seq'), 'E', 10000, 1),
	(nextval('extrato_conta_bancaria_id_seq'), 'E', 0.5, 1),	
	(nextval('extrato_conta_bancaria_id_seq'), 'S', -1000, 1),	

	(nextval('extrato_conta_bancaria_id_seq'), 'E', 1000, 2),	
	(nextval('extrato_conta_bancaria_id_seq'), 'S', 399.01, 2),	

	(nextval('extrato_conta_bancaria_id_seq'), 'S', -500, 3),	

	(nextval('extrato_conta_bancaria_id_seq'), 'E', 5000, 4),	
	(nextval('extrato_conta_bancaria_id_seq'), 'S', -5000, 4),	
	(nextval('extrato_conta_bancaria_id_seq'), 'E', 150, 4),	
	(nextval('extrato_conta_bancaria_id_seq'), 'S', -135, 4);	




