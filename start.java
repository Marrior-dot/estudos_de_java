public class start{
    public static void main(String[] firstarg){
        System.out.print("Hallo\n");

        System.out.print("o comando print pula linh\n");
        System.out.println("o comando println escreve somente em linha");
        System.out.printf("o comando printf permite formatar %d(inteiro) %s(string) %f(float)",12,"STRING",12.2);

        int num = 2;
        int num1 = 4;
        int num2 =  5;

        int res = num + num1 + num2;
        if( res >= 10){
            System.out.print("\nSomething");
        }
        else if( res <= 10){
            System.out.printf("\nSomethingLess");
        }
        else {
            System.out.printf("\ndo something %d, %d, %d, %d", res, num1, num2, res);
        }

        String lig = (res >= 10 ? "\nsintaxe semelhante ao js" : "");
        System.out.printf("\n%s",lig);
        
        int queSaco = 10;

        switch(queSaco){
            case 1: 
            System.out.print("\ncase1");
            break;
            case 2:
            System.out.print("\ncaso2");
            break; 
            case 3: 
            System.out.print("\ncaso3");
            break;
            case 4: case 5: case 6:
            System.out.print("\ncaso para vários casos");
            break;
            default:
            System.out.print("\nCaso para qund o caso n corresponder a nenhum caso");
            break;
        }
    }
}