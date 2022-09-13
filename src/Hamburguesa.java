package src;

public abstract class Hamburguesa extends Platillo {

    public final void preparaHamburguesa(){
        ponerPanInferior();
        ponerMayonesa();
        ponerMostaza();
        prepararCarne();
        ponerCarne();
        if(conQueso){
            ponerQueso();   
        }
        ponerVegetales();
        ponerCatsup();
        ponerPanSuperior();
    }

    public final void ponerPanInferior(){
        System.out.println("Se colocó el pan inferior.");
    }
    
    public final void ponerMayonesa(){
        System.out.println("Se agrego mayonesa.");
    }

    public final void ponerMostaza(){
        System.out.println("Se agrego mostaza.");
    }

    public final void ponerCarne(){
        System.out.println("Se agrego la carne.");
    }

    public final void ponerVegetales(){
        System.out.println("Se agregaron los vegetales.");
    }

    public final void ponerCatsup(){
        System.out.println("Se agrego la catsup el pan superior.");
    }

    public final void ponerPanSuperior(){
        System.out.println("Se coloco el pan superior.");
    }

    public void ponerQueso(){
        System.out.println("Se agrego el queso.");
    }

    public abstract void prepararCarne();

    @Override
    public void preparaPlatillo() {
        preparaHamburguesa();
    }
}
