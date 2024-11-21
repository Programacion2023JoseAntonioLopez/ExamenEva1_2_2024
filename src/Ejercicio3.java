public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.println("Cuadrado para altura 5");
        System.out.println(cadenaCuadrado(5));
        System.out.println("Cuadrado para altura 6");
        System.out.println(cadenaCuadrado(6));
    }

    /**
     * Devuelve una cadena con un cuadrado de asteriscos de la altura indicada
     * Si la altura es menor que 6 o impar devuelve altura no válida
     * @param altura
     * @return cadena con el cuadrado o error
     */
    public static String cadenaCuadrado(int altura){
        String resultado="";
        //si es menor que 6 o impar
        if(altura<6 || altura%2==1)
            resultado="altura no válida";
        else{
            //primera linea
            for(int i=0;i<altura;i++){
                resultado+="*";
            }
            resultado+="\n";
            //lineas intermedias
            for(int i=0;i<altura-2;i++){
                resultado+="*";
                for(int j=0;j<altura-2;j++){
                    resultado+=" ";
                }
                resultado+="*\n";
            }
            //ultima linea
            for(int i=0;i<altura;i++){
                resultado+="*";
            }
        }
        return resultado;
    }
}
