# Projeto Atividade em Java

## Descrição

Este projeto tem como objetivo ler os dados de um trabalhador com N contratos (N fornecido pelo usuário). Em seguida, solicita ao usuário um mês específico e mostra qual foi o salário do funcionário nesse mês.

## Estrutura do Projeto

O projeto está organizado da seguinte forma:

- **Pasta de Aplicação**: Contém o arquivo principal nomeado como `Program`.
- **Pasta de Entidade**: Contém três arquivos principais:
  - `Department`: Representa o departamento do trabalhador.
  - `HourContract`: Representa um contrato por hora do trabalhador.
  - `Worker`: Representa o trabalhador e é a entidade principal.
  - `WorkerLevel`: Enum que define os níveis do trabalhador.

## Relacionamentos

As entidades estão relacionadas da seguinte forma:

- `Worker` possui um `Department`.
- `Worker` possui vários `HourContract`.
- `WorkerLevel` define o nível do `Worker`.

## Funcionalidades

- **Leitura de Dados**: O programa lê os dados do trabalhador e seus contratos.
- **Cálculo de Salário**: Solicita ao usuário um mês e calcula o salário do trabalhador para aquele mês específico.




