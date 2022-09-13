package src;

public abstract class Platillo {
    protected int id;
    protected String nombre;
    protected String descripcion;
    protected int precio;
    protected boolean conQueso;
    protected boolean esVegetariana;
    
    public abstract void preparaPlatillo();

    public final String toString(){
        String informacion = "id: " + id + "\n";
        informacion += "Nombre: " + nombre + "\n";
        informacion += "Descripcion : " + descripcion + "\n";
        if(conQueso)
            informacion += "Tiene queso \n";
        else
            informacion += "No tiene queso \n";
        if(esVegetariana)
            informacion += "Es vegetariana \n";
        else
            informacion += "No es vegetariana \n";
            
        return informacion;
    } 

    public int getId(){
        return id;
    }
}
