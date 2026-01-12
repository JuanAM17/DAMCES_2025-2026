public class Pelea {
    
    private Luchador l1;
    private Luchador l2;

    public Pelea(Luchador luchador1, Luchador luchador2) {
        this.l1 = luchador1;
        this.l2 = luchador2;
    }

    public Luchador combate(){
        //Primero miramos si existe la posibilidad de un golpe crítico
        if(l1.GolpeCrítico(l2.getPeso(), l2.getResistencia())){
            return l1;
        }else if (l2.GolpeCrítico(l1.getPeso(), l1.getResistencia())){
            return l2;
        //Si ninguno hace golpe crítico, se evalua el algoritmo de pelea.
        }else{
            double poderL1 = (l1.getFuerza() * 1.5) +(l1.getVelocidad() * 0.5) + (l1.getPeso() + l1.getResistencia());
            double poderL2 = (l2.getFuerza() * 1.5) +(l2.getVelocidad() * 0.5) + (l2.getPeso() + l2.getResistencia());
            if (poderL1 >poderL2){
                    return l1;
                } else if (poderL2 > poderL1){
                    return l2;
                }else{
                    return l1;
                }
        }

        
    }
        
    
}
