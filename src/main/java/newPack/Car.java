package newPack;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Car2 {

    //    Create a Car class that contains company, model and year of manifacturing.
//    Create a getTotalCarsByCompany() method that takes list as a parameter.
//    The method should return Map<String,Integer> whereby the key is the company
//    and the value is the total number of cars per company
    private  String company;
    private String  model;
    private int yofM;

    public Car2(String company, String model, int yofM) {
        this.company = company;
        this.model = model;
        this.yofM = yofM;
    }
    private String getCompany() {
        return company;
    }
    public static Map<String, Integer> getTotalCarsByCompany(List<Car2> carList){
    Map<String, Integer> totalCarsByCompany = new HashMap<>();
    for(Car2 car : carList){
        String company = car.getCompany();
        totalCarsByCompany.put(company, totalCarsByCompany.getOrDefault(company, 0),+1);
    }
    return totalCarsByCompany;


}

    public static void main(String[] args) {
        List<Car2> cars = List.of(
                new Car2("Mercedes", "benz", 2022),
        new Car2("Honda", "Honda2", 2016),
        new Car2("toyota", "prius", 2017)
        );

    }


    }
