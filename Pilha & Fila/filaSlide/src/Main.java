import entities.*;

public class Main {
    public static void main(String[] args) {
        Fila fila = new Fila(5);

        System.out.println(fila.insere(10));
        System.out.println(fila.insere(20));
        System.out.println(fila.insere(30));
        System.out.println(fila.insere(40));
        System.out.println(fila.insere(50));
        System.out.println(fila.insere(60)); // Não será inserido, fila cheia

        System.out.println(fila.imprime());

        System.out.println(fila.remove());
        System.out.println(fila.remove());

        System.out.println(fila.imprime());

        System.out.println(fila.insere(60));
        System.out.println(fila.insere(70)); // Não será inserido, fila cheia

        System.out.println(fila.imprime());

    }
}
