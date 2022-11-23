//keterangan nama package
package percabangan;
//
import java.util.Scanner;
//keterangan nama class
public class percabangan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        char Merkbaju;
        System.out.print("Masukan Merk baju :");
        Merkbaju=input.next().charAt(0);
         
        if (Merkbaju=='H'){
            System.out.println("Nevada");
        } else if (Merkbaju=='u'){
            System.out.println("uniqlo");
        }
        else if (Merkbaju=='z'){
            System.out.println("Zara");
        } else{
            System.out.println("merkbaju tidak ada");
        }
    }
    
}
