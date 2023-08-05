package calculadora;

import calculadora.operacoes.Operacao;

public class Calculadora {
    private Operacao operacao;

    public Calculadora(Operacao operacao){
        this.operacao = operacao;
    }

    public double calcular(double num1, double num2){
        return operacao.executarOperacao(num1, num2);
    }
}
