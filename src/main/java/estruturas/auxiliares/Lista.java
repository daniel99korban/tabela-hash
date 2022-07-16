
package estruturas.auxiliares;

/**
 *
 * @author danielkorban
 */
public interface Lista<T> {
    public void inserir(T valor);
    public boolean buscar(T valor);
    public boolean remover(T valor);
}
