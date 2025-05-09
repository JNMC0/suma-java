import java.util.Scanner;
public class Numero{
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
    
         System.out.println("Ingresa un digito: ");
        int numero = scanner.nextInt();

        System.out.println("Ingresa un digito: ");
        int numero2 = scanner.nextInt();
        
     System.out.println("Ingresa un digito: ");
        int numero3 = scanner.nextInt();

          System.out.println("Ingresa un digito: ");
        int numero4 = scanner.nextInt();
         
         int suma=(numero+numero2+numero3+numero4);
        System.out.println("Tu nombre "+ suma);
        
    }
}
