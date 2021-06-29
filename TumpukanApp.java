 public class TumpukanApp {
 public static void main (String [] args) {
       Tumpukan tumpukan= new Tumpukan();
       tumpukan.push(4);
       tumpukan.baca();
       tumpukan.push(1);
       tumpukan.baca();
       tumpukan.push(3);
       tumpukan.baca();
       long nilail=tumpukan.pop();
       System.out.println("nilai = "+nilail);
       System.out.println(" ");
       tumpukan.pop(3);
       tumpukan.baca();
       tumpukan.push(4);
       tumpukan.baca();
       long nilai2 =tumpukan.pop();
       System.out.print("nilai2 = "+nilai2);
       System.out.println(" ");
       tumpukan.baca();
  }
}
 

