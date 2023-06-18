/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tads3unipar.trabalhoestruturadedados;

import javax.swing.JOptionPane;

/**
 *
 * @author felip
 */
public class MetodosDeSelecao {
    public void Linear(int []vet){
        int []vetor = vet;
        int chave = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor a ser pesquisado"));
        JOptionPane.showInputDialog("Elemento na posição :"+pesquisar(chave, vetor));
       
    }
    public static int pesquisar(int chave, int []vet){
        for (int i = 0; i < vet.length; i++) {
            if(chave == vet[i])
                return i;
        }
        return -1;
    }
    public void binario(int []vet){
        int []vetor = vet;
        int chave = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor a ser pesquisado"));
        int pesq = pesqBinaria(chave, vetor);
        JOptionPane.showMessageDialog(null, "Elemento na posição :"+pesq);
    }
     public static int pesqBinaria(int chave, int vet[]){
      int esquerda, meio, direita;
        esquerda = 0;
        direita = vet.length -1;
        
        while(esquerda <= direita){
            meio = (esquerda + direita) / 2;
            if(chave == vet[meio]){
                return meio;
            }
            if(chave > vet[meio]){
                esquerda = meio +1;
            }else{
                direita = meio -1;
            }  
        }
        return -1;
    }
   
}
