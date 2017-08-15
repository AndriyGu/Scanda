package by.gsu.epamlab.OOPTask;

/**
 * Created by AdanaC on 08.03.2017.
 */
public class StandartCargo implements Cargo {
    static int TYPE = 2;
    static private int VOLUME = 3000;
    private double density;
    static private int MASSCOMT = 300;
    private double allMass = density*VOLUME/1000+ MASSCOMT;

    public int getVOLUME() {
        return VOLUME;
    }
    public double getDensity() {
        return density;
    }
    public int getMassConteiner() {
        return MASSCOMT;
    }

    public double getAllMass() {
        return allMass;
    }

    public void setDensity(double density) {
        this.density = density;
    }
}
