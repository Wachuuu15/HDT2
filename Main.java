/**
 * 
 * @author Jennifer Michelle Toxcon 
 * 15/07/2022
 * Semestre 3
 * Calculadora
 * 
 */
import java.util.Scanner;


public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        boolean salida = false;
        StackVector stc = new StackVector();

        while(!salida){

            System.out.println("Elija la opcion que necesite ejecutar");
            System.out.println("1. Ingresar la ruta del archivo");
            System.out.println("2. Salir");
            int opc = sc.nextInt();
            sc.nextLine();

            switch (opc) {
                case 1:
                String pathway = sc.nextLine();
                Reader reader = new Reader(pathway);
                Scanner evaluate = new Scanner(reader.leer());


                System.out.println("Resultados: ");
                while (evaluate.hasNextLine()) {
                    String result = evaluate.nextLine();
                    System.out.println("Ecuacion: " + "'" + result + "'" + " es igual a " + "'" + stc.Evaluate(result) + "'");
                }
                    break;

                    case 2:
                    salida = true;
                    break;
            }



        }
        sc.close();        

    }
    
}
