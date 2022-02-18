import java.util.Scanner;

public class input{
    public static void main(String[] args){
         Scanner scan = new Scanner(System.in);
         int n=0, n1=0, n2=0;
         String newest = "str";
         String Tester = "";
            System.out.print("scan.nextInt() é para input de inteiros:\n");
              n=scan.nextInt();
            System.out.printf("scan.next() é para string:\n");
            Tester = scan.next();
            System.out.printf("scan.nextLine() é para string e pula a linha:");
            Tester = scan.nextLine();
    }
}
