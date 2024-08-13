import entities.*;

public class Main {
    public static void main(String[] args) {
        Pilha pilha = new Pilha(5);

        pilha.insere(10);
        pilha.insere(20);
        pilha.insere(30);
        pilha.insere(40);
        pilha.insere(50);
        pilha.insere(60); // TESTE. Não será inserido, pilha cheia
        System.out.println(" ");
        pilha.imprime();

        pilha.remove();
        pilha.remove();
        System.out.println(" ");
        pilha.imprime();

        pilha.insere(60);
        pilha.insere(70); // TESTE. Não será inserido, pilha cheia
        System.out.println(" ");
        pilha.imprime();
    }
}