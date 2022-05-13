
package com.mycompany.operacoes_com_hashtable;

//mport estruturas.auxiliares.ListaEncadeada;
import tabela_hash.TabelaHash;
/**
 * @author Daniel_Korban
 */
public class Operacoes_Com_HashTable {

    public static void main(String[] args) {
        int tamanhoTabela = 10;
        var tabelaHash = new TabelaHash<Integer>(tamanhoTabela);
        
        tabelaHash.inserir(12);
        tabelaHash.inserir(20);
        tabelaHash.inserir(10);
        tabelaHash.inserir(5);
        // buscar
        System.out.println(tabelaHash.buscar(10));// 1 valor encontrado! 0 não encontrado!
    }
}
// Testar lista encadeada
/*var minhaLista = new ListaEncadeada<Integer>();
        
  minhaLista.inserir(45);
  minhaLista.inserir(23);
  minhaLista.inserir(2);
  minhaLista.inserir(12);
        
  if(minhaLista.mostrar() == 0){
    System.out.println("Lista esta vazia");
  }else if(minhaLista.mostrar() == 1){
    System.out.println("Tem valores");
  }else{
    System.out.println("num existe lista pow");
  }
*/