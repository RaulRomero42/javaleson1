public class App {
 
    private String nombre;
    private int edad;
    private char genero;
    private double estatura;
    private float peso;
    private boolean estadoCivil;

    
    public static void main2(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
        //tipos de datos y operadores
        String res = "Hola";
        int resultado = 15 + 26;
        int resultado1 = 125-45;
        double resultado2 = 25/3;
        float resultado3 = 6*5;
        int resultado4= 24 % 4;
        
        // operadores unarios
        resultado++;
        resultado--;
        resultado = -resultado;
        resultado = +resultado; // valor absoluto
        
        //operadores logicos
        boolean respuesta = true;
        respuesta = 5 > 8;
        respuesta = 5 < 8;
        respuesta = 5 >= 8;
        respuesta = 5 <= 8;
        respuesta = 5 != 8;
        respuesta = 5 == 8;
        respuesta = 15 > 8 && 12 > 6;
        respuesta = 5 < 8 || 12 < 45;
        
        // operadores bit a bit
        // &
        // |
        // 
        // estrucuturas de control
        if (respuesta) {
            //bloque de codigo
        } else {
            // mas codigo
            
        }

             

    }
}


