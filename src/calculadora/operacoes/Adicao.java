package calculadora.operacoes;

public class Adicao implements Operacao {

    @Override
    public double executarOperacao(double num1, double num2) {
        return num1 + num2;
    }
    
}
