import entities.*;

public class Main {
    public static void main(String[] args) {
        Pilha pilha = new Pilha(5);

        System.out.println(pilha.insere(10));
        System.out.println(pilha.insere(20));
        System.out.println(pilha.insere(30));
        System.out.println(pilha.insere(40));
        System.out.println(pilha.insere(50));
        System.out.println(pilha.insere(60)); // Não será inserido, pilha cheia

        System.out.println(pilha.imprime());

        System.out.println(pilha.remove());
        System.out.println(pilha.remove());

        System.out.println(pilha.imprime());

        System.out.println(pilha.insere(60));
        System.out.println(pilha.insere(70)); // Não será inserido, pilha cheia

        System.out.println(pilha.imprime());
    }
}