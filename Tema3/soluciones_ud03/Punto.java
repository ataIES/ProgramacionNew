/*Ejercicio de la clase Punto
*/
public class Punto1 {
    
    private double x;
    private double y;

    public Punto1() {//constructor sin parámetros
    }

    public Punto1(double x, double y) { //constructor con parámetros
        this.x = x;
        this.y = y;
    }
    //getters y setters
    
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    //cuadrante al que pertence un punto
    
    public int Cuadrante(){
        int cuadrante;
        if(this.x>0 && this.y>0){
            cuadrante = 1;
        } else{
            if(this.x>0 && this.y<0){
                cuadrante=4;
            }else if(this.x<0 && this.y>0){
                cuadrante=2;
            }
            else{
                cuadrante=3;
            }
        }
        
        return cuadrante;
    }
    
   //distancia entre dos puntos
    
    public double Distancia(double x, double y){
        double distancia;
        distancia = Math.sqrt((this.x-x)*(this.x-x)+(this.y-y)*(this.y-y));
        
        return distancia;
    }
    
    
    //punto medio entre dos puntos
    
    
    public Punto1 puntoMedio(Punto1 puntoB){
        Punto1 puntoMedio = new Punto1();
        
        puntoMedio.x=(this.x+puntoB.x)/2;
        puntoMedio.y=(this.y+puntoB.y)/2;
        
        return puntoMedio;
    }
    
    //metodo toString para escribir el punto en el main
    
   
    @Override
    public String toString(){
        return "(" + x + " , " + y+")";
    }
}//fin de la clase

//método main para problar la clase
//
public static void main(String[] args) {
        
        Punto1 p1 = new Punto1(2.0,3.0);
        Punto1 p2 = new Punto1();
        Punto1 p3 = new Punto1(-1, -2.3);
        Punto1 p4 = new Punto1();
    
    System.out.println(p1.Cuadrante());
    System.out.println((float) p1.Distancia(0.0,0.0));
     System.out.println((float) p1.Distancia(p3.getX(), p3.getY()));
    p4=p1.puntoMedio(p3);
   
    System.out.println("Las coordeandas del Punto medio son " + p4);
    }//fin del main