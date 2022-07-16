
package tabela_hash;

import estruturas.auxiliares.Lista;

/**
 *
 * @author danielkorban
 */
public class TesteTabelaHash {
    public static void main(String[] args) {
       
        int tamanhoDeTabela = 3;
        Lista<Integer> tabHash = new TabelaHash<>(tamanhoDeTabela);
        
        tabHash.inserir(23);
        tabHash.inserir(18);
        tabHash.inserir(22);
        tabHash.inserir(19);
        tabHash.inserir(24);
        
        System.out.println("TABELA HASH\n" + tabHash);
        int valor = 22;
        if(tabHash.buscar(valor)){
            System.out.printf("valor: %d encontrado na tabela!%n", valor);
        }else{
            System.out.printf("valor: %d não encontrado!%n", valor);
        }
    }
}
