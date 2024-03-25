import java.util.Scanner;

import classes.Cofrinho;
import classes.Dolar;
import classes.Euro;
import classes.Real;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Cofrinho cofrinho = new Cofrinho();
        while (true) {
            // Imprime o menu de opções
            System.out.println("Cofrinho");
            System.out.println("1-Adicionar Moeda");
            System.out.println("2-Remover Moeda");
            System.out.println("3-Listar Moedas");
            System.out.println("4-Calcular total convertido para Real");
            System.out.println("5-Encerrar");
            System.out.println("Escolha a opcao: ");

            int opcao;
            // Loop para garantir que a entrada do usuário seja um número inteiro válido
            do {
                while (!teclado.hasNextInt()) {
                    System.out.println("Essa opcão não existe: ");
                    System.out.println("Tente novamente: ");
                    teclado.next();
                }
                opcao = teclado.nextInt();
                if (opcao <= 0 || opcao > 5) {
                    System.out.println("Essa opcao nao existe: ");
                    System.out.println("Tente novamente: ");
                }
                // Continua o loop até que a entrada seja um número inteiro entre 1 e 5
            } while (opcao <= 0 || opcao > 5);

            // Switch para tratar a opção escolhida pelo usuário
            switch (opcao) {
                case 1:
                    System.out.println("Opcao 1: adicionar moeda!");
                    int tipo;
                    do {
                        System.out.println("Escolha o tipo da moeda que deseja adicionar:");
                        System.out.println("1-Real");
                        System.out.println("2-Dolar");
                        System.out.println("3-Euro");
                        while (!teclado.hasNextInt()) {
                            System.out.println("Tipo de moeda invalido.");
                            System.out.println("Escolha o tipo da moeda que deseja adicionar:");
                            System.out.println("1-Real");
                            System.out.println("2-Dolar");
                            System.out.println("3-Euro");
                            teclado.next();
                        }
                        tipo = teclado.nextInt();
                    } while (tipo <= 0 || tipo > 3);
                    if (tipo == 1) {
                        System.out.println("Digite o valor da moeda que deseja adicionar: ");
                        double valor = teclado.nextDouble();
                        Real real = new Real(valor);
                        cofrinho.adicionar(real);
                        break;
                    } else if (tipo == 2) {
                        System.out.println("Digite o valor da moeda que deseja adicionar: ");
                        double valor = teclado.nextDouble();
                        Dolar dolar = new Dolar(valor);
                        cofrinho.adicionar(dolar);
                        break;
                    } else if (tipo == 3) {
                        System.out.println("Digite o valor da moeda que deseja adicionar: ");
                        double valor = teclado.nextDouble();
                        Euro euro = new Euro(valor);
                        cofrinho.adicionar(euro);
                        break;
                    } else {
                        System.out.println("Opcao invalida");
                        break;
                    }

                case 2:
                    System.out.println("Voce escolheu a opcao remover moeda.");
                    System.out.println("Qual moeda voce deseja remover ?");
                    System.out.println("1-Real");
                    System.out.println("2-Dolar");
                    System.out.println("3-Euro");
                    opcao = teclado.nextInt();

                    if (opcao == 1) {
                        System.out.println("Digite o valor da moeda que deseja remover: ");
                        double valor = teclado.nextDouble();
                        cofrinho.remover(valor);
                        break;
                    } else if (opcao == 2) {
                        System.out.println("Digite o valor da moeda que deseja remover: ");
                        double valor = teclado.nextDouble();
                        cofrinho.remover(valor);
                        break;
                    } else if (opcao == 3) {
                        System.out.println("Digite o valor da moeda que deseja remover: ");
                        double valor = teclado.nextDouble();
                        cofrinho.remover(valor);
                        break;
                    } else {
                        System.out.println("Erro! Essa opcao nao existe: ");
                        break;
                    }
                case 3:
                    System.out.println("Listar moedas");
                    cofrinho.listagemMoedas();
                    break;
                case 4:
                    cofrinho.somarMoedas();
                    break;
                case 5:
                    System.out.println("Fechando or programa");
                    teclado.close();
                    return;
                default:
                    System.out.println("Valor invalido!");
                    System.out.println("Tente novamente!");
            }

        }
    }
}