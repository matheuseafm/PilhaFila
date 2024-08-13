import entities.*;

public class Main {
    public static void main(String[] args) {
        Fila fila = new Fila(5);

        fila.insere(1);
        fila.insere(2);
        fila.insere(3);
        fila.insere(4);
        fila.insere(5);
        fila.insere(6); // TESTE. Não será inserido, fila cheia
        System.out.println(" ");
        fila.imprime();

        fila.remove();
        fila.remove();
        System.out.println(" ");
        fila.imprime();

        fila.insere(6);
        fila.insere(7); // TESTE. Não será inserido, fila cheia
        System.out.println(" ");
        fila.imprime();

        fila.remove();
        fila.remove();
        fila.remove();
        fila.remove();
        System.out.println(" ");
        fila.imprime();

        fila.insere(8);
        fila.insere(9);
        fila.insere(10);
        fila.insere(11);
        System.out.println(" ");
        fila.imprime();

    }
}
