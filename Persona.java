package curp;
import java.util.*;

public class Persona {

    String nombre, aPaterno, aMaterno, FDnacimiento, entidad, sexo;

    public void CapturarDatos(){

        Scanner entrada = new Scanner(System.in);

        System.out.print("APELLIDO PATERNO: ");
        aPaterno = entrada.nextLine(); 
        System.out.print("APELLIDO MATERNO: ");
        aMaterno = entrada.nextLine();
        System.out.print("NOMBRE(S): ");
        nombre = entrada.nextLine();
        System.out.print("GENERO (HOMBRE / MUJER): ");
        sexo = entrada.nextLine();
        System.out.print("FECHA DE NACIMIENTO (DD/MM/AAAA): ");
        FDnacimiento = entrada.nextLine();
        System.out.print("ENTIDAD: ");
        entidad = entrada.nextLine();
        
    }

    public void Generar_Curp_RFC(){

        GenerarCurp();
        System.out.println();
        GenerarRFC();
    }
    
    public void GenerarCurp(){

        System.out.print("CURP: ");

        System.out.print(Character.toUpperCase(aPaterno.charAt(0))); // Primer digito

        ObtenerPrimeraVocal(); // Segundo digito

        System.out.print(Character.toUpperCase(aMaterno.charAt(0))); // Tercer digito

        System.out.print(Character.toUpperCase(nombre.charAt(0))); // Cuarto digito

        System.out.print(FDnacimiento.substring(8,10)); //Quinto - Sexto digito

        System.out.print(FDnacimiento.substring(3,5)); //Septimo - Octava digito

        System.out.print(FDnacimiento.substring(0,2)); //Noveno - Decimo digito

        System.out.print(Character.toUpperCase(sexo.charAt(0))); // Decimo primer digito

        ObtenerEstado(); // Decimo segundo - Decimo tercer digito

        ObtenerConsonantes(); // Decimo cuarto, quinto y sexto digito

        GenerarNumeros(); // Decimo septimo - octavo digito
    
    }
    public void GenerarRFC(){

        System.out.print("RFC: ");

        System.out.print(Character.toUpperCase(aPaterno.charAt(0))); // Primer digito

        ObtenerPrimeraVocal(); // Segundo digito

        System.out.print(Character.toUpperCase(aMaterno.charAt(0))); // Tercer digito

        System.out.print(Character.toUpperCase(nombre.charAt(0))); // Cuarto digito

        System.out.print(FDnacimiento.substring(8,10)); //Quinto - Sexto digito

        System.out.print(FDnacimiento.substring(3,5)); //Septimo - Octava digito

        System.out.print(FDnacimiento.substring(0,2)); //Noveno - Decimo digito

        GeneraLetras(); // Decimo primer - Segundo digito

        GenerarNumero(); // Decimo tercer digito

    
    }
    public void ObtenerPrimeraVocal(){

        for(int i=1; i<=aPaterno.length(); i++){

            if(aPaterno.charAt(i) == 'a' || aPaterno.charAt(i) == 'A'){

                System.out.print("A"); break;
            } 
            else if(aPaterno.charAt(i) == 'e' || aPaterno.charAt(i) == 'E'){

                System.out.print("E"); break;
            } 
            else if(aPaterno.charAt(i) == 'i' || aPaterno.charAt(i) == 'I'){

                System.out.print("I"); break;
            } 
            else if(aPaterno.charAt(i) == 'o' || aPaterno.charAt(i) == 'O'){

                System.out.print("O"); break;
            } 
            else if(aPaterno.charAt(i) == 'u' || aPaterno.charAt(i) == 'U'){

                System.out.print("U"); break;
            }
            else{

                System.out.print("X"); break;
            }
            
        }

    }
    public void ObtenerEstado(){

        switch(entidad){

            case "Aguascalientes":          case "AGUASCALIENTES":              case "aguascalientes":          System.out.print("AS"); break;
            case "Baja California":         case "BAJA CALIFORNIA":             case "baja california":         System.out.print("BC"); break;
            case "Baja California Sur":     case "BAJA CALIFORNIA SUR":         case "baja california sur":     System.out.print("BS"); break;
            case "Chiapas":                 case "CHIAPAS":                     case "chiapas":                 System.out.print("CS"); break;
            case "Campeche":                case "CAMPECHE":                    case "campeche":                System.out.print("CC"); break;
            case "Chihuahua":               case "CHIHUAHUA":                   case "chihuahua":               System.out.print("CH"); break;
            case "Coahuila":                case "COAHUILA":                    case "coahuila":                System.out.print("CL"); break;
            case "Colima":                  case "COLIMA":                      case "colima":                  System.out.print("CM"); break;
            case "Distrito Federal":        case "DISTRITO FEDERAL":            case "distrito federal":        System.out.print("DF"); break;
            case "Durango":                 case "DURANGO":                     case "durango":                 System.out.print("DG"); break;
            case "Guanajuato":              case "GUANAJUATO":                  case "guanajuato":              System.out.print("GT"); break;
            case "Guerrero":                case "GUERRERO":                    case "guerrero":                System.out.print("GR"); break;
            case "Hidalgo":                 case "HIDALGO":                     case "hidalgo":                 System.out.print("HG"); break;
            case "Jalisco":                 case "JALISCO":                     case "jalisco":                 System.out.print("JC"); break;
            case "Estado de Mexico":        case "ESTADO DE MEXICO":            case "estado de mexico":        System.out.print("MC"); break;
            case "Michoacan":               case "MICHOACAN":                   case "michoacan":               System.out.print("MN"); break;
            case "Morelos":                 case "MORELOS":                     case "morelos":                 System.out.print("MS"); break;
            case "Nayarit":                 case "NAYARIT":                     case "nayarit":                 System.out.print("NT"); break; 
            case "Nuevo Leon":              case "NUEVO LEON":                  case "nuevo leon":              System.out.print("NL"); break;
            case "Oaxaca":                  case "OAXACA":                      case "oaxaca":                  System.out.print("OC"); break;
            case "Puebla":                  case "PUEBLA":                      case "puebla":                  System.out.print("PL"); break;
            case "Queretaro":               case "QUERETARO":                   case "queretaro":               System.out.print("QT"); break;
            case "Quintana Roo":            case "QUINTANA ROO":                case "quintana roo":            System.out.print("QR"); break;
            case "San Luis Potosi":         case "SAN LUIS POTOSI":             case "san luis potosi":         System.out.print("SP"); break;
            case "Sinaloa":                 case "SINALOA":                     case "sinaloa":                 System.out.print("SL"); break;
            case "Sonora":                  case "SONORA":                      case "sonora":                  System.out.print("SR"); break;
            case "Tabasco":                 case "TABASCO":                     case "tabasco":                 System.out.print("TC"); break;
            case "Tamaulipas":              case "TAMAULIPAS":                  case "tamaulipas":              System.out.print("TS"); break;
            case "Tlaxcala":                case "TLAXCALA":                    case "tlaxcala":                System.out.print("TL"); break;
            case "Veracruz":                case "VERACRUZ":                    case "veracruz":                System.out.print("VZ"); break;
            case "Yucatan":                 case "YUCATAN":                     case "yucatan":                 System.out.print("YN"); break;
            case "Zacatecas":               case "ZACATECAS":                   case "zacatecas":               System.out.print("ZS"); break;
            
            default: System.out.print("NE");

        }
    }
    public void ObtenerConsonantes(){

        for(int i=1; i<=aPaterno.length(); i++){

            if(aPaterno.charAt(i)!= 'A' && aPaterno.charAt(i)!= 'a' && aPaterno.charAt(i)!= 'E' && aPaterno.charAt(i)!= 'e' && aPaterno.charAt(i)!= 'I' && aPaterno.charAt(i)!= 'i' && aPaterno.charAt(i)!= 'O' && aPaterno.charAt(i)!= 'o' && aPaterno.charAt(i)!= 'U' && aPaterno.charAt(i)!= 'u'){
              
                System.out.print(Character.toUpperCase(aPaterno.charAt(i))); break; //Consonante del apellido paterno

            }

        }
        for(int i=1; i<=aMaterno.length(); i++){

            if(aMaterno.charAt(i)!= 'A' && aMaterno.charAt(i)!= 'a' && aMaterno.charAt(i)!= 'E' && aMaterno.charAt(i)!= 'e' && aMaterno.charAt(i)!= 'I' && aMaterno.charAt(i)!= 'i' && aMaterno.charAt(i)!= 'O' && aMaterno.charAt(i)!= 'o' && aMaterno.charAt(i)!= 'U' && aMaterno.charAt(i)!= 'u'){
              
                System.out.print(Character.toUpperCase(aMaterno.charAt(i))); break; //Consonante del apellido materno

            }

        }

        for(int i=1; i<=nombre.length(); i++){

            if(nombre.charAt(i)!= 'A' && nombre.charAt(i)!= 'a' && nombre.charAt(i)!= 'E' && nombre.charAt(i)!= 'e' && nombre.charAt(i)!= 'I' && nombre.charAt(i)!= 'i' && nombre.charAt(i)!= 'O' && nombre.charAt(i)!= 'o' && nombre.charAt(i)!= 'U' && nombre.charAt(i)!= 'u'){
              
                System.out.print(Character.toUpperCase(nombre.charAt(i))); break; //Consonante del nombre

            } 

        }
    }
    public void GenerarNumeros(){

        Random numero = new Random();
        int num1 = numero.nextInt(10);
        int num2 = numero.nextInt(10); 

        System.out.print(num1); 
        System.out.print(num2); 

    }
    public void GeneraLetras(){
    
    Random r = new Random(); 
    int letra1 = r.nextInt(26) + (byte)'A'; 
    int letra2 = r.nextInt(26) + (byte)'A'; 
    
    System.out.print((char)letra1); 
    System.out.print((char)letra2); 

    }

    public void GenerarNumero(){
 
        Random numero = new Random();
        int num1 = numero.nextInt(10);

        System.out.print(num1);

    }

}
