package by.gsu.epamlab.collectionsTask.Task1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by AdanaC on 22.03.2017.
 */
public class PurchaseList {
    List<Purchase> purchases;
    PurchaseList(){purchases = new ArrayList<Purchase>();}



    //чем плох этод код
    /*    ArrayList<Material> materials?
    ArrayList<Material> materials = new ArrayList<Material>()?
    HashMap<Integer, String> users?
    public ArrayList<Material> getMaterials() {?}*/

    PurchaseList(String fileName){
        purchases = new ArrayList<Purchase>();
        Matcher matcher, matcher2, matcher3 = null;
        Pattern pattern, pattern2, pattern3 = null;



        try{
            String sCurrentLine;
            BufferedReader br =  new BufferedReader(new FileReader(fileName));

            Purchase maxPars=null;
            int maxCost=0;int i=0;
            int code =0;
            boolean diferent=false;
            while ((sCurrentLine = br.readLine()) != null) {

                try{
                    String[] tokens = sCurrentLine.split(";");
                    if (tokens.length==3){
                        pattern = Pattern.compile("[^0-9]");
                        matcher = pattern.matcher(tokens[1]);

                        pattern2 = Pattern.compile("[^0-9]");
                        matcher2 = pattern2.matcher(tokens[2]);

                        if(tokens[0].equals("") || matcher.find() || matcher2.find()){throw new Exception("bed format");}
                        else {
                            Purchase tempPurchase = new Purchase(tokens[0],(Integer.parseInt(tokens[1])),(Integer.parseInt(tokens[2])));
                            purchases.add(i,tempPurchase);
                            i++;}

                        System.out.println(tokens[0]+"  "+tokens[1]+"  "+tokens[2]);

                        // ��������� ��������� ����� � ��������� Purchase



                    }

                    if (tokens.length==4){
                        pattern = Pattern.compile("[^0-9]");
                        matcher = pattern.matcher(tokens[1]);

                        pattern2 = Pattern.compile("[^0-9]");
                        matcher2 = pattern2.matcher(tokens[2]);

                        pattern3 = Pattern.compile("[^0-9]");
                        matcher3 = pattern2.matcher(tokens[3]);


                        if(tokens[0].equals("") || matcher.find() || matcher2.find() || matcher3.find()){throw new Exception("bed format");}
                        else if(Integer.parseInt(tokens[3])>=Integer.parseInt(tokens[1])){throw new Exception("bed format");}
                        else {
                            Purchase tempPurchase = new PriceDiscountPurchase(tokens[0],(Integer.parseInt(tokens[1])),(Integer.parseInt(tokens[2])), (Integer.parseInt(tokens[3])));
                            purchases.add(i,tempPurchase);
                            i++;}

                        System.out.println(tokens[0]+"  "+tokens[1]+"  "+tokens[2]+"  "+tokens[3]);
                    }
                    if (tokens.length!=4 && tokens.length!=3){throw new Exception("bed format");}

                    tokens.toString();}
                catch (Exception E){E.fillInStackTrace();}


            }
        i=0;}
        catch (Exception E){
            System.out.println(E.toString());

        }



    }


    public void printPurchasesList(){
        Formatter fmt = new Formatter();
        for (Purchase pur:purchases) {

            try {
                PriceDiscountPurchase priceDiscountPurchase = (PriceDiscountPurchase) pur;
                System.out.println("Down");
                fmt.format("%-10s %,10d %,10d %,10d %,10d\n", pur.getName(), pur.getPrice(), pur.getNumber(),
                        ((PriceDiscountPurchase) pur).getDiscount(), ((PriceDiscountPurchase) pur).getCost());
            }
            catch (Exception E){
                String empty = " ";
                fmt.format("%-10s %,10d %,10d %-10s %,10d\n", pur.getName(), pur.getPrice(), pur.getNumber()
                    ,empty,  pur.getCost());};








        }System.out.println(fmt);
    }

    public void plusParsheses(PurchaseList p){
        List<Purchase> pur = p.purchases;
        List<Purchase> temp = null;
        int i = pur.size() - 1;
        for (Purchase t: pur) {
            this.purchases.add(i,t);

        }

    };


}
