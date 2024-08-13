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

    // Verifica se a pilha está cheia
    public String cheia() {
        if (topo == dados.length - 1) {
            return "Pilha cheia";
        } else {
            return "Pilha não cheia";
        }
    }

    // Verifica se a pilha está vazia
    public String vazia() {
        if (topo == -1) {
            return "Pilha vazia";
        } else {
            return "Pilha não vazia";
        }
    }

    // Insere um elemento na pilha
    public String insere(int e) {
        if (topo == dados.length - 1) {
            return "Pilha cheia, não é possível inserir o elemento " + e;
        }
        dados[++topo] = e;
        return "Elemento " + e + " inserido na pilha";
    }

    // Remove um elemento da pilha
    public String remove() {
        if (topo == -1) {
            return "Pilha vazia, não é possível remover um elemento";
        }
        int elementoRemovido = dados[topo--];
        return "Elemento " + elementoRemovido + " removido da pilha";
    }

    // Imprime os elementos da pilha
    public String imprime() {
        if (topo == -1) {
            return "Pilha vazia";
        }
        StringBuilder sb = new StringBuilder("Elementos na pilha: ");
        for (int i = topo; i >= 0; i--) {
            sb.append(dados[i]).append(" ");
        }
        return sb.toString();
    }
}