//keterangan nama package
package percabangan;
//keterangan Scanner
import java.util.Scanner;
//keterangan nama class
public class invalid {
     //keterangan method
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        double nilai;
        System.out.print("masukan nilai :");
        nilai = input.nextDouble();
        if (nilai<0){
            System.out.println("output invalid");
        }else if (nilai>100){
            System.out.println("output invalid");
        } else if (nilai>=85){ 
            System.out.println("A");
        }else if (nilai>70){
            System.out.println("B");
        }else if (nilai>60){
            System.out.println("C");
        }else if (nilai<60){
            System.out.println("E");
            System.out.println("Tidak Lulus");
        }
                
        } 
    
}
