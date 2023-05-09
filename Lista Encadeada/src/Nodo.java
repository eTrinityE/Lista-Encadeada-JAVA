public class Nodo<T> {
    T informacao;
    Nodo<T> proximo;

    public Nodo(T informacao, Nodo<T> proximo) {
        this.informacao = informacao;
        this.proximo = proximo;
    }

    public T getInformacao() {
        return informacao;
    }

    public void setInformacao(T informacao) {
        this.informacao = informacao;
    }

    public Nodo<T> getProximo() {
        return proximo;
    }

    public void setProximo(Nodo<T> proximo) {
        this.proximo = proximo;
    }
}
