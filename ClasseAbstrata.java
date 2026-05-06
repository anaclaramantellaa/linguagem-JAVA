/*exemplo 1 */
/*abstract class Produto{
    public abstract double calcularPreco();
}
class ProdutoFisico extends Produto{
    @Override
    public double calcularPreco(){
        return 1000 + 500;
    }
}
class ProdutoDigital extends Produto{
    @Override
    public double calcularPreco(){
        return 1000;
    }
}
public class ClasseAbstrata{
    public static void main(String[] args) {
        Produto p1 = new ProdutoFisico();
        Produto p2 = new ProdutoDigital();

        p1.calcularPreco();
        p2.calcularPreco();
    }
}*/

/* 
import java.util.ArrayList;

abstract class Produto{
    protected String nome;
    protected double preco;

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }
    public String getNome(){
        return nome;
    }
    public abstract double calcularPreco();
}
class ProdutoFisico extends Produto{
    private double frete;

    public ProdutoFisico(String nome, double preco, double frete){
        super(nome, preco);
        this.frete = frete;
    }
    @Override
    public double calcularPreco(){
        return preco + frete;
    }
}
class ProdutoDigital extends Produto{
    public ProdutoDigital(String nome, double preco){
        super(nome, preco);
    }
    @Override
    public double calcularPreco(){
        return preco;
    }
}
public class ClasseAbstrata{
    ArrayList<>
}
*/

/*exercicio 1 */
/*import java.util.ArrayList;

abstract class Pagamento {
    protected double valor;

    public Pagamento(double valor) {
        this.valor = valor;
    }

    public abstract double processarPagamento();
}

class Cartao extends Pagamento {
    public Cartao(double valor) {
        super(valor);
    }

    @Override
    public double processarPagamento() {
        return valor + (valor * 0.05);
    }
}

class Pix extends Pagamento {
    public Pix(double valor) {
        super(valor);
    }

    @Override
    public double processarPagamento() {
        return valor;
    }
}

class Boleto extends Pagamento {
    public Boleto(double valor) {
        super(valor);
    }

    @Override
    public double processarPagamento() {
        return valor + 2;
    }
}

public class ClasseAbstrata {
    public static void main(String[] args) {
        ArrayList<Pagamento> lista = new ArrayList<>();

        lista.add(new Cartao(500));
        lista.add(new Pix(500));
        lista.add(new Boleto(500));
        for(Pagamento p : lista){
            System.out.println("Lista de pagamento: " + p.processarPagamento());

        }
    }

}*/

/*exercicio 2 */
/*abstract class Funcionario {
    protected double salario;

    public Funcionario(double salario) {
        this.salario = salario;
    }

    public abstract double calcularSalario();
}

class Gerente extends Funcionario {
    public Gerente(double salario) {
        super(salario);
    }

    @Override
    public double calcularSalario() {
        return salario + 1000;
    }
}

class Desenvolvedor extends Funcionario {
    public Desenvolvedor(double salario) {
        super(salario);
    }

    @Override
    public double calcularSalario() {
        return salario + 500;
    }
}

class Estagiario extends Funcionario {
    public Estagiario(double salario) {
        super(salario);
    }

    @Override
    public double calcularSalario() {
        return salario;
    }
}

public class ClasseAbstrata {
    public static void main(String[] args) {
        Funcionario func1 = new Gerente(2000);
        Funcionario func2 = new Desenvolvedor(1500);
        Funcionario func3 = new Estagiario(1000);

        System.out.println(func1.calcularSalario());
        System.out.println(func2.calcularSalario());
        System.out.println(func3.calcularSalario());

    }
}*/

/*exercicio 3 */
/*abstract class Transporte{
    protected double valor;
    public Transporte(double valor){
        this.valor = valor;
    }
    public abstract double calcularFrete();
}
class Caminhao extends Transporte{
    public Caminhao(double valor){
        super(valor);
    }
    @Override
    public double calcularFrete(){
        return valor + 100;
    }
}
class Moto extends Transporte{
    public Moto(double valor){
        super(valor);
    }
    @Override
    public double calcularFrete(){
        return valor + 20;
    }
}
class Drone extends Transporte{
    public Drone(double valor){
        super(valor);
    }
    @Override
    public double calcularFrete(){
        return valor + 50;
    }
}
public class ClasseAbstrata {
    public static void main(String[] args) {
        Transporte caminhao = new Caminhao(100);
        Transporte moto = new Moto(100);
        Transporte drone = new Drone(100);
        System.out.println("Frete caminhão: " + caminhao.calcularFrete());
        System.out.println("Frete moto: " + moto.calcularFrete());
        System.out.println("Frete drone: " + drone.calcularFrete());
    }
}*/

/*exercicio 4 */
/*abstract class Plano{
    protected double valor;
    public Plano(double valor){
        this.valor = valor;
    }
    public abstract double calcularValor();
}
class Basico extends Plano{
    public Basico(double valor){
        super(valor);
    }
    @Override
    public double calcularValor(){
        return 20;
    }
}
class Premium extends Plano{
    public Premium(double valor){
        super(valor);
    }
    @Override
    public double calcularValor(){
        return 50;
    }
}
class Familia extends Plano{
    public Familia(double valor){
        super(valor);
    }
    @Override
    public double calcularValor(){
        return 80;
    }
}
public class ClasseAbstrata{
    public static void main(String[] args) {
        Plano um = new Basico(0);
        Plano dois = new Premium(0);
        Plano tres = new Familia(0);
        System.out.println("Valor plano basico: " + um.calcularValor());
        System.out.println("Valor plano premium: " + dois.calcularValor());
        System.out.println("Valor plano familia: " + tres.calcularValor());
    }
}*/

