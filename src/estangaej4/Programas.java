package estangaej4;

public class Programas {
    private String tipodeRopa="", tipodellenado="", opsecar="", confirm="";
    private int opc1=0, opc2=0;
    
    Programas() {
    }
    
    private void tipodeRopa(){
             switch (opc1){
                 case 1:
                    tipodeRopa = "Lana";
                    break;
                 case 2:
                    tipodeRopa = "Ropa Sucia";
                    break;
                 case 3:
                    tipodeRopa = "Econòmico";
                    break;
                 case 4:
                    tipodeRopa = "Ropa de Bebe";
                    break;
             }
    }
    private void tipodeLlenado(){
        tipodeRopa();
            switch (opc2){
                 case 1:
                    tipodellenado = "Mìnimo";
                    break;
                 case 2:
                    tipodellenado = "Medio";
                    break;
                 case 3:
                    tipodellenado = "Màximo";
                    break;
             }
    }
    private void opcSecado(){
        tipodeLlenado();
           if (confirm.equalsIgnoreCase("SI")){
                   opsecar = confirm;
               } if (confirm.equalsIgnoreCase("NO")){
                   opsecar = confirm;
               }
    }
    public void confirycom(int opc1,int opc2, String confirm, String confirm1, String confirm2){
        this.opc1=opc1;
        this.opc2=opc2;
        this.confirm=confirm;
        opcSecado();
        System.out.println("\nTIPO DE ROPA "+tipodeRopa);
        System.out.println("TIPO DE LLENADO "+tipodellenado);
        System.out.println("SECADO AUTOMÀTICO "+opsecar+"\n");
        if (confirm2.equalsIgnoreCase("SI")){
              System.out.println("\n==== LAVANDO ====");
              System.exit(0);
        } if (confirm1.equalsIgnoreCase("SI")){
            opcSecado();
          }
    }
}
