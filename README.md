# ATIVIDADE BACK-END 22.10

#PARTE TEÓRICA


ALUNOS: ANTONIO ALEXANDRE E JOÃO NEVES 
Questão 1 — Sobrecarga de métodos 
A sobrecarga de métodos acontece quando uma classe possui dois ou mais métodos 
com o mesmo nome, mas com diferentes parâmetros, seja na quantidade ou nos tipos. 
Questão 2 — Sobrescrita de métodos 
Sobrescrever um método significa criar, em uma subclasse, uma nova implementação 
de um método herdado da superclasse, mantendo sua assinatura compatível.                 
A anotação @Override serve para indicar que o método está sendo sobrescrito e ajuda 
o compilador a identificar possíveis erros. 
Questão 3 — Herança 
Considere public class Aluno extends Pessoa. 
a) A superclasse é Pessoa. 
b) A subclasse é Aluno. 
c) A palavra-chave extends serve para indicar que uma classe está herdando de outra, 
permitindo reutilizar atributos e métodos acessíveis da superclasse. 
Questão 5 — Polimorfismo 
Na declaração Animal animal = new Cachorro();, uma variável do tipo Animal está 
referenciando um objeto da classe Cachorro. 
Ao executar animal.emitirSom();, será chamado o método sobrescrito da classe 
Cachorro, imprimindo o som definido nela, como Au au. 
Isso acontece devido ao polimorfismo, que permite que uma referência da superclasse 
execute o comportamento específico do objeto real. 
Questão 6 — Análise de código 
Considere os métodos somar(int a, int b) e somar(int a, int b, int c). 
a) O conceito aplicado foi a sobrecarga de métodos. 
b) Foram declarados 2 métodos chamados somar. 
c) O resultado de somar(2, 3) será 5, pois 2 + 3 = 5. 
d) O resultado de somar(2, 3, 4) será 9, pois 2 + 3 + 4 = 9. 
