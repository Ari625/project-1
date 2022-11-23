package percabangan;
import java.util.Scanner;
public class Soal4 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int nilai;
        System.out.print("Masukan nilai anda :");
        nilai=input.nextInt();
        
        if (0>=nilai){
            System.out.println("Invalid");
        }
        else if(nilai >100) {
            System.out.println("Invalid");
        }
        else if(nilai>=85) {
            System.out.println("A");
            System.out.println("Lulus");
        }
        else if(nilai>=70){
            System.out.println("B");
            System.out.println("Lulus");
        }
        else if(nilai>=60){
            System.out.println("C");
            System.out.println("Lulus");
        }
        else {
            System.out.println("E");
            System.out.println("Tidak lulus");
        }
    }
}