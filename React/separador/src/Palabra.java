import java.util.Scanner;

public class Palabra {
    Scanner entradaDatos = new Scanner(System.in);
    String palabra;
    String letras;
    int contador;
    String nuevaCadena;

    public Palabra() {
    }

    public void ingresarFrase() {

        System.out.println("ingrese la frase");
        palabra = entradaDatos.nextLine();
    }

   
        public void recorrerPalabra() {
            System.out.println(" \ncaracteres pares RECORRER PALABRA : ");
            
            for (int i = palabra.length()-1 ; i >=1; i-=2) {
          //  for (int i = 0; i < palabra.length() ; i+=2){
          //  for (int i=1; i< palabra.length() ; i+=2) {
                System.out.print(" " + palabra.charAt(i));
    
            }
        }

        public void invertirPalabra() {
            System.out.print(" \ncaracteres impares INVERTIRPALABRA: \n");
           // for (int i = 0; i < palabra.length() ; i+=2){
            for (int i = palabra.length() - 1; i >= 0; i-=2) {
                System.out.print(" " + palabra.charAt(i));
    
            }
        }
        // for (int i = 0; i < palabra.length() ; i+=2) {
        // if (Character.isLetter(palabra.charAt(i))) {
        // contador++;
        // letras += palabra.charAt(i);
      //  System.out.print(" " + palabra.charAt(i));

        // for ( i = palabra.length() - 1; i >= 0; i--) {
        // nuevaCadena = nuevaCadena + palabra[i]; // o nuevaCadena = nuevaCadena +
        // cad[i];
        // }
        // }
        // }

    

    public void numeroIntermedio() {
        // System.out.println(palabra.charAt(0) + " " ); //+ letras + " " +
        // palabra.substring(palabra.length() -1 ));
        System.out.println(" \npalabra : " + palabra);
    }

    public void mostarcaracteresYpalabras() {
        // cuenta cantidad de caracteres con espacios tambien
        // System.out.print("cantidad de caracteres: ");
        // System.out.println(palabra.split("\\s+||,").length);

        // cuenta cantidad de palabras
        System.out.print("cantidad de palabras: ");
        System.out.println(palabra.split("\\s+|\n|,").length);

    }

}

/*
 * public static int cuentaPalabras(String s){
 * int conteoPalabras = 0;
 * boolean palabra = false;
 * int finDeLinea = s.length() - 1;
 * 
 * for (int i = 0; i < s.length(); i++) {
 * // Si el char is una letra, word = true.
 * if (Character.isLetter(s.charAt(i)) && i != finDeLinea) {
 * palabra = true;
 * // Si el char no es una letra y aún hay más letras,
 * // el contador continua.
 * } else if (!Character.isLetter(s.charAt(i)) && palabra) {
 * conteoPalabras++;
 * palabra = false;
 * // última palabra de la cadena; si no termina con una no letra ,
 * } else if (Character.isLetter(s.charAt(i)) && i == finDeLinea) {
 * conteoPalabras++;
 * }
 * }
 * return conteoPalabras;
 * }
 */
