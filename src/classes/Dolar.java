package classes;

public class Dolar extends Moeda {
    // Construtor que recebe um valor em double
    public Dolar(double valor) {
        super(valor); // Chama o construtor da classe pai (Moeda)
    }

    // Método para converter o valor de Dolar para Real
    @Override
    public double converter() {
        return valor * 5.06; // O valor em Dolar é multiplicado pela taxa de conversão para Real
    }

    // Método para exibir informações sobre a conversão
    @Override
    public void info() {
        // Imprime a informação da conversão de Dolar para Real
        System.out.println("Converção de dólar para Real: " + this.converter());
    }

    // Método para retornar uma representação em String do objeto
    @Override
    public String toString() {
        // Retorna a string "Dolar " seguida do valor convertido para Real
        return "Dolar " + converter();
    }
}