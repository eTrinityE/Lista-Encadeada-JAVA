public class ListaCircular<T> implements Lista<T> {
    Nodo<T> inicio;
    Nodo<T> fim;

    public ListaCircular() {
        inicio = null;
        fim = null;
    }

    @Override
    public void adicionar(T informacao) {
        Nodo<T> novoNodo = new Nodo<>(informacao, null);

        if (inicio == null) {
            inicio = novoNodo;
            fim = novoNodo;
            fim.setProximo(inicio);
        } else {
            fim.setProximo(novoNodo);
            fim = novoNodo;
            fim.setProximo(inicio);
        }
    }

    @Override
    public Nodo<T> remover(T informacao) {
        Nodo<T> nodoAnterior = null;
        Nodo<T> nodoAtual = inicio;

        do {
            if (nodoAtual.getInformacao().equals(informacao)) {
                if (nodoAtual == inicio) {
                    inicio = inicio.getProximo();
                    fim.setProximo(inicio);
                } else if (nodoAtual == fim) {
                    fim = nodoAnterior;
                    fim.setProximo(inicio);
                } else {
                    nodoAnterior.setProximo(nodoAtual.getProximo());
                }

                nodoAtual.setProximo(null);
                return nodoAtual;
            }

            nodoAnterior = nodoAtual;
            nodoAtual = nodoAtual.getProximo();
        } while (nodoAtual != inicio);

        return null;
    }

    @Override
    public void imprimir() {
        Nodo<T> nodoAtual = inicio;

        do {
            System.out.println(nodoAtual.getInformacao());
            nodoAtual = nodoAtual.getProximo();
        } while (nodoAtual != inicio);
    }
}

