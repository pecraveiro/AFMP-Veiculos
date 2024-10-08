## Autores
- DESENVOLVEDOR: [Ary Coelho](https://github.com/Aryzada)
- TECH LEAD: Fabrício
- DESENVOLVEDOR: Matheus
- TESTE/INTEGRAÇÃO [Pedro Craveiro](https://github.com/pecraveiro)

## Metodologia
- Por times
- Desenvolver novas funcionalidades
- Escopo: Sistema para gestão de concessonária de veículos

## Módulos

- Módulo 1: Vendas (Novos, Usados)
- Módulo 2: Manutenção (Novos, Usados)
- Módulo 3: Estoque (Veículos, Peças)
- Módulo 4: Colaborador (Vendedor, Mecânico, Admnistrativo)

# Projeto de Sistema de Gestão de Veículos

Este projeto é um sistema simples para gerenciar veículos, suas vendas e manutenções. O objetivo é testar e gerenciar as funcionalidades básicas relacionadas a um veículo, como cálculo de preço de venda de veículos usados, verificação de manutenção, e controle de vendas.

## Estrutura do Projeto

O projeto contém as seguintes classes principais:

1. **VeiculoM**: Classe que representa um veículo e contém informações como marca, modelo, cor, ano de fabricação, preço, e outros atributos relacionados ao veículo.
2. **ManutencaoM**: Classe que herda de `VeiculoM` e adiciona funcionalidades relacionadas à manutenção de veículos, como cálculo de tempo de serviço e custo.
3. **VendasM**: Classe que também herda de `VeiculoM` e é responsável por gerenciar as vendas de veículos, incluindo o controle de informações como CPF do comprador, valor final da venda, e data de venda.
4. **Main**: Classe principal onde são realizados testes das funcionalidades implementadas nas classes acima.

### Funções de cada classe

#### VeiculoM
- **Construtor**: Inicializa o veículo com atributos como `chassi`, `marca`, `versao`, `ano`, `modelo`, `cor`, `preco`, `dataVenda`, `condicao`, `kmAtual`, `anoCompra`.
- **veiculoUsado(float preco)**: Calcula o preço de revenda de um veículo com base na quilometragem.
- **imprimeVeiculo()**: Exibe todos os detalhes do veículo.
- **getters e setters**: Métodos padrão para acessar e modificar os atributos do veículo.

#### ManutencaoM
- **Construtor**: Inicializa os atributos da manutenção, como `idManutencao`, `dataservico`, `tempoServico`, `custo`, e `status`.
- **verificarManutencao(double kmRodados)**: Verifica quando o veículo precisa de manutenção com base na quilometragem rodada.
- **tempoServico()**: Calcula o tempo estimado de serviço de manutenção.
- **tempoCusto(float kmAtual)**: Calcula o custo da manutenção com base na quilometragem atual do veículo.
- **imprimeManutencao()**: Exibe os detalhes da manutenção.

#### VendasM
- **Construtor**: Inicializa os detalhes de uma venda, incluindo `id_vendas`, `data_venda`, `cpf` do comprador, e o valor final da venda.
- **getters e setters**: Métodos para acessar e modificar os atributos relacionados à venda, como `id_vendas`, `data_venda`, `cpf`, e `valor_final`.

### Funções de Teste no Main

A classe `Main` executa testes das funcionalidades principais das classes `VeiculoM`, `ManutencaoM`, e `VendasM`. O objetivo destes testes é garantir que os métodos estão funcionando corretamente e verificar o comportamento do sistema.

#### Teste da Classe VeiculoM
- Criação de um objeto `VeiculoM` com atributos como marca, modelo, cor, ano, preço, entre outros.
- Cálculo do preço de revenda do veículo usado através do método `veiculoUsado()`.
- Exibição dos detalhes do veículo utilizando `imprimeVeiculo()`.

#### Teste da Classe ManutencaoM
- Criação de um objeto `ManutencaoM` e verificação da necessidade de manutenção com base na quilometragem através do método `verificarManutencao()`.
- Cálculo do tempo estimado para a manutenção utilizando `tempoServico()`.
- Cálculo do custo da manutenção baseado na quilometragem atual utilizando `tempoCusto()`.
- Exibição dos detalhes da manutenção utilizando `imprimeManutencao()`.

#### Teste da Classe VendasM
- Criação de um objeto `VendasM` que representa uma venda de veículo, armazenando informações como CPF do comprador, data da venda, e valor final.
- Exibição de detalhes da venda, como `id_vendas`, `data_venda`, `cpf` do comprador, e valor final da venda.