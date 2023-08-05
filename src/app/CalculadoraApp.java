package app;

import java.util.Scanner;

import calculadora.Calculadora;
import calculadora.operacoes.Adicao;
import calculadora.operacoes.Divisao;
import calculadora.operacoes.Multiplicacao;
import calculadora.operacoes.Subtracao;

public class CalculadoraApp {
    public static void main(String[] args) {
        String opcao;
        Scanner scan = new Scanner(System.in);
        Calculadora calculadora = null;

        do{
            System.out.println("Digite a operação:\n1 - Adição\n2 - Subtração\n3 - Multiplicação\n4 - Divisão\n5 - Sair");
            opcao = scan.next();

            switch(opcao){
                case "1":
                    calculadora = new Calculadora(new Adicao());
                break;

                case "2":
                    calculadora = new Calculadora(new Subtracao());
                break;

                case "3":
                    calculadora = new Calculadora(new Multiplicacao());
                break;

                case "4":
                    calculadora = new Calculadora(new Divisao());
                break;

                case "5":
                    System.out.println("Fechando programa.");
                    calculadora = null;
                break;

                default:
                    System.out.println("Opção inválida.");
                    calculadora = null;
                break;
            }
            
            if(calculadora != null){
                try {
                    System.out.println("Informe o primeiro número:");
                    double num1 = scan.nextDouble();
                    System.out.println("Informe o segundo número:");
                    double num2 = scan.nextDouble();

                    System.out.println("Resultado: " + calculadora.calcular(num1, num2));
                } catch (Exception e) {
                    System.out.println("Ocorreu um erro, tente novamente.\n" + e.getLocalizedMessage());
                }
            }

        }while(!opcao.equals("5"));

        scan.close();
    }
}
