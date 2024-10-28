public class Recursividad {
    
    public int factorial( int n) {
        System.out.println("Calculando el factorial de: " + n);

        if(n == 0 || n==1){
            System.out.println("Caso base alcanzado el facorial de "+n+"  es 1 ");
            return 1; 
        }
        int resultado  = n * factorial (n -1);

        System.out.println("Resultado parcial para " +n+ " * factorial " +( n-1) ) ;
        return resultado;

    }
     public int sumaConsecutivos(int n) {
        if(n ==1) {
            return 1;
        }
        return n + sumaConsecutivos(n-1);
    }

    //Calculca la potencia de un número
    public int potencia(int base, int exponente) {
        return 1;

    } 
}

