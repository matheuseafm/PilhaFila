package entities;

public class Pilha {
    private int capacidade;
    private int topo;
    private int[] dados;

    public Pilha(int capacidade) {
        this.capacidade = capacidade;
        dados = new int[capacidade];
        topo = -1;
    }

    public boolean cheia() {
        return topo == capacidade - 1;
    }

    public boolean vazia() {
        return topo == -1;
    }

    public void insere(int e) {
        if (cheia()) {
            System.out.println("Pilha cheia, não é possível inserir o elemento " + e);
            return;
        }
        dados[++topo] = e;
    }

    public int remove() {
        if (vazia()) {
            System.out.println("Pilha vazia, não é possível remover um elemento");
            return -1; // Ou lançar uma exceção
        }
        return dados[topo--];
    }

    public void imprime() {
        if (vazia()) {
            System.out.println("Pilha vazia");
            return;
        }
        System.out.print("Elementos na pilha: ");
        for (int i = topo; i >= 0; i--) {
            System.out.print(dados[i] + " ");
        }
        System.out.println();
    }
}