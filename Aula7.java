import java.util.ArrayList;

/*exercicio1
    class Aluno {
    String nome;
    int idade;
}*/

/*exercicio2 
class Produto{
    String nome;
    double preco;
}*/

class Produto {
    String nome;
    double preco;
}

class Pedido {
    String nome;
    double precoTotal;

    ArrayList<Produto> dados = new ArrayList<>();

    void listarProdutos() {
        for (Produto p : dados) {
            System.out.println(p.nome + " - " + p.preco);
        }
    }

}

public class Aula7 {
    public static void main(String[] args) {

        /*
         * exercicio1
         * ArrayList<Aluno> dados = new ArrayList<>();
         * Aluno aluno1 = new Aluno();
         * Aluno aluno2 = new Aluno();
         * Aluno aluno3 = new Aluno();
         * 
         * aluno1.nome = "Gustavo";
         * aluno1.idade = 2;
         * 
         * aluno2.nome = "Mariana";
         * aluno2.idade = 12;
         * 
         * aluno3.nome = "Maria Luiza";
         * aluno3.idade = 16;
         * 
         * dados.add(aluno1);
         * dados.add(aluno2);
         * dados.add(aluno3);
         * 
         * for (Aluno a : dados) {
         * System.out.print(a.nome);
         * System.out.print(" : ");
         * System.out.println(a.idade);
         * }
         */

        /*
         * exercicio2
         * ArrayList<Produto> produtos = new ArrayList<>();
         * Produto produto1 = new Produto();
         * Produto produto2 = new Produto();
         * Produto produto3 = new Produto();
         * 
         * produto1.nome = "Motor";
         * produto1.preco = 1990.00;
         * 
         * produto2.nome = "Bateria";
         * produto2.preco = 390.00;
         * 
         * produto3.nome = "Chave Geral";
         * produto3.preco = 99.00;
         * 
         * produtos.add(produto1);
         * produtos.add(produto2);
         * produtos.add(produto3);
         * 
         * for(Produto p : produtos){
         * System.out.print(p.nome);
         * System.out.print(" : ");
         * System.out.print(p.preco);
         * System.out.println(" reais.");
         * }
         */

        Produto p1 = new Produto();
        Produto p2 = new Produto();
        Produto p3 = new Produto();

        p1.nome = "Monitor";
        p1.preco = 800.00;
        p2.nome = "Teclado";
        p2.preco = 150.00;
        p3.nome = "Mouse";
        p3.preco = 99.00;

        Pedido pedido = new Pedido();
        pedido.dados.add(p1);
        pedido.dados.add(p2);
        pedido.dados.add(p3);

        pedido.listarProdutos();

    }
}
