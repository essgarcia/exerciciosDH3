package Exercicio01;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Pessoa pessoa2 = new Pessoa("1", "Jessica", 24);
        Pessoa pessoa3 = new Pessoa("2", "Milena", 23, 65, 1.63);

        System.out.println(pessoa3.toString());
        //System.out.println(pessoa3.calculaIMC());
    }
}
