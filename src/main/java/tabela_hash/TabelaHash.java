package tabela_hash;
import estruturas.auxiliares.ListaEncadeada;
import estruturas.auxiliares.No;

/**
 * @author Daniel_Korban
 */

public class TabelaHash<T>{
    int tamanho;
    ListaEncadeada<T>[] lista;

    public TabelaHash(int tamanho) {
        this.tamanho = tamanho;
        this.lista = new ListaEncadeada[tamanho];
        // criar lista para cada posição da tabela
        for(int i=0; i < this.lista.length; i++){
            this.lista[i] = new ListaEncadeada<T>();
        }
    }
    
    // função hash
    private int calcularHash(T val){// valor pode ser um Wrapper
        int chave =(int)val % this.tamanho;// exemplo: val.cod
        return chave;
    }
    
    public void inserir(T valor){
        int hash = this.calcularHash(valor);
        this.lista[hash].inserir(valor);
    }
    
    public int buscar(T cod){
        // implemetar uma lógica pra caso o cod seja maior do que length
        /*if(((int)cod) > this.tamanho){
            System.out.println("O valor chave ultrapassa os limites da tabela");
        }*/
        int hash = this.calcularHash(cod);
        return this.lista[hash].buscar(cod);
    }
    
}
