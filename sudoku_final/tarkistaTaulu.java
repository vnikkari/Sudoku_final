package sudoku_final;

/**
 *
 * @author villenikkari & Marko Silander
 */
public class tarkistaTaulu {
    /** tarkistaa, että taulun pysty- ja vaakariveillä, sekä 3x3 neliöissä esiintyy vain kerran jokainen numero 1-9.*/
      public static boolean tarkistaTaulu(int x, int y, int[][] taulu){
      String apu = "";
      for(int i = 0; i<9; i++){
          apu += Integer.toString(taulu[i][y]); //tarkistaa vaakarivit
          apu += Integer.toString(taulu[x][i]); //tarkistaa pystyrivit
          apu += Integer.toString(taulu[(x/3)*3+i/3][(y/3)*3+i%3]); // tarkistaa pikkuneliöt
        }
      int laskuri = 0;
      int xx = 0;
      while ((xx = apu.indexOf(Integer.toString(taulu[x][y]), xx)) !=-1){
          xx++;
          laskuri++;
      }
      return laskuri == 3;
    }
}
