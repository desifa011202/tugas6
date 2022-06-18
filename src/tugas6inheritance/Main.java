/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas6inheritance;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Manusia> list = new ArrayList<>();

        list.add(new Manusia("Dimas", "215150607111009", true, true));
        list.add(new MahasiswaFilkom("Desifa", "123456789", false, false, "215150111021789",3.7));
        list.add(new Pekerja("Iqbal", "987654321", true, true, 9, 20, "201501678001675"));
        list.add(new Manajer("Irene", "2468101214", false, false, 9, 20, "204697111007333",1500));

        list.add(new Manusia("Mark","13579111315", true, true));
        list.add(new MahasiswaFilkom("Sayang", "23242522627", false, false, "21515150301111033",3.0));
        list.add(new Pekerja("Dhaiful", "5656565677", true, true, 12, 24, "201541102765"));
        list.add(new Manajer("Jonathan", "3172008960", true, true, 8, 30, "2056329381341", 3000));

        list.add(new Manusia("Lee", "2783789430", true, false));
        list.add(new MahasiswaFilkom("Duncan", "336278872t89", true, false, "273354865925168", 4.0));
        list.add(new Pekerja("Dia", "214573884787", false, false, 9, 25, "2542381374395"));
        list.add(new Manajer("Kamu", "2056681686460", true, false, 10, 26, "2045759333509", 2500));

        System.out.println("========================================");
        for (int i = 0; i < list.size() ; i++) {
            System.out.print(list.get(i).toString());
        }
    }
}
