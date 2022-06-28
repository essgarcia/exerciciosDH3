package Exercicio01;

public class Pessoa {
    private String id;
    private String nome;
    private int idade;
    private double peso;
    private double altura;

    public Pessoa(){

    }

    public Pessoa(String id, String nome, int idade) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa(String id, String nome, int idade, double peso, double altura) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public int calculaIMC(){
        double calculo = peso / (altura*altura);

        if (calculo < 20){
            return -1;
        } else if (calculo >= 20 && calculo <= 25) {
            return 0;
        }else {
            return 1;
        }
    }

    public boolean ehMaiorIdade(){
        if (idade > 18){
            return true;
        }
        return false;
    }

    public String toString() {
        return "Pessoa Selecionada: " +
                "id = " + id +
                ", nome = " + nome +
                ", idade = " + idade + " por isso é " + (ehMaiorIdade() ? "maior de idade" : "menor de ideade") +
                ", altura = " + altura +
                ", peso = " + peso + " e está " + (calculaIMC() > 0 ? "sobrepeso." : calculaIMC()< 0? "abaixo do peso." : "no peso ideal.");
    }
}
