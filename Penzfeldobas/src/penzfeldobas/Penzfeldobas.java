/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penzfeldobas;

/**
 *
 * @author gycsaba
 */
enum PENZ {IRAS,FEJ};
public class Penzfeldobas {

    //Pénzfeldobások eredményeit tároló tömb. 1->FEJ 0->IRÁS
    static int[] penzt= {0,0,1,1,1,0,1,1,1,1,0,0,1,0,1,1,0,0,1,1,0,0,1,1,1,0,1,0,1,0,1,0,1,1,1,1,1,1,0,0,1,1,0,1,1,0,1,1,0,0,1};
    
    //Ugyan az a tömb enum tömb elem típussal
    //static PENZ[] penzt= {PENZ.IRAS,PENZ.IRAS,PENZ.FEJ,PENZ.FEJ,PENZ.FEJ,PENZ.IRAS,PENZ.FEJ,PENZ.FEJ,PENZ.FEJ,PENZ.FEJ,PENZ.IRAS,PENZ.IRAS,PENZ.FEJ,PENZ.IRAS,PENZ.FEJ,PENZ.FEJ,PENZ.IRAS,PENZ.IRAS,PENZ.FEJ,PENZ.FEJ,PENZ.IRAS,PENZ.IRAS,PENZ.FEJ,PENZ.FEJ,PENZ.FEJ,PENZ.IRAS,PENZ.FEJ,PENZ.IRAS,PENZ.FEJ,PENZ.IRAS,PENZ.FEJ,PENZ.IRAS,PENZ.FEJ,PENZ.FEJ,PENZ.FEJ,PENZ.FEJ,PENZ.FEJ,PENZ.FEJ,PENZ.IRAS,PENZ.IRAS,PENZ.FEJ,PENZ.FEJ,PENZ.IRAS,PENZ.FEJ,PENZ.FEJ,PENZ.IRAS,PENZ.FEJ,PENZ.FEJ,PENZ.IRAS,PENZ.IRAS,PENZ.FEJ};
  
    /**
     * Megszámolja, hogy a penzt tömben mennyi a fej dobások száma
     * Fej = 1
     * @return A fej dobások száma
     */
    static int getFejDb() { 
        return 0;
    }
     /**
     * Megszámolja, hogy a penzt tömben mennyi az írás dobások száma
     * Írás = 0
     * @return Az írás dobások száma
     */

    static int getIrasDb() {
        return 0;
    }
    /**
     * Megszámolja, hogy a tömbben az adott dobásból mennyi van
     * @param penz 1 ha fej, 0 ha írás
     * @return A tömbben hányszor van penz
     */
    static int getDb(PENZ penz) {
        return 0;
    }
    /**
     * Feltölti a tömböt véletlen pénzdobásokkal
     */
    static void penzfeldobas() {
        return ;
    }
    /**
     * Adott pénzérme keresettHossz hosszan hányszor van a sorozatban
     * @param keresetHossz Az adott pénzérme ennyiszer van egymás után
     * @param penz Adott pénzérme
     * @return Hányszor van adott pénzérme keresettHossz hosszan a sorozatban
     */
    static int getHosszHosszuSorozat(int keresetHossz, PENZ penz) {
        return 0;
    }
    /**
     * A két pénzérme együtt keresettHossz hosszan hányszor van a sorozatban
     * @param keresetHossz Az adott pénzérme ennyiszer van egymás után
     * @return Hányszor van a két pénzérme keresettHossz hosszan a sorozatban
     */
    static int getHosszHosszuSorozat(int keresettHossz) {
        return 0;
    }
    /**
     * Adott pénzérme esetén mi a leghosszabb ismétlődés hossza
     * @param penz Adott pénzérme
     * @return Az ismétlődés hossza
     */ 
    static int getLeghosszabSorozat(PENZ penz) {
        return 0;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
