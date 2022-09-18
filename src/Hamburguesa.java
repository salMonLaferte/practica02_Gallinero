
public abstract class Hamburguesa extends Platillo {

    public final void preparaHamburguesa() {
        ponerPanInferior();
        ponerMayonesa();
        ponerMostaza();
        prepararCarne();
        ponerCarne();
        if (conQueso) {
            ponerQueso();
        }
        ponerVegetales();
        ponerCatsup();
        ponerPanSuperior();
    }

    private final void ponerPanInferior() {
        System.out.println("Se colocó el pan inferior.");
    }

    private final void ponerMayonesa() {
        System.out.println("Se agrego mayonesa.");
    }

    private final void ponerMostaza() {
        System.out.println("Se agrego mostaza.");
    }

    private final void ponerCarne() {
        System.out.println("Se agrego la carne.");
    }

    private final void ponerVegetales() {
        System.out.println("Se agregaron los vegetales.");
    }

    private final void ponerCatsup() {
        System.out.println("Se agrego la catsup el pan superior.");
    }

    private final void ponerPanSuperior() {
        System.out.println("Se coloco el pan superior.");
    }

    private void ponerQueso() {
        System.out.println("Se agrego el queso.");
    }

    protected abstract void prepararCarne();

    @Override
    public void preparaPlatillo() {
        preparaHamburguesa();
    }
}
