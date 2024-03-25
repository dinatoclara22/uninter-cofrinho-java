package classes;

import java.util.ArrayList;

public class Cofrinho {
    // Cria uma lista para armazenar objetos do tipo Moeda
    private ArrayList<Moeda> listaMoedas = new ArrayList<Moeda>();

    // Adicionar uma moeda à lista
    public void adicionar(Moeda moeda) {
        listaMoedas.add(moeda);
    }

    // Remover uma moeda da lista com base em seu valor
    public void remover(double valor) {
        for (Moeda moeda : listaMoedas) {
            if (moeda.getValor() == valor) {
                listaMoedas.remove(moeda);
                return;
            }
        }
        System.out.println("Não há moedas no cofrinho!");
    }

    // Listas todas as moedas do cofrinho
    public void listagemMoedas() {
        for (Moeda m : listaMoedas) {
            System.out.println(m);
        }
    }

    // Soma o valor de todas as moedas do cofrinho
    public double somarMoedas() {
        double total = 0;
        for (Moeda m : listaMoedas) {
            total += m.converter();
        }
        System.out.println("Total: " + total);
        return total;
    }

}
