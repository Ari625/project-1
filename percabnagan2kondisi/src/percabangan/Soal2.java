
package percabangan;
import java.util.Scanner;
public class Soal2 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        
         int nilai;
        
        System.out.print("Masukan nilai anda :");
        nilai=input.nextInt();
    
    if (nilai>=77){
        System.out.println("lulus");
    }
    else{
        System.out.println("Tidak lulus");
    }
    }
    
}
