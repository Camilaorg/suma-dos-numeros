package suma;
import java.util.Scanner;
public class Suma {
    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
        float n1,n2,r;
        System.out.print("ingresa el segundo numero: ");
        n1=leer.nextFloat();
        System.out.print("ingresa el segundo valor: ");
        n2=leer.nextFloat();
        r=n1+n2;
        System.out.print("la suma es:"+r);
    }
    
}
