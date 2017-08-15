package by.gsu.epamlab.StringTasks.Task1;

import by.gsu.epamlab.StringTasks.Task1.ConstantValue;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedList;

/**
 * Created by AdanaC on 08.03.2017.
 */
public class Runner {
    public static void main(String[] args) {
        LinkedList<Double> linkedList = new LinkedList<>();
        double sum=0;
        int errorLine =0;
        try {
        int i=0;

        String sCurrentLine;
            BufferedReader br;
        try {
            br= new BufferedReader (new FileReader(ConstantValue.INPUT_CSV));




        }
        catch (Exception Ex){
            System.out.println(Ex.toString());
            throw new FileNotFoundException("Кота не существует"); //почему без этой строчки не работает?

        }
        while ((sCurrentLine = br.readLine()) != null) {
            try {
                String[] tokens = sCurrentLine.split(";");

                double value = (Double.parseDouble(tokens[(Integer.parseInt(tokens[0]))]));
                linkedList.add(i,value);
                sum=sum+value;

            }
            catch (Exception e){
                errorLine++;

            }
            i=0;

            if (linkedList.isEmpty()){System.out.println("result() = 0.0\n" +
                    "errorlines " +
                    "= "+errorLine);

            }
}

    }
    catch (Exception E){}
        if (linkedList.size()>0){
            Double[] arr = new Double[linkedList.size()];
            arr=linkedList.toArray(arr);

            StringBuilder sb = new StringBuilder();


            sb.append("result("+arr[0]);
            if (arr.length>1){
                for (int j=1; j<linkedList.size();  j++){
                    if (arr[j]>=0){
                        sb.append(ConstantValue.PLUS);
                            sb.append(arr[j]);}
                    else {sb.append(ConstantValue.MINUS);
                            sb.append(arr[j]*-1);}


                }

            }
            sb.append(") = ");
            sb.append(sum);
            sum =0;
            System.out.println(sb.toString());
            System.out.println("error lines = "+ errorLine);
            errorLine=0;
    }




    }



}
