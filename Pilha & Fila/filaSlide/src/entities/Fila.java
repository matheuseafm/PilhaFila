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

    public String cheia() {
        if (tamanho == capacidade) {
            return "Fila cheia";
        } else {
            return "Fila não cheia";
        }
    }

    public String vazia() {
        if (tamanho == 0) {
            return "Fila vazia";
        } else {
            return "Fila não vazia";
        }
    }

    public String insere(int e) {
        if (tamanho == capacidade) {
            return "Fila cheia, não é possível inserir o elemento " + e;
        }
        ultimo = (ultimo + 1) % capacidade;
        dados[ultimo] = e;
        tamanho++;
        return "Elemento " + e + " inserido na fila";
    }

    public String remove() {
        if (tamanho == 0) {
            return "Fila vazia, não é possível remover um elemento";
        }
        int elementoRemovido = dados[primeiro];
        primeiro = (primeiro + 1) % capacidade;
        tamanho--;
        return "Elemento " + elementoRemovido + " removido da fila";
    }


    public String imprime() {
        if (tamanho == 0) {
            return "Fila vazia";
        }
        StringBuilder sb = new StringBuilder("Elementos na fila: ");
        for (int i = 0; i < tamanho; i++) {
            sb.append(dados[(primeiro + i) % capacidade]).append(" ");
        }
        return sb.toString();
    }
}