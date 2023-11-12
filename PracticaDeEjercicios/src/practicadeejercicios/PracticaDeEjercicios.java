/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicadeejercicios;

import java.util.Scanner;

/**
 *
 * @author Guillermo
 */
public class PracticaDeEjercicios {

    /**
     * @param args the command line arguments
     */
    float [][] Matriz = new float [0][0]; 
    
    //Ejercicio 1
    public static void hexadecimal(int x, String y){
        if (x>0){
            switch(x%16){
                case 0: hexadecimal(x/16, "0"+y); break;
                case 1: hexadecimal(x/16, "1"+y); break;
                case 2: hexadecimal(x/16, "2"+y); break;
                case 3: hexadecimal(x/16, "3"+y); break;
                case 4: hexadecimal(x/16, "4"+y); break;
                case 5: hexadecimal(x/16, "5"+y); break;
                case 6: hexadecimal(x/16, "6"+y); break;
                case 7: hexadecimal(x/16, "7"+y); break;
                case 8: hexadecimal(x/16, "8"+y); break;
                case 9: hexadecimal(x/16, "9"+y); break;
                case 10: hexadecimal(x/16, "A"+y); break;
                case 11: hexadecimal(x/16, "B"+y); break;
                case 12: hexadecimal(x/16, "C"+y); break;
                case 13: hexadecimal(x/16, "D"+y); break;
                case 14: hexadecimal(x/16, "E"+y); break;
                case 15: hexadecimal(x/16, "F"+y); break;
            }
        }
        else{
            System.out.println("Hexadecimal: "+y);
        }
    }
    
    //Ejercicio 2
    public static void suma(int a, int b, int n){
        if (n<1){
            System.out.println("Numero permitidos solo mayores a 0 (enteros)");
        }
        else{
            if (n==1){
                System.out.println(a);
            }
            else{
                System.out.println(a);
                a=a+b;
                n--;
                suma(a, b, n);
            }
        }
    }
    
    //Ejercicio 3
    public static void fibonacci(int a, int primero, int segundo, int i){
        if (a<1){
            System.out.println("Solo se permiten numeros enteros mayores a cero (0)");
        }
        else{
            if (i<a){
                if (i==1){
                    System.out.println("1");
                    System.out.println("0+1= 1");
                    i+=2;
            }
            int tercero = primero + segundo;
            System.out.println(primero + "+" + segundo + "= " + tercero);
            primero = segundo;
            segundo =  tercero;
            //System.out.println(tercero);
            i++;
            fibonacci (a, primero, segundo, i);
            }
        }
    }
    
    //Ejercicio 4 (njd profe, ya me duele el coco con este ejercicio ;-;)
    public void matrizMaker(){
        System.out.println("Ingrese las dimensiones de la matriz\n\r(al ser una matriz cuadrada solo necesita ingresar un valor)");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        float [][] matriz = new float [n][n]; 
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                System.out.println("Ingrese el valor del lugar i: "+j+", j: "+i);
                matriz[i][j] = scanner.nextInt();
            }
        }
        matrizShower(matriz);
        suMadreXd(matriz, 0);
    }
    public static void matrizShower(float [][] matriz){
        int n = matriz.length;
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void suMadreXd(float [][] matriz, int a){
        for (int b=a+1; b<matriz.length;b++){
            if (matriz [a][a] !=0){
                float cociente = -(matriz[b][a] / matriz[a][a]);//formula de la pizarra
                System.out.println("----pivot----"+matriz [b][a]);
                for (int i=a;i<matriz.length;i++){
                    matriz[b][i]+=(cociente*matriz[a][i]);
                }
            }
            matrizShower(matriz);
        }
        a++;
        if (a<matriz.length-1){
            suMadreXd(matriz, a);
        }
        else{
            //matrizShower(matriz);
            float z =1;
            for (int n=0; n<matriz.length; n++){
                z=z*matriz[n][n];
            }
            System.out.println("Determinante: "+(float)Math.round(z*1000d)/1000d);
        }
    }
    
    //Ejercicio 5 
    public static void tabla(int x, int n){
        if (n<12){
            System.out.println(x + " x " + (n+1) + " = " + (x*(n+1)));
            tabla(x, n+1);
        }
    }
    
    //Ejercicio 6
    public static void ciudades(int n, String [] ciudades){
        Scanner scanner = new Scanner(System.in);
        if (n==10){
            for (int i=0; i<10; i++){
                System.out.println("Ingrese el nombre de la ciudad numero "+(i+1));
                ciudades[i]= scanner.nextLine();
            }
            n--;
        }
        
        if (n>-1){
            System.out.println(ciudades[n]);
            ciudades(n-1, ciudades);
        }
    }
    
    //Ejercicio 7
    public static void menuPotenciaFactorial(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione 1 para calcular potencia \n\r Seleccione 2 para calcular factoial");
        int n = scanner.nextInt();
        switch (n){
            case 1:
                System.out.println("Introduzca la base");
                int x = scanner.nextInt();
                System.out.println("Introduzca el exponente");
                int y = scanner.nextInt();
                potencia(x, y, x);
                break;
            case 2:
                System.out.println("Introduzca la base");
                int z = scanner.nextInt();
                factorial(z, 1, 2);
                break;
            default:
                System.out.println("Elección no válida");
                menuPotenciaFactorial();
        }
    }
    public static void potencia(int x, int y, int a){
        if (y>1){
            x= x*a;
            potencia(x, y-1, a);
        }
        else{
            System.out.println(x);
        }
    }
    public static void factorial(int x, int a , int b){
        if (x>1){
            a=a*b; b++; x--;
            factorial(x, a, b);
        }
        else{
            System.out.println(a);
        }
    }
    
    //Ejercicio 8
    public static void palindromo(String cadena, int p, String palindromo){
        if (p<cadena.length()){
            palindromo+=cadena.charAt(cadena.length()-(p+1));
            p++;
            palindromo(cadena, p, palindromo);
        }
        else{
            if (cadena.equals(palindromo)){
                System.out.println("\"" + cadena + "\"" + " efectivamente es un palindromo");
            }
            else{
                System.out.println("\"" + cadena + "\"" + " no es un palindromo");
            }
        }
    }
    
    //Ejercicio 9
    public static void voltear(String cadena, int p, String palindromo){
        if (p<cadena.length()){
            palindromo+=cadena.charAt(cadena.length()-(p+1));
            p++;
            voltear(cadena, p, palindromo);
        }
        else{
            System.out.println(palindromo);
        }
    }
    
    //Ejercicio 10
    public static void numerosMaker(int [] numeros, int n){
        Scanner scanner = new Scanner(System.in);
        if (n<numeros.length){
            System.out.println("Ingrese el numero:");
            numeros[n]=scanner.nextInt(); n++;
            numerosMaker(numeros, n);
        }
        else{
            contador(numeros, 0, 0, 0);
        }
    }
    public static void contador(int [] numeros, int pa,int im, int i){
        int po=0; int ne=0;
        if (i<numeros.length){
            if (numeros[i]%2==0){
                pa++;i++;
                contador(numeros, pa, im, i);
            }
            else{
                im++;i++;
                contador(numeros, pa, im, i++);
            }
        }
        
        else{
            for (int n=0; n<numeros.length;n++){
                if (numeros[n]>0){
                    po+=numeros[n];
                }
                else{
                    ne+=numeros[n];
                }
            }
            System.out.println("Suma de positivos: "+po);
            System.out.println("Suma de negativos: "+ne);
            System.out.println("Numeros pares: "+pa);
            System.out.println("Numeros impares: "+im);
        }
    }
    
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PracticaDeEjercicios main = new PracticaDeEjercicios();
        
        //Ejercicio 1
        /*System.out.println("Ingrese el numero a traducir");
        int x = scanner.nextInt();
        hexadecimal(x, "");*/
        
        //Ejercicio 2
        /*System.out.println("Ingrese el numero a sumar");
        int a = scanner.nextInt();
        System.out.println("Ingrese el numero de veces que se ejecutará la suma");
        int n = scanner.nextInt();
        suma(a,a,n);*/
        
        //Ejercicio 3
        /*System.out.println("Ingrese el numero de la secuencia fibonacci que desea");
        int a = scanner.nextInt();
        fibonacci(a+1,1,1,1);*/
        
        //Ejercicio 4 (incompleto)
        //main.matrizMaker();
        
        //Ejercicio 5
        /*System.out.println("Ingrese el numero del que desea obtener su tabla");
        int x = scanner.nextInt();
        tabla(x, 0);*/
        
        //Ejercicio 6
        /*String [] ciudades = new String[10]; 
        ciudades(10, ciudades);*/
        
        //Ejercicio 7
        //menuPotenciaFactorial();
        
        //Ejercicio 7.1
        /*System.out.println("Introduzca la base");
        int x = scanner.nextInt();
        System.out.println("Introduzca el exponente");
        int y = scanner.nextInt();
        potencia(x, y, x);*/
        
        //Ejercicio 7.2
        /*System.out.println("Introduzca la base");
        int z = scanner.nextInt();
        factorial(z, 1, 2);*/
        
        //Ejercicio 8
        /*System.out.println("Ingrese el palindromo a verificar");
        String cadena = scanner.nextLine();
        palindromo(cadena, 0,"");*/
        
        //Ejercicio 9
        /*System.out.println("Ingrese la palabra a voltear");
        String cadena = scanner.nextLine();
        voltear(cadena, 0,"");*/
        
        //Ejercicio 10
        /*System.out.println("¿Cuantos numeros desea introducir?");
        int n = scanner.nextInt();
        int [] numeros = new int[n];
        numerosMaker(numeros, 0);*/
    }
}
