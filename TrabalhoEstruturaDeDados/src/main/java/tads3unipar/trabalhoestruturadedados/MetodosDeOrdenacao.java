/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tads3unipar.trabalhoestruturadedados;

/**
 *
 * @author felip
 */
public class MetodosDeOrdenacao {
    
    public int[] BubleSort(int vet[]){
        int []vetor = vet;
    boolean troca = true;
    while(troca){
        troca = false;
        for(int i = 0; i < vetor.length - 1; i++){
            if(vetor[i]> vetor[i+1]){
                int aux = vetor[i];
                vetor[i]= vetor[i+1];
                vetor[i+1] = aux;
                troca = true;
            }
        }
    }
    return vetor;
    }
    public int[] linear(int vet[]){
        int []Vetor = vet;
        for(int i = 0; i < Vetor.length -1 ; i++){
            int posMenor = i;
            for(int j = i+1; j < Vetor.length; j++){
             if(Vetor[j] < Vetor[posMenor]){
                 posMenor = j;
             }   
            }
            if(posMenor != i){
                int aux = Vetor[i];
                Vetor[i] = Vetor[posMenor];
                Vetor[posMenor] = aux;
            }
        }
       return Vetor;
    }
    public int[] insercao(int []vet){
         int[]vetor = vet;
        int chave, j;
        
        for(int i = 1; i < vetor.length; i++){
            chave = vetor[i];
            
            for(j = i - 1;  (j >= 0 && vetor[j] > chave) ; j-- ){
                
                vetor[j+1] = vetor[j];
                
            }
            vetor[j+1] = chave;
        }
        
        return vetor;
    }
}
