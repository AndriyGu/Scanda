package by.gsu.epamlab.ClasessTasks.Task1;

/**
 * Created by AdanaC on 03.03.2017.
 */
public class Main {
    public static void main(String[] args) {
    BusinessTrip[] businessTrips = new BusinessTrip[5];

    businessTrips[0]=new BusinessTrip("Gera", 50000,5);
    businessTrips[1]=new BusinessTrip("Gera2", 50000,56);
    businessTrips[2]=null;
    businessTrips[3]=new BusinessTrip("Gera3", 50000,4);
    businessTrips[4]=new BusinessTrip();


        for (BusinessTrip businessTrip:businessTrips) {
        if (businessTrip==null){}
        else {businessTrip.show();}
        System.out.println("");
    }


    businessTrips[4].setTransport(50);
    //businessTrips[4].show();

        System.out.println("Duration ="+(businessTrips[0].getDays()+businessTrips[1].getDays()));

        for (BusinessTrip businessTrip:businessTrips) {
        if (businessTrip==null){}
        else {System.out.println(businessTrip.toString());}
    }



       /* – Если ссылка на объект встречается в контексте строки, то по умолчанию у
        объекта вызывается метод toString( ).
                Пример. Такой код:
        System.out.println("Business trip expenses of anton > " + anton)?
        предпочтительнее, чем эквивалентный ему:
        System.out.println("Business trip expenses of anton > " + anton.toString())?
        */
}}
