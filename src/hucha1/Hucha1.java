
package hucha1;


public class Hucha1 {

   private float cantidad=10;
  
    
    public static void main(String[] args) {
        Hucha1 asc;
        asc = new Hucha1();
        asc.setmeter(10, 1.50F);
        asc.getcantidad();
        
        asc.setmeter(3, 1.50F);
        asc.getcantidad();
        
        asc.setsacar(2,2.0f);
        asc.getcantidad();
        
        asc.setmeter(5, 1.50F);
        asc.getcantidad();
        
        asc.setmeter(1, 1.50F);
        asc.getcantidad();
                System.out.printf("En la hucha hay %f euros",asc.getcantidad());

    }
    public void setmeter(int nummonedas, float tipomoneda){
         cantidad += (nummonedas*tipomoneda); 
    }
    
    public void setsacar(int nummonedas,float tipomoneda){
        
        cantidad -= (nummonedas*tipomoneda);
    }
    
    public float getcantidad(){
       return cantidad;
    }
    
}
