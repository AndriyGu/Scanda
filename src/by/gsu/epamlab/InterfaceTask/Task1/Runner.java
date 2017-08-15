package by.gsu.epamlab.InterfaceTask.Task1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by AdanaC on 05.03.2017.
 */
public class Runner {
    public static void main(String[] args) {
        List<Purchase> purchaseList = new LinkedList<>();

        try{
        String sCurrentLine;
        BufferedReader br =  new BufferedReader(new FileReader("C:\\Users\\AdanaC\\IdeaProjects\\Task 1\\src\\by\\gsu\\epamlab\\InterfaceTask\\Task1\\in.txt"));
        int maxCost=0;
        Purchase maxPars=null;
        int i=0;
        int code =0;
        boolean diferent=false;
        while ((sCurrentLine = br.readLine()) != null) {


            String[] tokens = sCurrentLine.split(" ");
           // System.out.println(tokens[0]+" "+tokens[1]+" "+tokens[0]+" "+tokens[1]);
            if (tokens.length!=4){throw new Exception("bed format");}



            if (tokens[0].equals("Purchase")){
                purchaseList.add(i,new Purchase(tokens[1],Integer.parseInt(tokens[2]),Integer.parseInt(tokens[3])));
                if (maxCost<purchaseList.get(i).getCost()){
                    maxCost=purchaseList.get(i).getCost();
                    maxPars=purchaseList.get(i);
                }

            }
            else if(tokens[0].equals("FirstSubPurchase")){
                purchaseList.add(i,new FirstSubPurchase(tokens[1], Integer.parseInt(tokens[2]),Integer.parseInt(tokens[3])));
                if (maxCost<purchaseList.get(i).getCost()){
                    maxCost=purchaseList.get(i).getCost();
                    maxPars=purchaseList.get(i);
                }
            }
            else if(tokens[0].equals("SecondSubPurchase")){
                purchaseList.add(i,new SecondSubPurchase(tokens[1], Integer.parseInt(tokens[2]),Integer.parseInt(tokens[3])));
                if (maxCost<purchaseList.get(i).getCost()){
                    maxCost=purchaseList.get(i).getCost();
                    maxPars=purchaseList.get(i);
                }
            }
            else {
                System.out.println("Class with name "+tokens[0]+" not exist.");
            }

            if(code!=purchaseList.get(i).hashCode()){
                diferent=true;
            };

            System.out.println(tokens[0]+" "+tokens[1]+" "+tokens[2]+" "+tokens[3]);

            i++;



        }
            System.out.println("maximum cost = "+maxCost+" from "+maxPars);
        i=0;

        if(diferent){
            System.out.println("Not all purchases are equal");
        };
        }
        catch (Exception E){
            System.out.println(E.toString());

        }


        Purchase[] purchases = new Purchase[purchaseList.size()];
        purchases = purchaseList.toArray(purchases);




        /*for(int i=0; i<=purchases.length; i++){
            try{System.out.println(purchases[i].toString()+(((FirstSubPurchase) purchases[i]).getDiscount()));
                System.out.println("from f");
            }
            catch (Exception e){}

            try{System.out.println(purchases[i].toString()+(((SecondSubPurchase) purchases[i]).getPercentDiscount()));
                System.out.println("from s");}
            catch (Exception e){}

            try{System.out.println(purchases[i].toString());
                System.out.println("from p");}
            catch (Exception e){}

            }*/














    }
}
