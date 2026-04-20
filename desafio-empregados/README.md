## DESAFIO: Empregados OO

Solução do desafio “Empregados OO” do curso DevSuperior.
Este é um projeto em Java desenvolvido para gerenciar departamentos, seus colaboradores e calcular a folha de pagamento total, aplicando conceitos fundamentais de Orientação a Objetos como composição e associações.

## Funcionalidades

O programa realiza a leitura de um departamento (nome, dia de pagamento e dados de contato) e de N funcionários vinculados a este setor. Ao final, utiliza um método estático para processar as informações e exibir um sumário detalhado.

Requisitos Atendidos:

-Implementação de classes para representar Department, Address e Employee.
-Cálculo total da folha de pagamento através do método payroll().
-Uso de um método estático showReport para centralizar a lógica de exibição.
-Manipulação de listas para armazenamento dinâmico de funcionários.

## Estrutura de Entidades

A arquitetura do projeto segue o modelo de composição abaixo:

-Department: Responsável pelo nome do setor, dia de pagamento e pela gestão da lista de funcionários.
-Address: Armazena os dados de contato (e-mail e telefone).
-Employee: Representa o colaborador com nome e salário individual.



Desafio proposto por DevSuperior
Implementado por Rafael Passos👨‍💻
🔗 https://github.com/rafaelfsp-jr