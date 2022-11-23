//keterangan nama package
package operatorpbo;
//
import java.util.Scanner;
//keterangan nama class
public class operatorTernary {
//keterangan method
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        //tipe data dan variabel
        int nilai= 75;
        String ucapan =nilai >=70 ? "anda lulus" : "anda tidak lulus";// jika true maka "anda
        System.out.println(ucapan);//menampilkan variabel ucapan
    }
    
}
