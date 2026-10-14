import java.util.Scanner;

public class ComparacionNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese primer número: ");
        int a = sc.nextInt();
        System.out.print("Ingrese segundo número: ");
        int b = sc.nextInt();
        System.out.print("Ingrese tercer número: ");
        int c = sc.nextInt();
        
        int mayor = Math.max(a, Math.max(b, c));
        int menor = Math.min(a, Math.min(b, c));
        int diferencia = mayor - menor;
        
        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);
        System.out.println("Diferencia: " + diferencia);
    }
}
