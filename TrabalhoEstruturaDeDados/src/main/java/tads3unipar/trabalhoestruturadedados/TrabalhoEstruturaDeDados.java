/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tads3unipar.trabalhoestruturadedados;
import javax.swing.JOptionPane;
/**
 *
 * @author felip
 */
public class TrabalhoEstruturaDeDados {

    public static void main(String[] args) {
        double [] selecao = new double[3];
        double [] tmpPesquisa = new double[2];
        int iniciador = -1;
        int []vetor;
        String maisEficaz1 = " ";
        String maisEficaz2 = " ";
        Insersao ss = new Insersao();
        vetor = ss.Insertvetor();
        int[] backup = new int[vetor.length];
        for(int i = 0; i < vetor.length; i ++){
            backup[i] = vetor[i];
        }
        while(iniciador != 0){
           int opcao =  Integer.parseInt(JOptionPane.showInputDialog("Digite operação a ser feita:\n0-sair\n1-Ordenação\n2-Seleção"));
            switch(opcao){
                 case 1 :
                     MetodosDeOrdenacao mm = new MetodosDeOrdenacao();
                     int op2 =  Integer.parseInt(JOptionPane.showInputDialog("Digite operação a ser feita:\n0-sair\n1-BubleSort\n2-Inserção\n3-Linear"));
                     switch (op2) {
                         case 1:
                              long inicio = System.currentTimeMillis();
                             JOptionPane.showMessageDialog(null, "Você escolheu BubloSort");
                            ss.Refeito = mm.BubleSort(vetor);
                             long fim = System.currentTimeMillis(); 
                              long tempoExecucao = fim - inicio;
                              selecao[0] = tempoExecucao;
                              maisEficaz1 = "BubleSort";
                              JOptionPane.showMessageDialog(null, "Tempo de execução bublesort = "+ tempoExecucao);
                             break;
                             case 2:
                              inicio = System.currentTimeMillis();
                             JOptionPane.showMessageDialog(null, "Você escolheu inserção");
                            ss.Refeito = mm.insercao(vetor);
                              fim = System.currentTimeMillis(); 
                               tempoExecucao = fim - inicio;
                               selecao[1] = tempoExecucao;
                                maisEficaz1 = "inserção";
                              JOptionPane.showMessageDialog(null, "Tempo de execução inserção = "+ tempoExecucao);
                             break;
                             case 3:
                                 inicio = System.currentTimeMillis();
                             JOptionPane.showMessageDialog(null, "Você escolheu linear");
                            ss.Refeito = mm.linear(vetor);
                              fim = System.currentTimeMillis(); 
                               tempoExecucao = fim - inicio;
                               selecao[2] = tempoExecucao;
                                maisEficaz1 = "linear";
                              JOptionPane.showMessageDialog(null, "Tempo de execução Linear = "+ tempoExecucao);
                             break;
                             case 0 :
                                 JOptionPane.showMessageDialog(null, "Você escolheu sair");
                                         break;
                         default:
                             JOptionPane.showMessageDialog(null, "Opção invalida");
                             break;
                     }
                     
                     
                     break;
                 case 2:
                     MetodosDeSelecao ms = new MetodosDeSelecao();
                      int op3 =  Integer.parseInt(JOptionPane.showInputDialog("Digite operação a ser feita:\n0-sair\n1-Pesquisa Linear\n2-Pesquisa Binaria"));
                      switch (op3) {
                         case 1:
                             long inicio = System.currentTimeMillis();
                             JOptionPane.showMessageDialog(null, "Você escolheu Linear");
                            ms.Linear(ss.Refeito);
                             long fim = System.currentTimeMillis();
                             long tempoExecucao = fim - inicio;
                              tmpPesquisa[0] = tempoExecucao;
                               maisEficaz2 = "Linaer";
                               JOptionPane.showMessageDialog(null, "Tempo de Pesquisa Linear = "+ tempoExecucao);
                             break;
                             case 2:
                             inicio = System.currentTimeMillis();
                             JOptionPane.showMessageDialog(null, "Você escolheu Binario");
                            ms.binario(ss.Refeito);
                             fim = System.currentTimeMillis();
                             tempoExecucao = fim - inicio;
                              tmpPesquisa[1] = tempoExecucao;
                               maisEficaz2 = "Binario";
                              JOptionPane.showMessageDialog(null, "Tempo de Pesquisa Binaria = "+ tempoExecucao);
                             break;
                             case 0 :
                                 JOptionPane.showMessageDialog(null, "Você escolheu sair");
                                         break;
                         default:
                            JOptionPane.showMessageDialog(null, "Opção invalida");
                             break;
                     }
                     break;
                 case 0:
                     JOptionPane.showMessageDialog(null, "Você escolheu sair");
                     iniciador = 0;
                                         break;
                 default:
                   JOptionPane.showMessageDialog(null, "Opção invalida");
                             break; 
            }
        }
        
        
         String vetTexto = "";
         String RefeitoTexto =""; 
         for (int i = 0; i < vetor.length; i++) {
            vetTexto = vetTexto+backup[i]+" ,";
        }
         for (int i = 0; i < vetor.length; i++) {
         RefeitoTexto = RefeitoTexto+ss.Refeito[i]+" ,";
        }
         JOptionPane.showMessageDialog(null, "Vetor original : "+vetTexto+"\nVetor Reordenada : "+RefeitoTexto);
         double MaiorSelec = 0;
         double TempSele = 0;
         for(int i = 1; i < selecao.length; i ++){
             if(selecao[i-1]< selecao[i]){
                 MaiorSelec = selecao[i];
             }else{
                 MaiorSelec = selecao[i-1];
             }
         }
         if(tmpPesquisa[0] < tmpPesquisa[1]){
             TempSele = tmpPesquisa[0];
         }else{
             TempSele = tmpPesquisa[1];
         }
         JOptionPane.showMessageDialog(null, "Tempo de execução mais eficaz de ordenação :"+MaiorSelec+" "+maisEficaz1+"\nTempo de execução mais eficar de pesquisa :"+TempSele+" "+maisEficaz2);
    } 
}
