import java.util.Scanner;

public class PrestamoBancario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese sueldo: ");
        double sueldo = sc.nextDouble();
        
        double monto;
        if (sueldo >= 3000) {
            monto = sueldo * 5;
        } else {
            monto = sueldo * 2;
        }
        
        System.out.println("Monto máximo de préstamo: S/" + monto);
    }
}
