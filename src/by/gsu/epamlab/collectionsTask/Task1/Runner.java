package by.gsu.epamlab.collectionsTask.Task1;

import java.io.BufferedReader;
import java.io.FileReader;

import java.util.Collections;
import java.util.Formatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by AdanaC on 21.03.2017.
 */
public class Runner {
    public static void main(String[] args) {

        //зачем мы создаем коллекцию в классе PurchaseList?


        Formatter fmt = new Formatter();

        fmt.format("%-12s %12s\n\n", "Source", "Profit/Loss");

        fmt.format("%-12s %,12d\n", "Retail", 1232675);
        fmt.format("%-12s %,12d\n", "Wholesale", 23232482);
        fmt.format("%-12s %,12d\n", "Rents", 3052238);
        fmt.format("%-12s %,12d\n", "Royalties", 329845);
        fmt.format("%-12s %,12d\n", "Interest", 8657);
        fmt.format("%-12s %,12d\n", "Investments", 1675832);
        fmt.format("%-12s %,12d\n", "Patents", -2011);

        // Display the formatted table.
        System.out.println(fmt);
        System.out.println("ывапыпвапвап");

        PurchaseList add = new PurchaseList("C:\\Users\\AdanaC\\IdeaProjects\\Task 1\\src\\by\\gsu\\epamlab\\collectionsTask\\Task1\\addon.csv");
        add.printPurchasesList();


        PurchaseList pkl = new PurchaseList("C:\\Users\\AdanaC\\IdeaProjects\\Task 1\\src\\by\\gsu\\epamlab\\collectionsTask\\Task1\\in.csv");

        pkl.printPurchasesList();

        pkl.plusParsheses(new PurchaseList("C:\\Users\\AdanaC\\IdeaProjects\\Task 1\\src\\by\\gsu\\epamlab\\collectionsTask\\Task1\\addon.csv"));

        System.out.println();
        System.out.println();
        pkl.printPurchasesList();
    }
}
