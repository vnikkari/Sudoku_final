package sudoku_final;
import sudoku_final.tarkistaTaulu;
import static sudoku_final.uusiPeli.uusiPeli;
/**
 *
 * @author villenikkari & Marko Silander
 */
public class Driver extends tarkistaTaulu{

        static int pelitaulu[][] = new int[][]{
                        {0,0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0,0}
        };
        static int[][] oikeintaytetty = {
                        {2,1,3,4,5,6,7,8,9},
                        {4,5,6,7,8,9,1,2,3},
                        {7,8,9,1,2,3,4,5,6},
                        {1,2,4,3,6,5,8,9,7},
                        {3,6,5,8,9,7,2,1,4},
                        {8,9,7,2,1,4,3,6,5,},
                        {5,3,1,6,4,2,9,7,8},
                        {6,4,2,9,7,8,5,3,1},
                        {9,7,8,5,3,1,6,4,2}};
        
           static int[][] k1 = {
                        {0,0,0,0,6,0,0,0,0},
                        {0,5,0,0,0,0,0,7,0},
                        {6,9,2,0,0,0,1,3,4},
                        {0,6,1,9,0,2,4,8,0},
                        {2,0,0,6,5,8,0,0,1},
                        {0,8,5,7,0,4,3,6,0},
                        {5,3,9,0,0,0,6,2,8},
                        {0,1,0,0,0,0,0,4,0},
                        {0,0,0,0,9,0,0,0,0}};
        
   
    public static void main(String[] args){
       /**Ensimmainen ideksi x, toinen y*/
        /* testi___----
       for(int i = 0; i<9; i++){
             for(int j = 0; j<9; j++){
                 testitaulu[i][j]=pelitaulu[i][j];
             }
         }*/
   // System.out.println(tarkistaTaulu(4, 4, oikeintaytetty));
   // tulosta(arvoKentta());
    tulosta(uusiPeli());
   
    }
    /** 
     *Käy läpi taulun kaikki indeksit, ja tarkistaa ovat numerot oikein täytetty.
     @return palauttaa true, jos taulu on täytetty oikein
     */
  
    
    /**
     *
     * Tulostaa halutut tiedot.
     */
    
    public static void tulosta(int[][] testitaulu){
        for(int i = 0; i<9 ; i++){
            for(int j = 0; j<9 ; j++){
            System.out.print(testitaulu[i][j]);
            }
            System.out.println();
        }
    }
}