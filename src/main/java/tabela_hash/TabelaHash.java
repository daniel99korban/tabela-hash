package tabela_hash;
import estruturas.auxiliares.ListaEncadeada;
import estruturas.auxiliares.No;

/**
 * @author Daniel_Korban
 */

public class TabelaHash<T>{
    int tamanho;
    ListaEncadeada<T>[] tabela;

    public TabelaHash(int tamanho) {
        this.tamanho = tamanho;
        this.tabela = new ListaEncadeada[tamanho];
        // criar tabela para cada posição da tabela
        for(int i=0; i < this.tabela.length; i++){
            this.tabela[i] = new ListaEncadeada<T>();
        }
    }
    
    // função hash
    private int calcularHash(T val){// valor pode ser um Wrapper
        int chave =(int)val % this.tamanho;// exemplo: val.cod
        return chave;
    }
    
    public void inserir(T valor){
        int hash = this.calcularHash(valor);
        this.tabela[hash].inserir(valor);
    }
    
    public boolean buscar(T cod){
        // implemetar uma lógica pra caso o cod seja maior do que length
        /*if(((int)cod) > this.tamanho){
            System.out.println("O valor chave ultrapassa os limites da tabela");
        }*/
        int hash = this.calcularHash(cod);
        return this.tabela[hash].buscar(cod);
    }

    @Override
    public String toString() {
        String valores = "";
        int i = 0;
        for(ListaEncadeada<T> lista: this.tabela){
            valores += "(" + i + ") : " + lista + "\n";
            i++;
        }
        return valores;
    }
    
}
