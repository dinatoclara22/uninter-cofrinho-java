package classes;

public class Real extends Moeda {
    public Real(double valor) {
        super(valor);

    }

    // Método para converter o valor. Como Real é a moeda base, retorna o próprio
    // valor
    @Override
    public double converter() {
        return valor;
    }

    // Método para exibir informações sobre a conversão
    @Override
    public void info() {
        System.out.println("Não e necessário fazer a conversão!");
    }

    // Método para retornar uma representação em String do objeto
    @Override
    public String toString() {
        return "Real: " + this.converter();
    }

}
