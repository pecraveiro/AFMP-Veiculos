package Modelo;

// Importando as bibliotecas Random, Date e Year
import java.util.Random;
import java.util.Date;
import java.time.Year;

public class VeiculoM {
    // Definindo as variáveis do veículo
    private String chassi;
    private String marca;
    private String versao;
    private int ano;
    private String modelo;
    private String cor;
    private float preco;
    private Date dataVenda;
    private boolean condicao;
    private float kmAtual;
    private int anoCompra;

    // Criando o construtor com todas as variáveis
    public VeiculoM(String chassi, String marca, String versao, int ano, String modelo,
                    String cor, float preco, Date dataVenda, boolean condicao,
                    float kmAtual, int anoCompra) {
        this.chassi = chassi;
        this.marca = marca;
        this.versao = versao;
        this.ano = ano;
        this.modelo = modelo;
        this.cor = cor;
        this.preco = preco;
        this.dataVenda = dataVenda;
        this.condicao = condicao;
        this.kmAtual = kmAtual;
        this.anoCompra = anoCompra;
    }

    // Criando os getters e setters para acessar e modificar as variáveis
    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public boolean isCondicao() {
        return condicao;
    }

    public void setCondicao(boolean condicao) {
        this.condicao = condicao;
    }

    public float getKmAtual() {
        return kmAtual;
    }

    public void setKmAtual(float kmAtual) {
        this.kmAtual = kmAtual;
    }

    public int getAnoCompra() {
        return anoCompra;
    }

    public void setAnoCompra(int anoCompra) {
        this.anoCompra = anoCompra;
    }

    // Criando uma função para criar o chassi com 17 caracteres aleatórios
    public String criarChassi() {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random(); // Criando uma instância de Random
        String chassi = ""; // Inicializando o chassi

        // Loop para gerar 17 caracteres
        for (int i = 0; i < 17; i++) {
            int posicao = random.nextInt(caracteres.length()); // Escolhendo uma posição aleatória
            chassi += caracteres.charAt(posicao); // Adicionando o caractere ao chassi
        }

        this.chassi = chassi; // Atribuindo o chassi gerado à variável chassi
        return chassi;
    }

    // Método para calcular a idade do veículo
    private int calcularIdade() {
        int anoAtual = Year.now().getValue();
        int idade = anoAtual - anoCompra;

        // Lançar uma exceção RuntimeException, não verificada
        if (idade > 100) {
            throw new RuntimeException("Erro: A idade do veículo excede o limite de 100 anos.");
        }
        return idade;
    }

    // Função única para verificar a condição do veículo (usado ou novo)
    public String condicaoVeiculo() {
        return (calcularIdade() > 3 || kmAtual > 20000) ? "Usado" : "Novo";
    }

    // Método para calcular o preço do veículo usado
    public float veiculoUsado(float preco) {
        // Verificamos se o veículo é usado
        if (condicaoVeiculo().equals("Usado")) {
            int anosUso = calcularIdade();
            preco *= 0.8f; // Aplicando uma redução inicial de 20%

            if (anosUso > 0) {
                // Desvalorização para veículos com até 20 anos
                for (int i = 1; i <= anosUso; i++) {
                    if (i <= 20) {
                        float precoDesvalorizacao = preco * 0.05f; // Desvalorização de 5% ao ano até 20 anos
                        preco -= precoDesvalorizacao; // Reduzindo o preço
                    } else {
                        float precoDesvalorizacao = preco * 0.01f; // Desvalorização de 1% após 20 anos
                        preco -= precoDesvalorizacao; // Reduzindo o preço
                    }
                }
            }
        }
        return preco;
    }

    // Método para imprimir as informações do veículo
    public void imprimeVeiculo() {
        System.out.println("\n----------Veiculo----------\n");
        chassi = criarChassi();
        float precoReal = veiculoUsado(this.preco);
        System.out.println("Chassi:             " + chassi);
        System.out.println("Marca:              " + this.getMarca());
        System.out.println("Versão:             " + this.getVersao());
        System.out.println("Ano:                " + this.getAno());
        System.out.println("Modelo:             " + this.getModelo());
        System.out.println("Cor:                " + this.getCor());
        System.out.println("Preço:              " + precoReal);
        System.out.println("Data de Venda:      " + this.getDataVenda());
        System.out.println("Condição:           " + condicaoVeiculo());
        System.out.println("Quilometragem Atual: " + this.getKmAtual() + " km");
    }
}
