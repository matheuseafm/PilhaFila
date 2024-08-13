package entities;

public class Fila {
    private int primeiro, ultimo, tamanho, capacidade;
    private int[] dados;

    public Fila(int capacidade) {
        this.capacidade = capacidade;
        dados = new int[capacidade];
        primeiro = 0;
        ultimo = -1;
        tamanho = 0;
    }

    public boolean cheia() {
        return tamanho == capacidade;
    }

    public boolean vazia() {
        return tamanho == 0;
    }

    public void insere(int e) {
        if (cheia()) {
            System.out.println("Fila cheia, não é possível inserir o elemento " + e);
            return;
        }
        ultimo = (ultimo + 1) % capacidade;
        dados[ultimo] = e;
        tamanho++;
    }


    public int remove() {
        if (vazia()) {
            System.out.println("Fila vazia, não é possível remover um elemento");
            return -1;
        }
        int elementoRemovido = dados[primeiro];
        primeiro = (primeiro + 1) % capacidade;
        tamanho--;
        return elementoRemovido;
    }

    public void imprime() {
        if (vazia()) {
            System.out.println("Fila vazia");
            return;
        }
        System.out.print("Elementos na fila: ");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(dados[(primeiro + i) % capacidade] + " ");
        }
        System.out.println();
    }
}
