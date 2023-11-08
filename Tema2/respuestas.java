

//clase Persona

/**
 *
 * @author pedro
 */
public class Persona {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String dni;

    public Persona(String nombre, String apellido1, String apellido2, String dni) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.dni = dni;
    }
    
    
    public String Clave(){
        String c1="", c2="", c3="";
        c1+=this.nombre.charAt(0);
        c2+=this.apellido1.substring(0, 3);
        c3+=this.apellido2.charAt(this.apellido2.length()-1);
        
        
        
        return c1+c2+c3;
    }
    
    public boolean dniValido(){
        boolean esValido=false;
        String letrasDNI ="TRWAGMYFPDXBNJZSQVHLCKE";
        
        String numerosDNI=this.dni.substring(0,this.dni.length()-1);
        
        int resto = Integer.parseInt(numerosDNI)%23;
        //int resto = letrasDNI%23;
        char letra=letrasDNI.charAt(resto);
        
        char ultimaLetra=dni.charAt(dni.length()-1);
        
         esValido = (letra == ultimaLetra) ? true:false;
        
         if(dni.length()!=9){
             esValido=false;
         }
         return esValido;
    }
    
    
    
    
}

//main de Persona

 public static void main(String[] args) {
        
        //dni válido 72205130B
       Persona p1 = new Persona("josé", "ortega", "gasset", "72205130B");
        
        System.out.println("la clave es " + p1.Clave());
        System.out.println("el dni es válido : " + p1.dniValido());
    }



//clase Restautrante

public class Restaurante {
    
    private int docenas; //de huevos
    private double kilos; //de chorizo
    
    
   // constructor( int, double): recibirá el número de docenas de huevos y de kilos de chorizo disponible en el frigorífico. 

    public Restaurante(int docenas, double kilos) {
        this.docenas = docenas;
        this.kilos = kilos;
        //podría ponerse el número de huevos a partir de las docenas para cálculos posteriores
    }
    
    //addHuevos( int): incrementa el número de docenas de huevos.
    
    public void addHuevos(int docenas){
        this.docenas+=docenas;
    }
    
    //addChorizos( double): incrementa el número de kilos de chorizo.

    public void addChorizos(double cuantosKilos){
        
        this.kilos += cuantosKilos;
    }
    
    //getNumPlatos(): devuelve el número de platos de huevos con chorizo que se pueden ofrecer con las existencias actuales, 
     //teniendo en cuenta que cada plato necesita una media de 2 huevos y 200 gramos de chorizo.

    public int getNumPlatos(){
        int platosHuevos;
        int platosChorizo;
        int cuantosPlatos;
        
        platosHuevos=12*docenas/2;
        platosChorizo=(int) ((int)kilos*1000/200);
        
        cuantosPlatos = (platosHuevos<=platosChorizo) ? platosHuevos : platosChorizo; 
        return cuantosPlatos;
        
    }
    
        //sirvePlato(): disminuye el número de huevos y de kilos de chorizo porque se ha servido un plato (2 huevos menos y 200 gramos de chorizo menos)
    
    public void sirvePlato(){
       int huevos;
       huevos=(this.docenas*12)-2;//hay que pasar estos huevos a docenas
       this.kilos-=0.2;
    }
    
    //getHuevos(): devuelve el número de huevos (no de docenas) que quedan en la cámara.

    public int getHuevos(){
        
        return this.docenas*12;
    }
    
    
    //getChorizo(): devuelve el número de kilos de chorizo que quedan en la cámara.

public double getChorizo(){
    return this.kilos;
}

    @Override
    public String toString() {
        return "Restaurante{" + "docenas=" + docenas + ", kilos=" + kilos + '}';
    }


    
}


//main de restaurante

Restaurante r1 = new Restaurante(10, 10);
     
     System.out.println(r1);
         System.out.println(r1.getNumPlatos());
        r1.addHuevos(1);
        
        r1.addChorizos(0.1);
        System.out.printf("quedan %d huevos y %.2f kilos de chorizo\n", r1.getHuevos(), r1.getChorizo());
        System.out.println(r1.getNumPlatos());
        
        r1.sirvePlato();
        r1.sirvePlato();
        r1.sirvePlato();
        r1.sirvePlato();
        
         System.out.println(r1.getNumPlatos());
        
        System.out.printf("quedan %d huevos y %.2f kilos de chorizo", r1.getHuevos(), r1.getChorizo());
    



    