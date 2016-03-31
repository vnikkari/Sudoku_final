package sudoku_final;  
/**
     * Tulostaa halutut tiedot.
     */
public class tulosta{
    public static void tulosta(int[][] testitaulu){
        for(int i = 0; i<9 ; i++){
            for(int j = 0; j<9 ; j++){
            System.out.print(testitaulu[i][j]);
            }
            System.out.println();
        }
    }
    
 }
  