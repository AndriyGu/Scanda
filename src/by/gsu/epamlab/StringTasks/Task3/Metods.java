package by.gsu.epamlab.StringTasks.Task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static jdk.nashorn.internal.objects.NativeString.substring;

/**
 * Created by AdanaC on 18.03.2017.
 */
public class Metods {
    static public String dateChenger(String allLine) {

        Matcher matcher, matcher2 = null;
        Pattern pattern, pattern2 = null;


        pattern = Pattern.compile("[0-9]+[\\/.-][0-9]+[\\/.-][0-9]+");

        matcher = pattern.matcher(allLine);


        if (matcher.find()) {
            String[] firstSplit = allLine.split("[0-9]+[\\/.-][0-9]+[\\/.-][0-9]+");
           // System.out.println("firstSplit 0  " + firstSplit[0]);
           // System.out.println("firstsplit 1  " + firstSplit[1]);

            // удаляем то что до первого вхождения

            pattern = Pattern.compile(firstSplit[0]); //
            matcher = pattern.matcher(allLine);
            String temp = matcher.replaceAll("");



            String dateNumbers = temp.substring(0, temp.length() - firstSplit[1].length());




           // System.out.println("dateNumbers" + dateNumbers);


            String[] tokens = dateNumbers.split("[\\/.-]");
            if (tokens.length != 3) {
                System.out.println("dateChenger has bad format");
            } else {
                if (tokens[2].length() == 2) {
                    if (Integer.parseInt(tokens[2]) < 50) {
                        tokens[2] = "20" + tokens[2];
                    } else {
                        tokens[2] = "19" + tokens[2];
                    }
                }
                String monthString;
                switch (Integer.parseInt(tokens[1])) {
                    case 1:  monthString = "Январь";
                        break;
                    case 2:  monthString = "Февраль";
                        break;
                    case 3:  monthString = "Март";
                        break;
                    case 4:  monthString = "Апрель";
                        break;
                    case 5:  monthString = "Май";
                        break;
                    case 6:  monthString = "Июнь";
                        break;
                    case 7:  monthString = "Июль";
                        break;
                    case 8:  monthString = "Август";
                        break;
                    case 9:  monthString = "Сентябрь";
                        break;
                    case 10: monthString = "Октябрь";
                        break;
                    case 11: monthString = "Ноябрь";
                        break;
                    case 12: monthString = "Декабрь";
                        break;
                    default: monthString = "Не знаем такого";
                        break;
                }
                allLine=firstSplit[0]+monthString+" "+tokens[0]+" "+tokens[2]+firstSplit[1];
            }
        }
        //System.out.println(allLine);
        return allLine;
    }
    static public String belRubChenger(String allLine){

        Matcher matcher, matcher2 = null;
        Pattern pattern, pattern2 = null;


        pattern = Pattern.compile("([0-9]+ +)+blr");
        //System.out.println("reg  =  " + pattern);
        matcher = pattern.matcher(allLine);

        pattern2 = Pattern.compile("([0-9]+ +)+belarusian");
        matcher2 = pattern2.matcher(allLine);
        if (matcher.find()) {
            String[] firstSplit = allLine.split("([0-9]+ +)+blr");


            // удаляем то что до первого вхождения

            pattern = Pattern.compile(firstSplit[0]); //
            matcher = pattern.matcher(allLine);
            String temp = matcher.replaceAll("");



            String price = temp.substring(0, temp.length() - firstSplit[1].length()-4);



            pattern = Pattern.compile(" "); //
            matcher = pattern.matcher(price);
            price = matcher.replaceAll("");



            allLine=firstSplit[0]+price+" blr"+firstSplit[1];

        }
        if (matcher2.find()) {
            String[] firstSplit = allLine.split("([0-9]+ +)+belarusian");


            // удаляем то что до первого вхождения

            pattern = Pattern.compile(firstSplit[0]); //
            matcher = pattern.matcher(allLine);
            String temp = matcher.replaceAll("");



            String price = temp.substring(0, temp.length() - firstSplit[1].length()-10);



            pattern = Pattern.compile(" "); //
            matcher = pattern.matcher(price);
            price = matcher.replaceAll("");



            allLine=firstSplit[0]+price+" belarusian"+firstSplit[1];

        }return allLine;
    }
    static public String dollarChenger(String allLine){

        Matcher matcher, matcher2 = null;
        Pattern pattern, pattern2 = null;


        pattern = Pattern.compile("([0-9]+ +)+dollars");

        matcher = pattern.matcher(allLine);

        pattern2 = Pattern.compile("([0-9]+ +)$");
        matcher2 = pattern2.matcher(allLine);
        if (matcher.find()) {

            String[] firstSplit = allLine.split("([0-9]+ +)+dollars");

            // удаляем то что до первого вхождения

            pattern = Pattern.compile(firstSplit[0]); //
            matcher = pattern.matcher(allLine);
            String temp = matcher.replaceAll("");



            String price = temp.substring(0, temp.length() - firstSplit[1].length()-7);



            pattern = Pattern.compile(" "); //
            matcher = pattern.matcher(price);
            price = matcher.replaceAll("");



            allLine=firstSplit[0]+price+" dollars"+firstSplit[1];

        }
        if (matcher2.find()) {
            String[] firstSplit = allLine.split("([0-9]+ +)$");


            // удаляем то что до первого вхождения

            pattern = Pattern.compile(firstSplit[0]); //
            matcher = pattern.matcher(allLine);
            String temp = matcher.replaceAll("");



            String price = temp.substring(0, temp.length() - firstSplit[1].length()-1);



            pattern = Pattern.compile(" "); //
            matcher = pattern.matcher(price);
            price = matcher.replaceAll("");



            allLine=firstSplit[0]+price+"$"+firstSplit[1];

        }return allLine;
    }
}
