# byteBankAccounts
O programa é um sistema bancário em Java que gerencia contas correntes, poupanças e especiais, oferece funcionalidades de gerenciamento de contas, cálculo de impostos e armazenamento de referências. Implementa exceções para saldo insuficiente e define interfaces para objetos tributáveis e seguros de vida.

## Sistema Bancário em Java
Este é um programa em Java que implementa um sistema bancário para gerenciamento de contas correntes, poupanças e contas especiais de clientes. O programa oferece funcionalidades como depósitos, saques, transferências, cálculo de impostos, armazenamento de referências a contas e tratamento de exceções.

### Classes Implementadas
O programa conta com as seguintes classes:
Cliente: representa um cliente do banco e armazena informações como nome, CPF, endereço, etc.
Conta: classe abstrata que define o comportamento básico de uma conta bancária, como depósitos, saques e transferências.
ContaCorrente: classe que estende a classe Conta e representa uma conta corrente, que permite saques ilimitados e geralmente tem uma taxa de manutenção.
ContaPoupanca: classe que estende a classe Conta e representa uma conta poupança, que geralmente tem uma taxa de juros para incentivar a poupança.
ContaEspecial: classe que estende a classe Conta e representa uma conta especial, que geralmente oferece um limite de crédito adicional ao cliente.
CalculadorDeImposto: classe que implementa um algoritmo para calcular o imposto devido em uma conta bancária, levando em conta o tipo da conta e o valor do saldo.
GuardadorDeContas: classe que armazena um conjunto de contas bancárias.
GuardadorDeReferencias: classe que armazena um conjunto de referências a objetos do tipo Conta, sem armazenar os próprios objetos.
NumeroDaContaComparator: classe que implementa um comparador para ordenar contas bancárias pelo número da conta.
SaldoInsuficienteException: exceção que é lançada quando uma operação de saque ou transferência é tentada em uma conta com saldo insuficiente.
SeguroDeVida: interface que define o comportamento de um seguro de vida, como calcular o prêmio a ser pago e as coberturas oferecidas.
Tributável: interface que define o comportamento de um objeto que é tributável, isto é, que está sujeito a impostos.


### Contribuindo
Este é um projeto de código aberto e contribuições são bem-vindas. Caso tenha alguma sugestão ou correção a fazer, por favor abra uma issue ou submeta um pull request.


#

### Dev. Caio Bello
