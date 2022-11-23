//keterangan nama package 
package percabangan;
//keterangan Scanner
import java.util.Scanner;
//keteranagn nama class
public class denganinputan {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        int nilai;
         System.out.print("masukan nilai : ");
         nilai = input.nextInt();
         if (nilai>77){
             System.out.println("selamat anda lulus");
         }else{
             System.out.println("Anda tidak lulus");
         }
    }
    
}
 