Instruções:

Crie um banco de dados chamado prova_final_jpa e execute o script ddl.sql. Implemente as questões abaixo e, ao seu término, faça o push do seu projeto no Github compartilhando-o com o professor.

1) Realize o mapeamento das entidades do banco de dados prova_final_jpa. Cada entidade deve possuir: Repository e classe de testes.

2) Crie uma consulta JPQL que faça a contagem de correntistas por gerente. Crie um model (dto) para representar o retorno dessa consulta. Faça o teste verificando (via assert) a quantidade de gerentes retornados pela consulta e a quantidade de correntistas do gerente de ID 1.

3) Crie uma consulta JPQL retornando a contagem geral de correntistas cadastrados. Faça o teste validando esta quantidade.

4) Crie uma consulta que busque os gerentes pelo nome de maneira CASE SENSITIVE. Faça o teste enviando o parâmetro de busca "Vir" e testando o seu retorno.

5) Crie uma consulta JPQL que faça a contagem de correntistas por grupo_correntista. Crie um model (dto) para representar o retorno dessa consulta. Faça o teste verificando a quantidade de correntistas do grupo de ID 1.

6) Crie uma consulta que retorne somente a data do correntista mais antigo. Crie um assert para validar este retorno.

7) Crie uma consulta que busque os correntistas pelo seu endereço de maneira CASE INSENSITIVE. Faça o teste enviando o parâmetro de busca "Rua dos Caramujos" e testando o tamanho da lista retornada e o nome do correntista encontrado.

8) Crie uma consulta JPQL que encontre o correntista que mais realizou movimentos (extrato_conta_bancaria) na sua conta corrente. Realize um assert verificando se o retorno é o esperado.

9) Crie uma consulta que retorne todos os correntistas que não fizeram movimentação (extrato_conta_bancaria vazio) na sua conta corrente. Realize um assert verificando se o retorno é o esperado.

10) Crie uma consulta JPQL que faça a soma do saldo das contas correntes pelo grupo_correntista. Crie um model (dto) para representar o retorno dessa consulta. Faça o teste verificando a soma do saldo do grupo de ID 1.


░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░
░░░░░░░░░░░░░░░░░░░░░░████████░░░░░░░░░
░░███████░░░░░░░░░░███▒▒▒▒▒▒▒▒███░░░░░░
░░█▒▒▒▒▒▒█░░░░░░░███▒▒▒▒▒▒▒▒▒▒▒▒███░░░░
░░░█▒▒▒▒▒▒█░░░░██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██░░
░░░░█▒▒▒▒▒█░░░██▒▒▒▒▄██▄▒▒▒▒▄██▄▒▒▒███░
░░░░░█▒▒▒█░░░█▒▒▒▒▒▒████▒▒▒▒████▒▒▒▒▒██
░░░█████████████▒▒▒▒▀██▀▒▒▒▒▀██▀▒▒▒▒▒██
░░░█▒▒▒▒▒▒▒▒▒▒▒▒█▒▒▒▒▒▒▒▒▒█▒▒▒▒▒▒▒▒▒▒██
░██▒▒▒▒▒▒▒▒▒▒▒▒▒█▒▒▒██▒▒▒▒▒▒▒▒▒██▒▒▒▒██
██▒▒▒███████████▒▒▒▒▒██▒▒▒▒▒▒▒██▒▒▒▒▒██
█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█▒▒▒▒▒▒███████▒▒▒▒▒▒▒██
██▒▒▒▒▒▒▒▒▒▒▒▒▒▒█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██░
░█▒▒▒███████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██░░░
░██▒▒▒▒▒▒▒▒▒▒▒███▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█░░░░░
░░████████████░░░████████████████░░░░░░
░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░
░░▄█████▄░▄███████▄░▄███████▄░██████▄░░
░░██▒▒▒▒█░███▒▒▒███░███▒▒▒███░██▒▒▒██░░
░░██▒▒▒▒▒░██▒▒▒▒▒██░██▒▒▒▒▒██░██▒▒▒██░░
░░██▒▒▒▀█░███▒▒▒███░███▒▒▒███░██▒▒▒██░░
░░▀█████▀░▀███████▀░▀███████▀░██████▀░░
░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░
░░░░██▒▒▒▒░██▒▒▒██░▄█████░██▒▒▒▒██▀░░░░
░░░░██▒▒▒▒░██▒▒▒██░██▀▒▒▒░██▒▒▒██░░░░░░
░░░░██▒▒▒▒░██▒▒▒██░██▒▒▒▒░█████▀░░░░░░░
░░░░██▒▒▒▒░██▄▒▄██░██▄▒▒▒░██▒▒▒██░░░░░░
░░░░▀█████░▀█████▀░▀█████░██▒▒▒▒██▄░░░░
░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░
