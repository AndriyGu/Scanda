package by.gsu.epamlab.ClasessTasks.Task2;

/**
 * Created by AdanaC on 02.03.2017.
 */
public class Material {

    private String name;
    private static double density;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }

    public Material() {
        this.name =null;
        this.density = 0;
    }


    public Material(String name, double density) {
        this.name = name;
        this.density = density;
    }
    public String toString(Material material){
        return ""+getName()+";"+getDensity();
    }
}
