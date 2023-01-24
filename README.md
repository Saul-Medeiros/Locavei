# Locavei
<h3>Especificação Informal</h3>
<p>A seguir é apresentado o documento de requisitos do <i>Subsistema Locacao</i> parte do projeto LOCAVEI e seu Diagrama de Classes. Este documento é resultado da fase de elicitação de requisitos do processo de engenharia de requisitos.</p>
<p>Implemente o Diagrama de Classes para o Subsistema de locação de veículos, considerando:</p>
<b>A. Visão Geral do Sistema</b>
<ul>
 <li>O subsistema <i>Locacao</i> do projeto LOCAVEI tem como objetivo principal fazer o registro de locação do automóvel, através da inserção de dados do veículo a ser escolhido por meio de um catálogo predeterminado.</li>
</ul>
<b>B. Requisitos Funcionais</b>
<ul>
 <li>O sistema deve ser utilizado pelo funcionário responsável pela locação de veiculos, que deverá inserir as informações do veículo de acordo com o que foi escolhido pelo cliente.</li>
 <li>Cada automóvel pertence a uma única locação.</li>
 <li>Do carro popular é importante saber o modelo, a placa, a disponibilidade, a quilometragem e o valor da díaria do aluguel.</li>
 <li>O sistema deve averiguar e validar a disponibilidade do veículo.</li>
 <li>O layout da saída deve mostrar todas as informações do contrato da locação e do veículo alugado.</li>
</ul>
<b>C. Regras de Negócio</b>
<ul>
 <li>validar(modelo: String): retorna uma mensagem informando a disponibilidade do veículo e encerra o sistema se caso o veículo não estiver disponível.</li>
 <li>adicionarSeguro(idade: int): modifica o valor do aluguel de acordo com a idade informada pelo cliente.</li>
</ul>
<b>D. Diagrama de Classes</b>
<br>
<img src="https://github.com/Saul-Medeiros/Locavei/blob/main/Main.jpg"/>
<hr>
<p>Código feito utilizando Netbeans IDE 8.2 e diagrama de classes feito no StarUML.</p> 
