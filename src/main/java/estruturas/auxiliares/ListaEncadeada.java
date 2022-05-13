package estruturas.auxiliares;
/**
 *
 * @author Daniel_Korban
 */
public class ListaEncadeada<T> {
    
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
    public int mostrar(){
  
        if(this.tamanho == 0) return this.tamanho;
        
        var noAux = new No<T>();
        noAux = this.noInicio;
        
        while(noAux != null){
            System.out.println(noAux.getValor());
            noAux  = noAux.getProximo();
        }
        return 1;
    }
    
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
    
    public int buscar(T valor){
        var noAux = new  No<T>();
        noAux = this.noInicio;
        
        while(noAux.getValor() != valor && noAux != null){
            noAux = noAux.getProximo();
        }
        // valor não foi encontrado
        if(noAux==null) return 0;
        return 1;
    };
}
