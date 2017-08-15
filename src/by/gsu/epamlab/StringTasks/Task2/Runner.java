package by.gsu.epamlab.StringTasks.Task2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by AdanaC on 09.03.2017.
 */
public class Runner {
    public static void main(String[] args) {
        Map<String, String> valuesMaps = new HashMap();
        Map<String, String> validValuesMaps = new HashMap();

        Matcher matcher=null;
        Pattern pattern=null;
        Matcher matcher2, matcher3, matcher4, matcher5, matcher6, matcher7=null;
        Pattern pattern2, pattern3, pattern4, pattern5, pattern6, pattern7=null;
        double summ=0;
        String sCurrentLine;
        BufferedReader br;
        int errorLine=0;
        try{
        try {
            br= new BufferedReader (new FileReader(ConstantValue.INPUT_CSV));
            }
        catch (Exception Ex){
            System.out.println(Ex.toString());
            throw new FileNotFoundException("Кота не существует"); //почему без этой строчки не работает?

        }
        while ((sCurrentLine = br.readLine()) != null) { // заполняем Мар
            try {
                String[] tokens = sCurrentLine.split(" *= *");
                valuesMaps.put(tokens[0],tokens[1]);
                //Integer.parseInt(tokens[1])

                System.out.println(tokens[0]+"="+tokens[1]);
            }
            catch (Exception e){}
        }
            System.out.println();
            System.out.println();
            System.out.println();

            for (Map.Entry<String, String> item: valuesMaps.entrySet()) { //эта строчка тоже покрыта тайной
                // http://forum.sources.ru/index.php?showtopic=155565
                //Что-то меня слегка утомила собственная немотивированная доброта. Как вы думаете, для чего существует JavaDoc?
                //Интерфейс Iterable реализуют все коллекции. HashMap не является коллекцией, но его метод entrySet() возвращает
                // коллекцию пар ключ-значение. Что еще не понятно?

                pattern=Pattern.compile("index");
                matcher=pattern.matcher(item.getKey());

                if(matcher.lookingAt()){  // выбираем строчки с index

                    System.out.println(item.getKey()+"="+item.getValue());
                    System.out.println();

// удаляем все буквы и пробелы после букв в ключе "index000"
                    pattern2=Pattern.compile("index *");
                    matcher2=pattern2.matcher(item.getKey());
                    String indexNumber=matcher2.replaceAll("");


//  пробелы после цифр
                    pattern2=Pattern.compile(" *");
                    matcher2=pattern2.matcher(indexNumber);
                    indexNumber=matcher2.replaceAll("");


                    //System.out.println("index numb ="+indexNumber+";");
//удаляем пробелы из значений выбраного ранее индекса
                    pattern2=Pattern.compile(" *");
                    matcher2=pattern2.matcher(item.getValue());
                    String indexValuNumber=matcher2.replaceAll("");


                    String vakueKey = "value"+indexNumber+indexValuNumber;

                    pattern3=Pattern.compile("[^0-9]");
                    matcher3=pattern3.matcher(indexNumber+indexValuNumber);

                    pattern4=Pattern.compile("0+");
                    matcher4=pattern4.matcher(indexValuNumber);




                    pattern6=Pattern.compile("");
                    matcher6=pattern6.matcher(indexNumber);

                    pattern5=Pattern.compile("0+");
                    matcher5=pattern5.matcher(indexNumber);




                    if (!matcher3.find() && valuesMaps.containsKey(vakueKey) && !matcher4.lookingAt()
                             && valuesMaps.get(vakueKey)!=null && !matcher5.lookingAt() && !matcher6.matches()){

                        pattern7=Pattern.compile("[a-z]");
                        matcher7=pattern7.matcher(valuesMaps.get(vakueKey));
                        if(!matcher7.find()){
                            System.out.println("            index"+indexNumber+"="+indexValuNumber+" is gud");

                            //valuesMaps.put(vakueKey,"error");
                            System.out.println("            "+vakueKey+"="+valuesMaps.get(vakueKey));
                            summ=summ+Double.parseDouble(valuesMaps.get(vakueKey));
                        }
                        else{System.out.println("                                       index"+indexNumber+"="+indexValuNumber+" is bed");
                            System.out.println("                                       "+vakueKey+"="+valuesMaps.get(vakueKey));
                            errorLine++;}

                    }


                    else {
                        System.out.println("                                       index"+indexNumber+"="+indexValuNumber+" is bed");
                        System.out.println("                                       "+vakueKey+"="+valuesMaps.get(vakueKey));
                        errorLine++;}









                }





            }

    }
    catch (Exception E) {


        E.printStackTrace();
    }

        System.out.println("sum = "+summ);
        System.out.println("error lines = "+errorLine);

}

}
