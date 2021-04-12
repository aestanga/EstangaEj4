package estangaej4;

public class Lavarropas {
    //ATRIBUTOS
    private String marca="", modelo="", alarmap="", invert="";
    private final String marcas [] = {"Drean","Samsung","Whirlpool"};
    private final String modelos [] = {"Dish","Gold","Concept","WWGS","WWWU","WWUU","WNAB","WLAB","WNQB"};
    private final String alarmapuer [] = {"si","no","no","si","si","si","no","no","no"};
    private final String inverter [] = {"si","si","no","si","no","si","si","no","si"};
    private final int ciclos [] = {15,10,8,15,10,8,15,10,8};
    private final int cargmax [] = {9,7,7,9,6,7,8,9,8};
    private int kiloslav, cicl;
    
    //METODOS
    public void setmarca(String marca){
           for(int i=0; i<marcas.length ; i++){
            if (marcas[i].equalsIgnoreCase(marca)){
                this.marca = marca;
            }
           }           
    }    
    public String getmarca(){
           return marca;
    }
    public void setmodelo(String modelo){
           for(int i=0; i<modelos.length ; i++){
            if (modelos[i].equalsIgnoreCase(modelo)){
                this.modelo = modelo;
            } 
        }           
    }
    public String getmodelo(){
           return modelo;
    }
    public void caract(){
        System.out.println("\nLAVARROPAS "+marca+" MODELO "+modelo);
         for(int i=0; i<modelos.length ; i++){
            if (modelos[i].equalsIgnoreCase(modelo)){
                alarmap = alarmapuer[i];
                invert = inverter[i];
                cicl = ciclos[i];
                kiloslav = cargmax[i];
            }
        }
        System.out.println("ALARMA EN PUERTA "+alarmap);
        System.out.println("INVERTER "+invert);
        System.out.println("CANTIDAD DE CICLOS "+cicl);
        System.out.println("CARGA MÀXIMA (kg) "+kiloslav+"\n");
    }
    
}
