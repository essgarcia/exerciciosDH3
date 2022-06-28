package Exercicio02;

public class PraticaExcecoes {

    private int a = 0;
    private int b = 300;

    public int calcula(){
        int calculo = b/a;
        return calculo;
    }

    public static void main(String[] args) {

        PraticaExcecoes praticaExcecoes = new PraticaExcecoes();

        try {
            praticaExcecoes.calcula();
        }catch (ArithmeticException ex){
//            System.out.println("Ocorreu um erro.");
            throw new IllegalArgumentException("Não pode ser dividido por zero.");
        }

        System.out.println("Programa Finalizado.");

        }


}
