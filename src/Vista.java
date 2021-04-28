import java.util.Scanner;

public class Vista {
    public int entradaDeDatos(){
        Scanner entrada= new Scanner(System.in);
        System.out.println("ingrese un numero");
        int ingresoPorteclado=entrada.nextInt();
        return ingresoPorteclado;
    }
    public void mostrarVector(int[] vector){
        for (int i=0;i<vector.length;i++){
            System.out.println(vector[i]);
        }
    }
    public void mostrarNumero(int numero){
        System.out.println(numero);
    }
}
