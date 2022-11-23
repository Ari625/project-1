package tugaspbo;
import java.util.Scanner;
public class Tugaspbo {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    String hari;
    
    System.out.print("Masukan nama hari :");
    hari=input.next();
    
    switch (hari) {
        case "senin" :
             System.out.println("mapel pada hari senin adalah : basis data, pemrograman web, pai dan ppl");
        break;
        case "selasa" :
              System.out.println("mapel pada hari selasa adalah : ppl, bahasa inggris, pmrograman web, pkk dan plh");
            break;
        default:
            System.out.println("tidak ada dalam daftar"); 
    }
    }   
}
