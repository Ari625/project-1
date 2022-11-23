
package percabangan;
import java.util.Scanner;
public class soal3 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int nilai;
        System.out.print("Masukan nilai anda :");
        nilai=input.nextInt();
        
        if (nilai>=85) {
            System.out.println("A");}
        else if(nilai>=70){
        System.out.println("B");
        }
        else if(nilai>=60){
            System.out.println("C");
        }
        else if(nilai<60){
            System.out.println("E");
            System.out.println("Tidak lulus");
        }
        }
    }