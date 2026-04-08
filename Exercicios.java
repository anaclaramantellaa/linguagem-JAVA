/* primeiro exemplo

class Pessoa{
    private String nome;
    private int idade;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        if(idade >= 0){
            this.idade = idade;
        }else{
            System.out.println("Idade inválida!!");
        }
        
    }
}

public class Exercicios{
    public static void main(String[] args) {

        Pessoa p = new Pessoa();
        p.setNome(("Ana"));
        p.setIdade(-19);
        System.out.println("Meu nome é: " + p.getNome());
        System.out.println("Minha idade é: " + p.getIdade());

    }
}*/

/*exercicio 1 */
/*class Aluno{
    private String nome;
    private int idade;

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        if(idade >= 0){
            this.idade = idade;
        }else{
            System.out.println("Idade não permitida!");
        }
    }
}
public class Exercicios{
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome("Ana");
        aluno.setIdade(-1);
        System.out.println(aluno.getNome());
    }
}*/

/*exercicio 2 */
/*class ContaBancaria{
    String titular;
    private double saldo;

    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double saldo){
        if(saldo >= 0){
            this.saldo = saldo;
        }else{
            System.out.println("Saldo foi negativo, então ele é inválido!!");
        }
    }
}
public class Exercicios{
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.titular = "Ana";
        conta.setSaldo(-388);
        System.out.println(conta.titular);
        //System.out.println(conta.getSaldo());
        
    }
}*/

/*exercicio 3 */
/*class Produto{
    String nome;
    private double preco;

    public double getPreco(){
        return preco;
    }
    public void setPreco(double preco){
        if(preco > 0){
            this.preco = preco;
            System.out.println("O preço do produto é: " + preco);
        }else{
            System.out.println("Preço do produto inválido!");
        }
    }
}

public class Exercicios{
    public static void main(String[] args) {
    Produto p = new Produto();
    p.nome = "Notebook";
    p.setPreco(-3000);
    System.out.println(p.nome);
    System.out.println(p.getPreco());
    }
}*/

/*exercicio 4 */
/*class ContaBancaria{
    String nome;
    double saldo;

    ContaBancaria(String nome, double saldo){
        this.nome = nome;
        this.saldo = saldo;
    }
}
public class Exercicios{
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Ana", 1000000000);
        System.out.println("Meu nome é: " + conta.nome);
        System.out.println("Meu saldo bancário é: " + conta.saldo);
    }
}*/

/*exercicio 5 */
/*class Livro{
    String titulo;
    String autor;
    int pags;

    Livro(String titulo, String autor, int pags){
        this.titulo = titulo;
        this.autor = autor;
        this.pags = pags;
    }
}
public class Exercicios{
    public static void main(String[] args) {
        Livro livro = new Livro("Assim que acaba", "Collin Hover", 255 );
        System.out.println("Livro lido: " + livro.titulo);
        System.out.println("Autor(a) do livro: " + livro.autor);
        System.out.println("Quantia de páginas: " + livro.pags);
    }
}*/

/*exercicio 6 */
/*class Funcionario{
    String nome;
    double salario;
    
    Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario + salario * 0.1;
    }
}
public class Exercicios{
    public static void main(String[] args) {
        Funcionario func = new Funcionario("Isadora", 1600);
        System.out.println("Nome: " + func.nome);
        System.out.println("Salário com 10% de aumento: " + func.salario);
    }
}*/

/*exercicio 7 */
/*class Produto{
    String nome;
    double preco;

    Produto(String nome, double preco){
        if(preco > 0){
            this.nome = nome;
            this.preco = preco;
        }else{
            System.out.println("ERRO!!");
        }
    }
}
public class Exercicios{
    public static void main(String[] args) {
        Produto product = new Produto("shampoo", -1);
        System.out.println("Nome do produto: " + product.nome);
        System.out.println("Preço: " + product.preco);
    }
}*/

/*exercicio 8 */
/*class Aluno{
    String nome;
    double nota;

    Aluno(String nome, double nota){
        if(nota >= 0 && nota <= 10){
            this.nome = nome;
            this.nota = nota;
        }else{
            System.out.println("Nota inválida");
        }
    }
}
public class Exercicios{
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Isadora", 8);
        System.out.println("Aluno(a): " + aluno.nome);
        System.out.println("Nota: " + aluno.nota);
    }
}*/

/*exercicio 9 */
/*class Pedido{
    int numeroPedido;
    double valor;

    Pedido(int numeroPedido, double valor){
        this.numeroPedido = numeroPedido;
        this.valor = valor;
    }
}
public class Exercicios{
    public static void main(String[] args) {
        Pedido pedido = new Pedido(8, 1000);
        System.out.println("Número do pedido: " + pedido.numeroPedido);
        System.out.println("Valor do pedido: " + pedido.valor);
    }
}*/

/*exercicio 10 */
class Usuario{
    String nome;
    String email;
    private String senha;

    public String getSenha(){
        return senha;
    }
    public void setSenha(String senha){
        if(senha.length() >= 6){
            this.nome = nome;
            this.email = email;
            this.senha = senha;
        }else{
            System.out.println("ERRO!!");
        }
    }
}
public class Exercicios{
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        usuario.nome = "Ana";
        usuario.email = "aninha@gmail.com";
        usuario.setSenha("123456");
        System.out.println("Nome: " + usuario.nome);
        System.out.println("E-mail: " + usuario.email);
        System.out.println("Senha: " + usuario.getSenha());
    }
}