public interface Lista<T> {
    void adicionar(T informacao);
    Nodo<T> remover(T informacao);
    void imprimir();
}
