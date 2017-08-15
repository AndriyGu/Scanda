package by.gsu.epamlab.OOPTask;

/**
 * Created by AdanaC on 08.03.2017.
 */
public class CilindreCargo implements Cargo {

    static private int TYPE = 4;
    private int valume;
    private double density;
    static private int MASSCONTEINER = 400;


    public int getValume() {
        return valume;
    }
    public double getDensity() {
        return density;
    }
    public int getMassConteiner() {
        return MASSCONTEINER;
    }

    public  void setValume(int valume) {
        this.valume = valume;
    }

    public void setDensity(double density) {
        this.density = density;
    }

    private double allMass = density*valume/1000+MASSCONTEINER;
    public double getAllMass() {
        return allMass;
    }
    public int getTYPE(){return this.TYPE;}
}
