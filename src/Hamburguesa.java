
public abstract class Hamburguesa extends Platillo {

    /**
     * Metodo que manda a llamar todos los metodos,
     * para la realización de las hamburguesas.
     */
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
    /**
     * Metodo que imprime un paso para la preparación
     * de una hamburguesa(Pan inferior).
     */
    private final void ponerPanInferior() {
        System.out.println("Se colocó el pan inferior.");
    }
    /**
     * Metodo que imprime un paso para la preparación
     * de una hamburguesa(poner mayonesa).
     */
    private final void ponerMayonesa() {
        System.out.println("Se agrego mayonesa.");
    }
    /**
     * Metodo que imprime un paso para la preparación
     * de una hamburguesa(poner mostaza).
     */
    private final void ponerMostaza() {
        System.out.println("Se agrego mostaza.");
    }
    /**
     * Metodo que imprime un paso para la preparación
     * de una hamburguesa(poner carne).
     */
    private final void ponerCarne() {
        System.out.println("Se agrego la carne.");
    }
    /**
     * Metodo que imprime un paso para la preparación
     * de una hamburguesa(poner vegetables).
     */
    private final void ponerVegetales() {
        System.out.println("Se agregaron los vegetales.");
    }
    /**
     * Metodo que imprime un paso para la preparación
     * de una hamburguesa(poner catsup).
     */
    private final void ponerCatsup() {
        System.out.println("Se agrego la catsup el pan superior.");
    }
    /**
     * Metodo que imprime un paso para la preparación
     * de una hamburguesa(Pan superior).
     */
    private final void ponerPanSuperior() {
        System.out.println("Se coloco el pan superior.");
    }
    /**
     * Metodo que imprime un paso para la preparación
     * de una hamburguesa(poner queso).
     */
    private void ponerQueso() {
        System.out.println("Se agrego el queso.");
    }
    /**
     * Metodo que imprime un paso para la preparación
     * de una hamburguesa(prepararCarne) este depende de 
     * cada hamburguesa.
     */
    protected abstract void prepararCarne();
    /**
     * Manda a llamar el metodo que imprime la preparación
     * de la hamburguesa.
     */
    @Override
    public void preparaPlatillo() {
        preparaHamburguesa();
    }
}
