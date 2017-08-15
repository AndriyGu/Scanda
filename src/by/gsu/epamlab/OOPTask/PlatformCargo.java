package by.gsu.epamlab.OOPTask;

/**
 * Created by AdanaC on 08.03.2017.
 */
public class PlatformCargo implements Cargo {

    static private int TYPE = 3;
    static private int massCargo = 340000;

    public static int getMassCargo() {
        return massCargo;
    }

    public static int getTYPE() {
        return TYPE;
    }
}

