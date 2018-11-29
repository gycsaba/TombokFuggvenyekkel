/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nezoter;

/**
 *
 * @author gycsaba
 */
public class Nezoter {

     /** A szék lehet foglalt, vagy szabad  */
    enum Szek {FOGLALT,SZABAD};
    
    /** Nézőtéri foglaltsági mátrix  */
    static int[][] nezoter= { 
        {0,0,1,1,0,1,1,1,0},
        {1,1,0,0,0,1,0,1,1},
        {1,1,1,1,0,0,0,0,1},
        {1,0,1,0,1,0,1,1,1},
        {1,1,1,1,1,1,1,1,1},
        {1,1,0,0,0,1,1,0,0},
        {1,1,1,1,1,1,1,1,1},
        {0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,1,0,0,0}        
    };
    /** Nézőtér székeinek kategóriabesorolása  */
    static int[][] kategoria= { 
        {4,4,4,4,4,4,4,4,4},
        {4,4,4,4,3,4,4,4,4},
        {4,4,4,3,3,3,4,4,4},
        {3,3,3,2,2,2,3,3,3},
        {3,3,2,2,2,2,2,3,3},
        {3,2,2,1,1,1,2,2,3},
        {2,2,2,1,1,1,2,2,2},
        {2,2,1,1,1,1,1,2,2},
        {1,1,1,1,1,1,1,1,1}        
    };
    /** Adott kategóriába tartozó szék ára  */
    static int[] ar={5000,4000,3000,1000};
    
    /**
     * Meghatározza, hogy a nézőtéren hány foglalt szék van
     * @return Foglalt székek száma
     */
    static int getFoglaltDb() {
        return 0;
    }
    /**
     * Meghatározza, hogy adott sorban és adott kategóriában hány foglalt szék van
     * @param kategoria A szék árkategóriájának kódja
     * @param sor A nézőtér adott sora
     * @return Adott sorban és adott kategóriában foglalt székek száma
     */
    static int getDbFoglalasKategoriabanAdottSorban(int kategoria,int sor) {
        return 0;
    }
    /**
     * Meghatározza, hogy adott kategóriában hány foglalt szék van
     * @param kategoria A szék árkategóriájának kódja
     * @return Adott kategóriában foglalt székek száma
     */
    static int getDbFoglalasKategoriaban(int kategoria) { 
        return 0;
    }
    /**
     * Meghatározza, hogy adott kategóriában mennyi volt a bevétel
     * @param kategoria A szék árkategóriájának kódja
     * @return Adott kategóriában a bevétel
     */    
    static int getBevetelKategoriaban(int kategoria) {
        return 0;
    }
    /**
     * Meghatározza, hogy a foglalások alapján mennyi a bevétel
     * @return A bevétel a foglalások alapján
     */    
    static int getBevetel() {
        return 0;
    }    
    /**
     * Meghatározza, hogy a nézőtéren van-e pontossan szabadHelyMeret db egymás melletti üres szék
     * @param szabadHelyMeret A keresett szabad helyek száma
     * @return Van-e pontossan szabadHelyMeret szabad hely vagy nincs
     */    
    static boolean vanPontNDbSzabadHely(int szabadHelyMeret) {
        return false;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
