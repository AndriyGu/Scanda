package by.gsu.epamlab.ClasessTasks.Task2;

/**
 * Created by AdanaC on 02.03.2017.
 */
public class Subject {
    private String name;
    private Material material;
    private double volume;

    public Subject() {
        this.name=null;
        this.material = null;
        this.volume = 0;
    }

    public Subject(String name, Material material, double volume) {
        this.name = name;
        this.material = material;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getMass(){
        double mass=this.getMaterial().getDensity()*this.getVolume();
        return mass;
    }

    public String toString(Subject subject){
        return ""+subject.getName()+";"+subject.getMaterial().toString(subject.getMaterial())+";"+subject.getVolume()
                +";"+subject.getMass();
    }


}
