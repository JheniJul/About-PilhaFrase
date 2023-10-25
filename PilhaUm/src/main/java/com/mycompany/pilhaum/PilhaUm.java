package com.mycompany.pilhaum;
import java.util.Stack;
import javax.swing.JOptionPane;

public class PilhaUm {
    public static String invertePalavra(String palavra){
        Stack<Character> pilha = new Stack<>();
        for (char letra : palavra.toCharArray()) {
            pilha.push(letra);
        }

        StringBuilder palavraInvertida = new StringBuilder();
        while (!pilha.isEmpty()) {
            palavraInvertida.append(pilha.pop());
        }
        return palavraInvertida.toString();
    }

    public static void main(String[] args) {
        String entrada = JOptionPane.showInputDialog("Digite a string:");

        if (entrada != null) {
            String[] palavras = entrada.split(" ");
            StringBuilder resultado = new StringBuilder();

            for (String palavra : palavras) {
                resultado.append(invertePalavra(palavra)).append(" ");
            }

            JOptionPane.showMessageDialog(null, "Resultado: " + resultado.toString().trim());
        } else {
            JOptionPane.showMessageDialog(null, "Nenhuma entrada fornecida.");
        }
    }
}
