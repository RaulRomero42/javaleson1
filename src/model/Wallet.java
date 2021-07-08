
package model;


public class Wallet{

    public static final int CAPACIDAD_MAXIMA = 1000000;  //asi SE DEFINE UNA CONSTANTE obligatorio en mayuscula y el static final
    
    private int saldo;           // Atributo
    private boolean tieneLimite;   /// Atributo
    private int meta;
    
    public Wallet() {
        super();
        saldo = 0;
        tieneLimite = true;
        meta = 0;
    }
    

    public int getSaldo(){    /// funcion pero aca se llama metodo  get recibe valor
        return saldo;
    }

    public boolean getTieneLimite(){
        return tieneLimite;
    }

    public boolean establecerLimite(int value){

        if (value ==0){
            meta = value;
            return true;   
        }
        if(value < 0 ||value <= saldo || (value > CAPACIDAD_MAXIMA && tieneLimite)){
            return false;
        }
            meta = value;
            return true;
    }

    public boolean verificarMeta(){
        if(meta == 0 || meta > saldo){
            return false;
        }
            return true;
    }

    public void setTieneLimite(boolean newTieneLimte){   // cambian el valor de atributo set cambia
        this.tieneLimite = newTieneLimte;
    }

    public String saveMoney(int value) {
        if (saldo + value > CAPACIDAD_MAXIMA && tieneLimite) {
            return "No se puede superar el limite " + CAPACIDAD_MAXIMA;
        }
            saldo += value;  // saldo = saldo + value
            return "Transaccion exitosa, nuevo saldo " + saldo;
    }

    public String takeMoney(int value){
        if (saldo < value){
            return "Saldo insuficiente";           
            
        }
            saldo -= value;
            return "Transaccion exitosa, su valor fue " + value + " y su nuevo saldo es " + saldo; 
            
    } 

    public String breakLimite(){
        if (saldo >= 10000){
            saldo -= 10000;
            setTieneLimite(false);
            return "Has roto los limites ";
        }
            return "No tiene saldo suficiente";
    }

    public String comparaCuneta    
}
