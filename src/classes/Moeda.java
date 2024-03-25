package classes;

public abstract class Moeda {
    public double valor;

    // Construtor que recebe um valor em double
    public Moeda(double valor) {
        this.valor = valor; // Atribui o valor passado ao atributo valor
    }

    // Método para obter o valor da moeda
    public double getValor() {
        return valor;
    }

    // Método abstrato para converter o valor da moeda
    public abstract double converter();

    // Método abstrato para exibir informações sobre a moeda
    public abstract void info();

    // Método abstrato para retornar uma representação em String do objeto
    public abstract String toString();
}