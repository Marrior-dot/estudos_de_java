import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String[] args){
        //como inicializar o array
        int[] intarray = new int[6];//--> posições do array no final
        char[] gabarito = {12, 12};    

        Scanner scan = new Scanner(System.in);

        intarray[0]= 11;
        intarray[1] = 2;
        intarray[2] = 12;
        intarray[3] = 22;
        intarray[4] = 66;

        /*System.out.print("Escolha a ultima posição do array");
        intarray[5] = scan.nextInt();
        
        for(int count = 0; count < intarray.length; count++ ){
            System.out.print(intarray[count]);
        }*/

        //Syntax de For mais rápida.

        int[] hue = {33, 99, 23};
        Arrays.sort(hue);    
        for(int m:hue){
                System.out.printf("%d / ", m);
        }

        
        
    }
}
