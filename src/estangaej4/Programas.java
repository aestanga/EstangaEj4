package estangaej4;

public class Programas {
    private String tipodeRopa="", tipodellenado="", opsecar="", confirm="";
    private int opc1=0, opc2=0;
    
    public Programas(int opc1,int opc2, String confirm) {
        this.opc1=opc1;
        this.opc2=opc2;
        this.confirm=confirm;
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
    
    public void complet(){
        opcSecado();
    }
    
    public String getTipodeRopa() {
        return tipodeRopa;
    }

    public void setTipodeRopa(String tipodeRopa) {
        this.tipodeRopa = tipodeRopa;
    }

    public String getTipodellenado() {
        return tipodellenado;
    }

    public void setTipodellenado(String tipodellenado) {
        this.tipodellenado = tipodellenado;
    }

    public String getOpsecar() {
        return opsecar;
    }

    public void setOpsecar(String opsecar) {
        this.opsecar = opsecar;
    }

    public String getConfirm() {
        return confirm;
    }

    public void setConfirm(String confirm) {
        this.confirm = confirm;
    }

    public int getOpc1() {
        return opc1;
    }

    public void setOpc1(int opc1) {
        this.opc1 = opc1;
    }

    public int getOpc2() {
        return opc2;
    }

    public void setOpc2(int opc2) {
        this.opc2 = opc2;
    }
    
    public void display (){
        System.out.println("\nTIPO DE ROPA "+tipodeRopa);
        System.out.println("TIPO DE LLENADO "+tipodellenado);
        System.out.println("SECADO AUTOMÀTICO "+opsecar+"\n");
    }
    
}
