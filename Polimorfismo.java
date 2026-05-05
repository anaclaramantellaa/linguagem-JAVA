/* 
class Animal{
    public void emitirSom(){
        System.out.println("Som genérico");
    }
}
class Cachorro extends Animal{
    @Override
    public void emitirSom(){
        System.out.println("Latindo");
    }
}
class Gato extends Animal{
    @Override
    public void emitirSom(){
        System.out.println("Miando");
    }
}

public class Polimorfismo {
    public static void main(String[] args) {
        Animal a1 = new Cachorro();
        Animal a2 = new Gato();

        a1.emitirSom();
        a2.emitirSom();
    }
}
*/

/*exercicio 1 */
/*class Funcionario{
    double salario = 1500;
    public void calcularSalario(){
        salario = salario + 500;
    }
}

class Gerente extends Funcionario{
    double bonus = 750;
    @Override
    public void calcularSalario(){
        salario = salario + bonus;
        System.out.println("Seu salário é: " + salario);
    }
}

class Estagiario extends Funcionario{
    @Override
    public void calcularSalario(){
        salario = salario/2;
        System.out.println("Seu salário é: " + salario);
    }
}

public class Polimorfismo{
    public static void main(String[] args) {
        Funcionario func1 = new Gerente();
        Funcionario func2 = new Estagiario();
        func1.calcularSalario();
        func2.calcularSalario();
    }
}*/

/*exercicio 2 */
/*class Veiculo{
    public void mover(){
        System.out.println("Parado");
    }
}
class Carro extends Veiculo{
    @Override
    public void mover(){
        System.out.println("Carro andando!!");
    }
}
class Moto extends Veiculo{
    @Override
    public void mover(){
        System.out.println("Moto andando!!");
    }
}
public class Polimorfismo{
    public static void main(String[] args) {
        Veiculo v1 = new Carro();
        Veiculo v2 = new Moto();
        v1.mover();
        v2.mover();
    }
}*/

/*exercicio 3 */
/*class Pagamento{
    public void processarPagamento(){
        System.out.println("Pagamento invalido");
    }
}
class Cartao extends Pagamento{
    @Override
    public void processarPagamento(){
        System.out.println("O pagamento será feito via Cartão");
    }
}
class Pix extends Pagamento{
    @Override
    public void processarPagamento(){
        System.out.println("O pagamento será feito via Pix");
    }
}
class Boleto extends Pagamento{
    @Override
    public void processarPagamento(){
        System.out.println("O pagamento será feito via Boleto");
    }
}

public class Polimorfismo{
    public static void main(String[] args) {
        Pagamento p1 = new Boleto();
        Pagamento p2 = new Cartao();
        Pagamento p3 = new Pix();
        p1.processarPagamento();
        p2.processarPagamento();
        p3.processarPagamento();
    }
}*/

