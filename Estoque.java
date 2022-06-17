package exercicio3;

public class Estoque {
 private String produtoNome;
 private double preco;
 private int quantidade;
 
public Estoque(String produtoNome, double preco, int quantidade) {
	this.produtoNome = produtoNome;
	this.preco = preco;
	this.quantidade = quantidade;
}

public String getProdutoNome() {
	return produtoNome;
}

public void setProdutoNome(String produtoNome) {
	this.produtoNome = produtoNome;
}

public double getPreco() {
	return preco;
}

public void setPreco(double preco) {
	this.preco = preco;
}

public int getQuantidade() {
	return quantidade;
}

public void setQuantidade(int quantidade) {
	this.quantidade = quantidade;
}

@Override
public String toString() {
	return "Estoque: " + produtoNome + ", preco: " + preco+" Quantidade: "+ quantidade;
}
}
