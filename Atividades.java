/*01 */
/*class Pessoa{
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
        if(idade < 0){
            System.out.println("Idade inválida!!");
        }
        else{
            this.idade = idade;
        }
    }
}

public class Atividades {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Isadora");
        pessoa.setIdade(19);
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
    }
}*/

/*02 */
/*class Produto{
    //public String nome;
    //public double preco;
    private String nome;
    private double preco;

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public double getPreco(){
        return preco;
    }
    public void setPreco(double preco){
        if(preco > 0){
            this.preco = preco;
            System.out.println(getPreco());
        }
        else{
            System.out.println("Número negativo!!");
        }
    }
}
public class Atividades{
    public static void main(String[] args) {
        Produto p = new Produto();
        //p.preco = -100;
        p.setPreco(-100);
    }
}*/

/*03 */
/*class Aluno{
    private String nome;
    private double nota;

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public double getNota(){
        return nota;
    }
    public void setNota(double nota){
        if(nota >= 0 && nota <= 10){
            this.nota = nota;
            System.out.println("Sua nota foi: " + getNota());
        }
        else{
            System.out.println("Nota não está entre 0 e 10!");
        }

    }
}
public class Atividades{
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome("Ana");
        aluno.setNota(10);
    }
}*/

/*04 */
/*class ContaBancaria{
    private double saldo;
    
    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public void validarSaldo(){
        if(saldo > 0){
            System.out.println("Saldo: " + getSaldo());
        }
        else{
            System.out.println("Saldo Negativado!");
        }
    }
}

public class Atividades{
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.setSaldo(-1);
        conta.validarSaldo();
    }
}*/

/*05 */
/*class Produto{
    private String nome;
    private double preco;
    int percentual;

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public double getPreco(){
        return preco;
    }
    public void setPreco(double preco){
        this.preco = preco;
    } 

    public void aplicarDesconto(){
        if(percentual >= 0 && percentual <= 100){
            preco = preco - ( preco * percentual / 100);
            System.out.println("Produto com desconto aplicado: " + getPreco());
        }
        else{
            System.out.println("Número de percentual inválido!");
        }
    }
}
public class Atividades{
    public static void main(String[] args) {
        Produto p = new Produto();
        p.setPreco(98);
        p.setNome("Capinha");
        p.percentual = 70;
        p.aplicarDesconto();
    }
}*/

/*06 */
/*class Aluno{
    //String nome;
    private String nome;

    //public Aluno(String nome)// public String getNome(){
        //this.nome = nome;
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
}*/

/*07 */
/*class Carro{
    private String marca;
    private int velocidade;
    int acelero, freio;

    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }

    public int getVelocidade(){
        return velocidade;
    }
    public void setVelocidade(int velocidade){
        this.velocidade = velocidade;
    }

    public void acelerar(){
        if(velocidade > 0){
            velocidade = velocidade + acelero;
            System.out.println("Velocidade atingida após acelerar: " + getVelocidade() + "km/h");
        }else{
            System.out.println("Velocidade abaixo de zero!");
        }
    }
    public void freiar(){
        if(velocidade > 0){
            velocidade = velocidade - freio;
            System.out.println("Velocidade atingida após freiar: " + getVelocidade() + "km/h");
        }else{
            System.out.println("Velocidade abaixo de zero!");
        }
    }
}
public class Atividades{
    public static void main(String[] args) {
        Carro c = new Carro();
        c.setMarca("Civic Type-R");
        c.setVelocidade(100);
        c.acelero = 10;
        c.freio = 5;
        c.acelerar();
        c.freiar();
    }
}*/

/*08 */
/*import java.util.ArrayList;

class Pedido{

    private ArrayList<String> produtos = new ArrayList<>();

    public void adicionarProduto(String p){
        produtos.add(p);
    }
}*/
