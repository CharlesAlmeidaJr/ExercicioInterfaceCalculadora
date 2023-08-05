package calculadora.operacoes;

public class Divisao implements Operacao{

    @Override
    public double executarOperacao(double num1, double num2) {
        if(num2 != 0){
            return num1 / num2;
        }
        else{
            throw new ArithmeticException("Não se pode dividir por zero");
        }
    }
    
}
