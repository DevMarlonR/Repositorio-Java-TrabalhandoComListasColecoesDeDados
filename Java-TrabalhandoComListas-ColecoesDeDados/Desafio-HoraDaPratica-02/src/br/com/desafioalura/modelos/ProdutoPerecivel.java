package br.com.desafioalura.modelos;

public class ProdutoPerecivel extends Produto {

    private int dataDeValidade;

    public ProdutoPerecivel(String nome, double preco, int quantidade, int dataDeValidade) {
        super(nome, preco, quantidade);
        this.dataDeValidade = dataDeValidade;
    }

    public int getDataDeValidade() {
        return dataDeValidade;
    }

    @Override
    public String toString() {
        return "\nProduto: " + super.getNome() + "\n Valor: " + super.getPreco() + "\n Quantidade: " + super.getQuantidade() + "\n Mes de validade: " + definirMes(getDataDeValidade()) + "\n";
    }

    private String definirMes(int numeroMes) {
        switch (numeroMes) {
            case 1:
                return "Janeiro";
            case 2:
                return "Fevereiro";
            case 3:
                return "Março";
            case 4:
                return "Abril";
            case 5:
                return "Maio";
            case 6:
                return "Junho";
            case 7:
                return "Julho";
            case 8:
                return "Agosto";
            case 9:
                return "Setembro";
            case 10:
                return "Outubro";
            case 11:
                return "Novembro";
            case 12:
                return "Dezembro";
            default:
                return "IVALID MOUTH";
        }
    }
}
