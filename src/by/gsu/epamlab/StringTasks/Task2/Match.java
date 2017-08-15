package by.gsu.epamlab.StringTasks.Task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by AdanaC on 10.03.2017.
 */
public class Match {
    public static void main(String[] args) {
        Matcher matcher=null;
        Pattern pattern=null;


        pattern=Pattern.compile("index[0-9]");
        matcher=pattern.matcher("index56");

        if(matcher.lookingAt()){
            System.out.println("ewfr");
        }
    }
}
