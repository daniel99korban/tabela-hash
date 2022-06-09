
package com.mycompany.operacoes_com_hashtable;

//mport estruturas.auxiliares.ListaEncadeada;
import tabela_hash.TabelaHash;
/**
 * @author Daniel_Korban
 */
public class Operacoes_Com_HashTable {

    public static void main(String[] args) {
        int tamanhoTabela = 5;
        var tabelaHash = new TabelaHash<Integer>(tamanhoTabela);
        
        tabelaHash.inserir(12);
        tabelaHash.inserir(20);
        tabelaHash.inserir(10);
        tabelaHash.inserir(10);
        tabelaHash.inserir(100);
        tabelaHash.inserir(12);
        tabelaHash.inserir(10);
        tabelaHash.inserir(5);
        tabelaHash.inserir(2);
        tabelaHash.inserir(6);
        tabelaHash.inserir(59);
        tabelaHash.inserir(67);
        tabelaHash.inserir(90);
        tabelaHash.inserir(24);
        // imprimir tabela
        System.out.println("Tabela Hash\n" + tabelaHash);
        // buscar
        int valor = 6;
        // true valor encontrado! false não encontrado!
        if(tabelaHash.buscar(valor))
            System.out.println("valor [" + valor + "] encontrado!");
            
        else
            System.out.println("valor [" + valor + "] Não foi encontrado na tabela!");
        
        // saida
        // Tabela Hash
        /* (0) : [20] [10] [10] [100] [10] [5] [90] 
           (1) : [6] 
           (2) : [12] [12] [2] [67] 
           (3) : 
           (4) : [59] [24] 
        */
        // valor [6] encontrado!

    }
}