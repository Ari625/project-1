//keterangan nama package
package operatorpbo;
//keterangan nama class
public class OperatorAritmatika {
//keterangan method
    public static void main(String[] args) {
      //Deklarasi Variabel
      int a,b,c,d;
      int hasil;
      a=10;
      b=5;
      c=6;
      d=10;
      
      //penjumlahan
      hasil= a+b+c+d;
      System.out.println("hasil dari penjumlahan:"+hasil);
      
      //pengurangan
      hasil= a-b-c-d;
      System.out.println("hasil dari pengurangan:"+hasil);
      
      //perkalian
      hasil= a*b*c*d;
      System.out.println("hasil dari perkalian:"+hasil);
      
      //pembagian
      hasil= a/b/c/d;
      System.out.println("hasil dari pembagian:"+hasil);
      
      //sisa bagi
      hasil= a%c;
      System.out.println("hasil dari sisa bagi:"+hasil);
      
    }
    
}
