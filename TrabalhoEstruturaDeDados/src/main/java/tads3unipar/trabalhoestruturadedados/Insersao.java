/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tads3unipar.trabalhoestruturadedados;

import javax.swing.JOptionPane;
import java.util.Random;

/**
 *
 * @author felip
 */
public class Insersao {
    int vetor[];
    public int[] Insertvetor(){ 
    int n = Integer.parseInt(JOptionPane.showInputDialog("Informe o limite do vetor: "));
    vetor = new int[n];
    for(int i = 0; i < vetor.length; i++){
       vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor a ser adicionado ao vetor: "));
      /* Random gg = new Random();
       vetor[i] = gg.nextInt();*/
       Refeito = vetor;
    }
    return vetor;
    }
    int []Refeito;
}
