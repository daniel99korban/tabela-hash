package estruturas.auxiliares;
/**
 *
 * @author Daniel_Korban
 */
public class ListaEncadeada<T> implements Lista<T>{
    
    No<T> noInicio;
    int tamanho;
    
    public ListaEncadeada(){
        this.noInicio = new No<T>();
        this.noInicio = null;
        this.tamanho = 0;
    }
    /**
     * @return 0 lista vazia
     * @return 1 lista contém elementos
     */
    
    @Override
    public  String toString(){
        String valores = "";
        
        if(this.tamanho == 0) return valores;
        
        var noAux = new No<T>();
        noAux = this.noInicio;
        
        while(noAux != null){
            valores += "[" + noAux.getValor() + "] ";
            noAux  = noAux.getProximo();
        }
        
        return valores;
    }
    
    @Override
    public void inserir(T valor){
        var novoNo = new No<T>();
        novoNo.setValor(valor);
        novoNo.setProximo(null);
        // Inserir no inicio
        if(this.tamanho == 0){
            noInicio = novoNo;
            this.tamanho++;
            return;
        }
        
        var noAux = this.noInicio;
        
        while(noAux.getProximo() != null){
            noAux = noAux.getProximo();
        }
        noAux.setProximo(novoNo);
        this.tamanho++;
        
    }
    
    @Override
    public boolean buscar(T valor){
        var noAux = new  No<T>();
        noAux = this.noInicio;
        
        while(noAux.getValor() != valor && noAux != null){
            noAux = noAux.getProximo();
        }
        // valor não foi encontrado
        if(noAux == null) return false;
        return true;
    }

    @Override
    public boolean remover(T valor) {
        return false;
    }
}
