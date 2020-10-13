package curp;

import java.util.Scanner;

public class Main{
    
    public static void main(String[] args) {
    
        Persona persona1 = new Persona();
        char tecla;

        Scanner entrada = new Scanner(System.in);

        do{

            System.out.println("\n\t\tMENU");
            System.out.println();
            System.out.println("[ 1 ] Ingrese los datos de la persona");
            System.out.println("[ 2 ] Genere el CURP");
            System.out.println("[ 3 ] Genere el RFC");
            System.out.println("[ 4 ] Genere CURP y RFC");
            System.out.println();

            System.out.print("Digite la opcion que desee: ");

            tecla = entrada.next().charAt(0);

                switch(tecla){

                 case '1': persona1.CapturarDatos(); break;
        
                 case '2': System.out.println();
                           persona1.GenerarCurp();
                           System.out.println(); break;

                 case '3': System.out.println();
                           persona1.GenerarRFC(); 
                           System.out.println();break;  
                           
                 case '4': System.out.println();
                           persona1.Generar_Curp_RFC();  
                           System.out.println();        

                }
        
                System.out.println("\nDesea hacer otra operacion? [S / N]");

                tecla = entrada.next().charAt(0);

        }while(tecla == 'S' || tecla == 's');

    }

}
