package by.gsu.epamlab.ClasessTasks.Task2;

/**
 * Created by AdanaC on 03.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        Material material=new Material("sreel",7850.0);
        Subject subject=new Subject("wire", material,0.03);
        System.out.println(subject.toString(subject));
        System.out.println("The wire mass is "+new Subject("wire",new Material("copper",8500.0),0.03).getMass()+" kg.");

    }
}
