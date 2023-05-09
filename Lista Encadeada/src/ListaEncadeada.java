public class ListaEncadeada<T> implements Lista<T> {
    Nodo<T> inicio;
    Nodo<T> fim;

    public ListaEncadeada() {
        inicio = null;
        fim = null;
    }

    @Override
    public void adicionar(T informacao) {
        Nodo<T> novoNodo = new Nodo<>(informacao, null);

        if (inicio == null) {
            inicio = novoNodo;
            fim = novoNodo;
        } else {
            fim.setProximo(novoNodo);
            fim = novoNodo;
        }
    }

    @Override
    public Nodo<T> remover(T informacao) {
        Nodo<T> nodoAnterior = null;
        Nodo<T> nodoAtual = inicio;

        while (nodoAtual != null && !nodoAtual.getInformacao().equals(informacao)) {
            nodoAnterior = nodoAtual;
            nodoAtual = nodoAtual.getProximo();
        }

        if (nodoAtual == null) {
            return null;
        }

        if (nodoAnterior == null) {
            inicio = nodoAtual.getProximo();
        } else {
            nodoAnterior.setProximo(nodoAtual.getProximo());
        }

        if (nodoAtual == fim) {
            fim = nodoAnterior;
        }

        nodoAtual.setProximo(null);
        return nodoAtual;
    }

    @Override
    public void imprimir() {
        Nodo<T> nodoAtual = inicio;

        while (nodoAtual != null) {
            System.out.println(nodoAtual.getInformacao());
            nodoAtual = nodoAtual.getProximo();
        }
    }
}
