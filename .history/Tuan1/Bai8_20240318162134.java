import java.util.Scanner;
public class Bai8 {
 
 
public static void main(String[] args) {
 
     System.out.println("Xin moi nhap mot xau ky tu: ");
 
     Scanner input=new Scanner(System.in);
 
     //Doc vao mot xau
 
     String xau=input.nextLine();
 
     //Chuyen xau thanh mang ky tu
 
     char[] xaudao=xau.toCharArray();
 
     //Doi vi tri cac ky tu o hai dau xau
 
     for(int i=0;i<xau.length()/2;i++){
 
          char temp=xaudao[i];
 
          xaudao[i]=xaudao[xaudao.length-i-1];
 
          xaudao[xaudao.length-i-1]=temp;
 
     }
 
     //Chuyen mang ky tu thanh xau
 
     String ketqua= String.valueOf(xaudao);
 
     System.out.println("xau dao: "+ketqua);
 
     }
 
}
}
