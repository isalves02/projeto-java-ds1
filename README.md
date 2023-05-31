-- SISTEMA
- a conta deverá ser única (não é permitido repetir o n° de conta)
- o saldo inicial para abrir conta é R$50,00 (ou seja, algum saldo pré-definido)
- conta poupança ou especial
- o saque é permitido através da soma + limite
- quando excede o saldo sacando até o limite, o saldo fica negativo
- dinâmica do menu:
	1° - abrir conta
	2° - encerrar login
	3° - sacar
	4° - depositar	
	5° - consultar saldo
	6° - sair (tipo um break);

--- REGRA DE NEGÓCIO
- conta poupança não pode ser encerrada se houver saldo
- conta especial não pode ser encerrada se houver saldo
- conta especial não pode ser encerrada se houver saldo NEGATIVO, faz-se necessário o depósito do valor da dívida para que a mesma possa ser encerrada
