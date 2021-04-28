public class ManejoDedatos {

    public int[] ordenarDeMayorAMenor(int[] numero){
        int[] vectorAux=numero;
        for (int i =0;i<4;i++){
            for (int g=0;g<4;g++){
                if (vectorAux[i]> vectorAux[g]){
                    int h=0;
                    h=vectorAux[g];
                    vectorAux[g]=vectorAux[i];
                    vectorAux[i]=h;
                }
            }
        }
        return vectorAux;
    }
    public int[] ordenarDeMenorAMayor(int[] numero){
        int[] vectorAux=numero;
        for (int i =0;i<4;i++){
            for (int g=0;g<4;g++){
                if (vectorAux[i]< vectorAux[g]){
                    int h=0;
                    h=vectorAux[g];
                    vectorAux[g]=vectorAux[i];
                    vectorAux[i]=h;
                }
            }
        }
        return vectorAux;
    }
    public int[]deIntAVector(int numero){
        int[]auxVect=new int[4];
        for (int i=auxVect.length-1;i>=0;i--){
            int numeroAuxiliar=numero%10;
            numero=numero/10;
            auxVect[i]=numeroAuxiliar;
        }
        return auxVect;
    }
    public int deVectorAInt(int[] vector){
        int numeroConvertido=0;
        String unionString = "";
        for(int i = 0; i < vector.length; i++) {
            unionString += vector[i];
        }
        numeroConvertido = Integer.parseInt(unionString);
       // System.out.println(numeroConvertido);
        return numeroConvertido;

    }
    /**public int[] deIntAVector(int numero) {
        int f = numero;
        int cifras = 0;
        while (f != 0) {
            f = f / 10;
            cifras++;
        }
        int aux2 = numero;
        int[] j = new int[cifras];
        for (int i = 0; i < j.length; i++) {
            numero = numero % 10;
            aux2 = aux2 / 10;
            j[i] = numero;
            numero = aux2;
        }
        j=invArray(j);
        mostrarVector(j);
        return j;
    }**/

    public int restar(int numero1, int numero2){
        int resultado=numero1-numero2;
        //int resultado=deVectorAInt(ordenarDeMayorAMenor(deIntAVector(t)))-deVectorAInt(ordenarDeMenorAMayor(deIntAVector(t)));
        return resultado;
    }
}
