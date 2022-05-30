package basecamp;

public class Main {

    public static void main(String[] args) {

       // Calculadora
        System.out.println("Execicio Calculadora");
        Calculadora.soma(3,6);
        Calculadora.subtração(9,1.8);
        Calculadora.multiplicação(7,8);
        Calculadora.divisão(5,2.5);

        // Mensagem
        System.out.println("Exercicio Mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(4);

        // Emprestimo
        System.out.println("Exercicio Emprestimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000,Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000,7);
    }

}
