//Crear la clase Lavarropas con los atributos marca, modelo y kilos de lavado, elegir el tipo de dato adecuado para ellos.
//Además se debe crear el método TipodeRopa e imprimir el tipo seleccionado:
//Tipos de Ropa:
//1_Lana
//2_Ropa Sucia
//3_Economico
//4_Ropa de Bebe
//agregar métodos nuevos a la clase: 
//-Tipos de llenado
//-Tipos de lavado
//-Opciòn secado
//Teniendo en cuenta el tipo de ropa seleccionada por el usuario, utilizar diferentes lavados.
package estangaej4;
import java.util.Scanner;

public class EstangaEj4 {
     public static void main(String[] args) {
        Scanner ingresar = new Scanner (System.in);
        String marca, modelo, confirm="",confirm1="", confirm2="", confirm3="", si="si", no="no";
        int opc1=0, opc2=0;
        
        // Creo objetos
        Lavarropas tipo = new Lavarropas();
        Programas lavar = new Programas();
        
        // Solicito ingresar datos
        System.out.println("INGRESAR LA MARCA DEL LAVARROPAS (DREAN | SAMSGUNG | WHIRLPOOL) :");
        marca = ingresar.next();
        tipo.setmarca(marca);
        if(!tipo.getmarca().equals(marca)){
            System.out.println(marca+" MARCA INVÁLIDA");
            System.exit(0);
        }

        System.out.println("INGRESAR EL MODELO "+marca+" DEL LAVARROPAS :");
        modelo = ingresar.next();
        tipo.setmodelo(modelo);
        if(!tipo.getmodelo().equals(modelo)){
            System.out.println(modelo+" MODELO INVÁLIDO");
            System.exit(0);
        }
        
        tipo.caract();
        
        while (!confirm1.equalsIgnoreCase(si) && !confirm1.equalsIgnoreCase(no)){
            System.out.println("\n¿DESEA INICIAR UN LAVADO? Responda con SI o NO :");
            confirm1=ingresar.next();
            if (confirm1.equalsIgnoreCase(si)){
                do {
                    System.out.println("\n==== ELEGIMOS LOS PROGRAMAS ====");
                    
                    while (opc1>4 || opc1<1){
                        System.out.println("\nOpciòn | Tipo de Ropa");
                        System.out.println("   1   | Lana");
                        System.out.println("   2   | Ropa Sucia");
                        System.out.println("   3   | Econòmico");
                        System.out.println("   4   | Ropa de Bebe");
                        System.out.println("\nINGRESE LA OPCIÒN DEL TIPO DE ROPA: ");
                        opc1 = ingresar.nextInt();
                        if (opc1>4 || opc1<1){
                            System.out.println("\n====OPCIÒN INVALIDA====");
                        }
                    }
                    
                    while (opc2>3 || opc2<1){
                        System.out.println("\nOpciòn | Tipo de Llenado");
                        System.out.println("   1   | Mìnimo");
                        System.out.println("   2   | Medio");
                        System.out.println("   3   | Màximo");
                        System.out.println("\nINGRESAR LA OPCIÒN DEL TIPO DE LLENADO: ");
                        opc2 = ingresar.nextInt();
                        if (opc2>3 || opc2<1){
                            System.out.println("\n====OPCIÒN INVALIDA====");
                        }
                    }
                    
                    System.out.println("\n¿ACTIVAR SECADO AUTOMÀTICO? Responda con SI o NO :");
                    confirm = ingresar.next();
                    if (!confirm.equalsIgnoreCase(si) && !confirm.equalsIgnoreCase(no)){
                        System.out.println("\n====RESPUESTA INVALIDA====");
                        System.exit(0);
                    }
                    
                    System.out.println("\n¿COMENZAR A LAVAR? Responda con SI o NO :");
                    confirm2 = ingresar.next();
                    if (confirm2.equalsIgnoreCase(no)) {
                        System.out.println("\n¿DESEA PROGRAMAR UN NUEVO LAVADO? Responda con SI o NO :");
                        confirm3=ingresar.next();
                        opc1=0;
                        opc2=0;
                        if (confirm3.equalsIgnoreCase(no)) {
                            System.exit(0);
                        }
                    }
                    if (confirm2.equalsIgnoreCase(si)) {
                        lavar.confirycom(opc1,opc2,confirm,confirm1,confirm2);
                    }
                } while (confirm3.equalsIgnoreCase(si));
            }
            if (confirm1.equalsIgnoreCase(no)){
                System.exit(0);
            } 
            if (!confirm1.equalsIgnoreCase(si) && !confirm1.equalsIgnoreCase(no)) { 
                System.out.println("\n====RESPUESTA INVALIDA====");
            }
        }     
        
    }
    
}
