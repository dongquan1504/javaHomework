import java.util.Scanner;
public class Bai5 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n,tong=0;
        System.out.println(&quot;nhap vao so nguyen n&quot;);
        Scanner input = new Scanner(System.in);
        n=input.nextInt();
        while (n>0) {
            tong+=n%10;
            n= n/10;
        }
        System.out.println("tong cac chu so cua "++" la: "+tong);
    }
}
