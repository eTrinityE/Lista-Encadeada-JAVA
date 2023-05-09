public class Main {
    public static void main(String[] args) {
        Lista<Integer> listaEncadeada = new ListaEncadeada<>();
        listaEncadeada.adicionar(1);
        listaEncadeada.adicionar(2);
        listaEncadeada.adicionar(3);
        listaEncadeada.imprimir();
        listaEncadeada.remover(2);
        listaEncadeada.imprimir();

        Lista<String> listaCircular = new ListaCircular<>();
        listaCircular.adicionar("a");
        listaCircular.adicionar("b");
        listaCircular.adicionar("c");
        listaCircular.imprimir();
        listaCircular.remover("b");
        listaCircular.imprimir();
    }

}