
// Creando un objeto
public class Luchador {
    //Atributos (!IMPORTANTE LOS PRIVATE¡)
    private int peso;
    private int fuerza;
    private int resistencia;
    private int velocidad;
    private String nombre;

    //Método constructor (Se pueden poner cualquier variable para 
    //denominar los atributos de entrada [int p o int peso])
    //Puede o no tener void (public Luchador o public void Luchador)
    //This - es para referirse al atributo del objeto creado
    public Luchador(int p, int f, int r, int v, String n){
        this.peso = p;
        this.fuerza = f;
        this.resistencia = r;
        this.velocidad = v;
        this.nombre = n;
    }

    //Método gets, devuelven un valor al ser usados, DEBEN DE SER PÚBLICOS
    public int getPeso(){
        return this.peso;
    }

    public int getFuerza(){
        return this.fuerza;
    }

    public int getResistencia(){
        return this.resistencia;
    }

    public int getVelocidad(){
        return this.velocidad;
    }

    public String getNombre(){
        return nombre;
    }
    
    //Métodos sets, pueden devolver lo que nosotros queramos, 
    //(void si no queremos que devuelva nada), 
    //se sobreescribe los datos del elemento en particular.
    public void setPeso(int p){
        this.peso = p;
    }

    public void setFuerza(int f){
        this.fuerza = f;
    }

    public void setResistencia(int r){
        this.resistencia = r;
    }

    public void setVelocidad(int v){
        this.velocidad = v;
    }

    public void setNombre(String n){
        this.nombre = n;
    }

    //Método toString
    //MUY NECESARIO EL @Override, que se usa para indicar
    //que se use nuestro nuevo método en vez del método ya prehecho en Java
    // \n es un salto de línea para que salaga en lo de el return
    @Override
    public String toString(){
        return this.nombre + ":" + "\n"+
        "peso: " + this.peso +"\n"+  
        "fuerza: " + this.fuerza +"\n"+ 
        "resistencia: " + this.resistencia +"\n"+ 
        "velocidad: " + this.velocidad;
    }

    // 12/01/2025
    // Método Golpe Crítico
    public boolean GolpeCrítico(int pesocon, int resistenciacon){
        if (this.peso > pesocon){
            return true;
        } else if (this.resistencia > resistenciacon){
            return true;
        }
        return false;
    } 

    
}
