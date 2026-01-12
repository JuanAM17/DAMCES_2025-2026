import java.util.Scanner;
import java.util.LinkedList;
import java.util.List;


public class App {
    public static void main(String[] args) throws Exception {

        // En el caso de que queramos crear una ista donde guardar las variables del objeto creado
        LinkedList<Luchador> luchadores = new LinkedList<Luchador>();
        
        // En el caso de que sean muchas instancias, bucles for
        Luchador l1 = recopilaLuchadores(1);
        Luchador l2 = recopilaLuchadores(2);

        // Creamos una estancia del objeto creado
        // Luchador luchador1 = new Luchador(70, 200, 400, 300, "Topuria");
        // Creamos una estancia vacia del objeto,
        // si no esta preparado el código, dará error ej: Luchador luchador2 = new Luchador();
        // Luchador luchador2 = new Luchador(72, 180, 450, 350, "Colombo");
        //Pedimos que nos imprima una de las estancias creadas
        //System.out.println(luchador1);
        //System.out.println(luchadores.get(0));
        //Llamamos a otros métodos a realizarse y sus resultados
        Pelea delsiglo = new Pelea(l1, l2);
        Luchador ganador = delsiglo.combate();
        System.out.println("*** GANADOR ***");
        System.out.println(ganador);
    }

    public static Luchador recopilaLuchadores(int i){
        //Recopilación de datos de luchadores
        Scanner sc= new Scanner(System.in);

            System.out.println("Luchador " + i);
            System.out.println("Dame nombre del luchador ");
            String n = sc.nextLine();
            System.out.println("Dame valor de fuerza: ");
            int f = sc.nextInt();
            sc.nextLine();
            System.out.println("Dame valor de resistencia: ");
            int r = sc.nextInt();
            sc.nextLine();
            System.out.println("Dame valor de velocidad: ");
            int v = sc.nextInt();
            sc.nextLine();
            System.out.println("Dame valor de peso: ");
            int p = sc.nextInt();
            sc.nextLine();
            Luchador luchador = new Luchador(p, f, r, v, n);
            return luchador;
        
    }
}
