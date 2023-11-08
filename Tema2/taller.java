
//hoja 6
//comprobad los métodos y resultados por si hubiera algún error

public class Taller {
    private int aceite; //cantidad de bidones de aceite: son de 5 litros
    private int ruedas;
    private int contadorCambiosTotales;
    private int contadorCambiosParciales;
    
    
    //Constructor(int, int): recibirá el número de bidones de aceite y el número de ruedas que hay en el almacén. 
    //Los bidones de aceite son de 5 litros cada uno. Los contadores se inicializan a 0
 
    public Taller(int aceite, int ruedas) {
        this.aceite = 5*aceite;
        this.ruedas = ruedas;
        this.contadorCambiosParciales=0;
        this.contadorCambiosTotales=0;
    }
    
    //addAceite(int): incrementa los litros nuevos de aceite en función de los bidones que se pasan como parámetro.
    
    public void addAceite(int aumento){
        this.aceite+=5*aumento;
    }
    
    //addRuedas(int): incrementa el número de ruedas indicado para el almacén.
    
    public void addRuedas(int cuantas){
        this.ruedas+=cuantas;
    }
    
    //getCambioCompletos(): devuelve el número de coches al que se puede hacer un cambio completo con las existencias que tenemos en el almacén. 
    //Se utilizan 3 litros de aceite por coche y se cambian las cuatro ruedas del coche.
    
    public int getCambioCompletos(){
        int numcambioscompletos;
        int cambiosaceite;
        int cambiosruedas;
       cambiosaceite = this.aceite/3;
       cambiosruedas =this.ruedas/4;
       
       return numcambioscompletos = (cambiosaceite<=cambiosruedas) ? cambiosaceite : cambiosruedas;
    }
    
//    getCambioParcial(): devuelve el número de coches al que se puede hacer un cambio parcial con las existencias que tenemos en el almacén. 
    //Se utilizan 3 litros de aceite por coche y se cambian solo dos ruedas del coche.
    
    public int getCambioParcial(){
        int numcambioparcial;
        int cambiosaceite;
        int cambiosruedas;
       cambiosaceite = this.aceite/3;
       cambiosruedas =this.ruedas/2;
       
       return numcambioparcial = (cambiosaceite<=cambiosruedas) ? cambiosaceite : cambiosruedas;
    }
    
//    cambioCompleto(): disminuye el número de litros de aceite y de ruedas del almacén porque se ha hecho el cambio completo 
//    a un coche en el taller e incrementa el contador correspondiente.
    
    
    public void cambioCompleto(){
        
        this.aceite-=3;
        this.ruedas-=4;
        this.contadorCambiosTotales++;
        
    }
    
//    cambioParcial(): disminuye el número de litros de aceite y de ruedas del almacén porque se ha hecho el cambio parcial 
//    a un coche en el taller, e incrementa el contador correspondiente.
    
    
     public void cambioParcial(){
        
        this.aceite-=3;
        this.ruedas-=2;
        this.contadorCambiosParciales++;
        
    }
    
//    .- getRuedas(): devuelve el número de ruedas que hay en el taller.
  public int getRuedas() {
        return ruedas;
    }

  
  



//8.-getAceite(): devuelve el número de litros de aceite que hay en el taller. 

 public int getAceite() {
        return aceite;
    }




//9.-toString(): devuelve un string con la siguiente información y con el siguiente formato:

   public String toString(){
      
       return "Taller\n EXISTENCIAS: \n"+
               "Ruedas: " +  ruedas + " unidades\n"+
               "aceite: " + aceite + " litros\n"+
               "INGRESOS: Total " + (contadorCambiosParciales*(3*5+2*60) + contadorCambiosTotales *(3*4.5 + 4 * 50));
       
   }
  
   //constructor copia
   
   public Taller(Taller copiaTaller){
       
       this.aceite=copiaTaller.aceite;
       this.contadorCambiosParciales= copiaTaller.contadorCambiosParciales;
       this.contadorCambiosTotales=copiaTaller.contadorCambiosTotales;
       this.ruedas=copiaTaller.ruedas;
   }
     
     
     
     
     
     
    
}//final de la clase   



//main de taller

 public static void main(String[] args) {
        // TODO code application logic here
        
        Taller t1 = new Taller(46      , 50);
       
        
        
        //t1.cambioParcial();
        
        System.out.println(t1.toString());
        // ejemplo de constructor copia
        
        Taller t2 =new Taller(t1);
        
        System.out.println(t1.toString());
        System.out.println(t2.toString());
        
        
        
    }