package by.gsu.epamlab.StringTasks.Task3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Created by AdanaC on 18.03.2017.
 */
public class Runner {
    public static void main(String[] args) {
        BufferedReader br;
        String line = "";
        String sCurrentLine;
        try {
            try {
                br = new BufferedReader(new FileReader(ConstantValue.INPUT_CSV));
            } catch (Exception Ex) {
                System.out.println(Ex.toString());
                throw new FileNotFoundException("Кота не существует"); //почему без этой строчки не работает?
            }
            while ((sCurrentLine = br.readLine()) != null) { // заполняем Мар
                try {
                    line = line + " " + sCurrentLine;
                    //System.out.println(line);
                } catch (Exception e) {
                }

            }
        } catch (Exception e) {
            e.fillInStackTrace();
        }

        line=Metods.dateChenger(line);

        line=Metods.belRubChenger(line);
        line=Metods.dollarChenger(line);
        System.out.println(line);
    }
}
