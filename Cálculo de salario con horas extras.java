import java.util.Scanner;

public class SalarioHorasExtras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese horas trabajadas: ");
        int horas = sc.nextInt();
        
        double salario;
        if (horas > 40) {
            salario = (40 * 20) + ((horas - 40) * 40);
        } else {
            salario = horas * 20;
        }
        
        System.out.println("Salario total: S/" + salario);
    }
}
