public class Inicio {
    public static void main(String[] args){
        ManejoDedatos variableAux1=new ManejoDedatos();
        Vista variableAux2=new Vista();

        int auxiliar=variableAux2.entradaDeDatos();
        int numero=auxiliar;
        int j=0;

        while (numero!=6174){
            j=j+1;
            System.out.println(j);
            int numero1=(variableAux1.deVectorAInt(variableAux1.ordenarDeMayorAMenor
                    (variableAux1.deIntAVector(numero))));
            int numero2=(variableAux1.deVectorAInt(variableAux1.ordenarDeMenorAMayor
                    (variableAux1.deIntAVector(numero))));
            int resta=variableAux1.restar(numero1,numero2);
            numero=resta;
        }
        variableAux2.mostrarNumero(numero);
    }
}
