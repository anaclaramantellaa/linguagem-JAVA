/*polimorfismo ex 5 */
/* 
import java.util.ArrayList;

abstract class Veiculo{
    public abstract double calcularAluguel(int dias);
}
class Carro extends Veiculo{
    @Override
    public double calcularAluguel(int dias){
        return dias * 100;
    }
}
class Moto extends Veiculo{
    @Override
    public double calcularAluguel(int dias){
        return dias * 50;
    }
}
class Caminhao extends Veiculo{
    @Override
    public double calcularAluguel(int dias){
        return dias * 150;
    }
}

public class OperadorFinal{
    public static void main(String[] args) {
        ArrayList<Veiculo> lista = new ArrayList<>();

        lista.add(new Carro());
        lista.add(new Moto());
        lista.add(new Caminhao());

        for(Veiculo v : lista){
            System.out.println("Veiculos: " + v.calcularAluguel(3));
        }
    }
}*/

/*exemplo pratico de operador final */
/*public class OperadorFinal {
    public static void main(String[] args) {
        final double PI = 3.14;
        System.out.println(PI);
        double raio = 10;
        PI = 10; // Erro: não é possível atribuir um valor a uma constante
        double area = PI * raio * raio;
        System.out.println("Área do círculo: " + area);
    }
}*/

/*exercicio 1 */
/*import java.util.ArrayList;

public class OperadorFinal {
    public static void main(String[] args) {
        final double MEDIA_MINIMA = 7;     

        ArrayList<Double> notas = new ArrayList<>();
        
        notas.add(6.0);
        notas.add(6.0);
        notas.add(6.5);
        
        double soma = 0;

        for(Double n : notas){
            soma += n;
        }
        double media = soma / notas.size();
        System.out.println("Media das notas: " + media);

        if(media >= MEDIA_MINIMA){
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");
        }
    }
}*/

/*exercicio 2 */
/*class ContaBancaria{
    String titular;
    double saldo;
    final double TAXA_FIXA = 2.0;
    public ContaBancaria(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }
        public void sacar(double valor){
            saldo -= valor;
            saldo -= TAXA_FIXA;

            System.out.println("Saldo: " + saldo);
        }
}
public class OperadorFinal{
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria("Ana ", 1000);
        c1.sacar(100);
    }
}*/

/*exercicio 3 */
import java.util.ArrayList;

class Produto{
    String nome; 
    double preco;
    final double IMPOSTO = 0.15;
    void calcularPreco(){
        double precoFinal = preco + (preco * IMPOSTO);
        System.out.println("Nome do Produto: " + nome);
        System.out.println("Preço com imposto: " + precoFinal);
    }
}
public class OperadorFinal{
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();

        Produto p1 = new Produto();
        Produto p2 = new Produto();

        p1.nome = "Mouse";
        p1.preco = 55.0;
        p2.nome = "Teclado";
        p2.preco = 69.0;

        produtos.add(p1);
        produtos.add(p2);

        p1.calcularPreco();
        p2.calcularPreco();
    }
}



