# ByteBankAccounts
ByteBankAccounts é um sistema bancário desenvolvido em Java para gerenciar contas correntes, poupanças e contas especiais. O sistema oferece diversas funcionalidades de gerenciamento de contas, como depósitos, saques, transferências, cálculo de impostos e armazenamento de referências.

O programa também implementa exceções para lidar com situações excepcionais, como saldo insuficiente, e define interfaces para objetos tributáveis e seguros de vida.

Com o ByteBankAccounts, é possível realizar diversas operações bancárias de forma fácil e segura, tornando a gestão financeira mais eficiente.

## O programa conta com as seguintes classes:
Cliente: representa um cliente do banco e armazena informações como nome, CPF, endereço, etc.<br>
<br>Conta: classe abstrata que define o comportamento básico de uma conta bancária, como depósitos, saques e transferências.<br>
<br>ContaCorrente: classe que estende a classe Conta e representa uma conta corrente, que permite saques ilimitados e geralmente tem uma taxa de manutenção.<br>
<br>ContaPoupanca: classe que estende a classe Conta e representa uma conta poupança, que geralmente tem uma taxa de juros para incentivar a poupança.<br>
<br>ContaEspecial: classe que estende a classe Conta e representa uma conta especial, que geralmente oferece um limite de crédito adicional ao cliente.<br>
<br>CalculadorDeImposto: classe que implementa um algoritmo para calcular o imposto devido em uma conta bancária, levando em conta o tipo da conta e o valor do saldo.<br>
<br>GuardadorDeContas: classe que armazena um conjunto de contas bancárias.<br>
<br>GuardadorDeReferencias: classe que armazena um conjunto de referências a objetos do tipo Conta, sem armazenar os próprios objetos.<br>
<br>NumeroDaContaComparator: classe que implementa um comparador para ordenar contas bancárias pelo número da conta.<br>
<br>SaldoInsuficienteException: exceção que é lançada quando uma operação de saque ou transferência é tentada em uma conta com saldo insuficiente.<br>
<br>SeguroDeVida: interface que define o comportamento de um seguro de vida, como calcular o prêmio a ser pago e as coberturas oferecidas.<br>
<br>Tributável: interface que define o comportamento de um objeto que é tributável, isto é, que está sujeito a impostos.


### Contribuindo
Este é um projeto de código aberto e contribuições são bem-vindas. Caso tenha alguma sugestão ou correção a fazer, por favor abra uma issue ou submeta um pull request.


#

### Dev. Caio Bello
