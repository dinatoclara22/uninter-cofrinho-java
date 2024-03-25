package classes;

public class Euro extends Moeda {
    // Construtor que recebe um valor em double
    public Euro(double valor) {
        super(valor); // Chama o construtor da classe pai (Moeda)
    }

    // Método para converter o valor de Euro para Real
    @Override
    public double converter() {
        return valor * 5.56; // O valor em Euro é multiplicado pela taxa de conversão para Real
    }

    // Método para exibir informações sobre a conversão
    @Override
    public void info() {
        // Imprime a informação da conversão de Euro para Real
        System.out.println("Convercao de Euro para Real: " + this.converter());
    }

    @Override
    public String toString() {
        // Retorna a string "Euro " seguida do valor convertido para Real
        return "Euro " + converter();
    }
}