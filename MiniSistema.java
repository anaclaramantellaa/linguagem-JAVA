import java.util.ArrayList;

class Produto {
    String nome;
    double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
}

class Cliente {
    String nome;
    String email;
    String senha;

    public Cliente(String nome, String email, String senha) {
        if (senha.length() >= 6) {
            this.nome = nome;
            this.email = email;
            this.senha = senha;
        } else {
            System.out.println("Senha inválida! Precisa ter pelo menos 6 caracteres.");
        }
    }
}

class Pedido {
    String cliente;
    String produto;

    public Pedido(String cliente, String produto) {
        this.cliente = cliente;
        this.produto = produto;
    }
}

class ProdutoFisico extends Produto {
    double peso;

    public ProdutoFisico(String nome, double preco, double peso) {
        super(nome, preco);
        this.peso = peso;
    }
}

class ProdutoDigital extends Produto {
    int mb;

    public ProdutoDigital(String nome, double preco, int mb) {
        super(nome, preco);
        this.mb = mb;
    }
}

class Carrinho {

    ArrayList<Produto> produtos = new ArrayList<>();

    void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    void listarProdutos() {
        System.out.println("Produtos no carrinho:");
        for (Produto p : produtos) {
            System.out.println("Nome: " + p.nome + " - Valor: " + p.preco + " R$");

            if (p instanceof ProdutoFisico) {
                ProdutoFisico pf = (ProdutoFisico) p;
                System.out.println("Peso: " + pf.peso + " kg");
            }

            if (p instanceof ProdutoDigital) {
                ProdutoDigital pd = (ProdutoDigital) p;
                System.out.println("Tamanho: " + pd.mb + " MB");
            }

            System.out.println("-------------------");
        }
    }

    void calcularTotal() {
        double total = 0;
        for (Produto p : produtos) {
            total += p.preco;
        }
        System.out.println("Total da compra: " + total + " R$");
    }
}

public class MiniSistema {
    public static void main(String[] args) {
        
        ProdutoFisico p1 = new ProdutoFisico("Notebook", 3000, 2.5);
        ProdutoDigital p2 = new ProdutoDigital("Curso de Java", 432.90, 500);

        Carrinho carrinho = new Carrinho();
        carrinho.adicionarProduto(p1);
        carrinho.adicionarProduto(p2);

        carrinho.listarProdutos();
        carrinho.calcularTotal();
    }
}