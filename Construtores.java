/*Primeiro*/
/*class Pessoa{
    String nome;
    int idade;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
}

public class Construtores {
    public static void main(String[] args) {
        Pessoa p = new Pessoa ("Isadora", 19);
        System.out.println("Nome: " + p.nome + "Idade: " + p.idade);
    }
    
}*/

/* Segundo
class Aluno{
    String nome;
    int idade;
    public Aluno(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
}
public class Construtores {
    public static void main(String[] args) {
        Aluno a = new Aluno ("Cururu", 12);
        System.out.println("Nome: " + a.nome + " Idade: " + a.idade);
    }
}*/

/* Terceiro
class Carro{
    String marca;
    String modelo;
    public Carro(){}
    public Carro(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }
}
public class Construtores{
    public static void main(String[] args) {
        Carro c = new Carro("Hyundai", "Civic G10");
        System.out.println("Marca: " + c.marca);
        System.out.println("Modelo: " + c.modelo);
    }
}*/

/* Quarto
class ContaBancaria{
    String titular;
    double saldo;
    public ContaBancaria(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }
}

public class Construtores{
    public static void main(String[] args){
        ContaBancaria conta = new ContaBancaria("Ana", 2099743823);
        System.out.println("O meu nome é: " + conta.titular);
        System.out.println("O meu saldo é: " + conta.saldo);
    }
}*/

/* Quinto
class Funcionario{
    String nome;
    double salario;
    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario + salario * 0.1;
    }
}
public class Construtores{
    public static void main(String[] args) {
        Funcionario salarioatualizado = new Funcionario("Ana", 2200);
        System.out.println("Meu nome é: " + salarioatualizado.nome);
        System.out.println("Meu salário atualizado é: " + salarioatualizado.salario);
    }
}*/

/* sexto
class Usuario {
    String nome;
    String email;
    String senha;

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        if (senha.length() >= 6) {
            this.senha = senha;
        } else {
            System.out.println("Senha inválida");
        }
        ;
        this.senha = senha;

    }
}

public class Construtores {
    public static void main(String[] args){
        Usuario usuario = new Usuario("Ana", "mantellaanaclara@gmail.com", "123456");
        System.out.println("Meu nome é: " + usuario.nome);
        System.out.println("Meu email é: " + usuario.email);
        System.out.println("Minha senha é: " + usuario.senha);
    }
}*/



