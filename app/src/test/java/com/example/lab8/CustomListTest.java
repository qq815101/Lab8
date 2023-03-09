package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;
    /**
     * create a mocklist for my citylist * @return
     */
    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        return list;
    }

    /**
     * get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size plus one
     */
    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }

    @Test
    public void testHasCity(){
        list = MockCityList();
        City city = new City("Estevan", "SK");
        list.addCity(city);
        assertEquals(true,list.hasCity(city));



    }
    //@Test
    //public void testDeleteCity() throws IllegalAccessException {
        //list = MockCityList();
        //City city = new City("Estevan", "SK");
        //list.addCity(city);
        //assertEquals(1, list.getCities().size());
        //list.deleteCity(city);
        //assertEquals(0, list.getCities().size());

    //}

    //@Test
    //void testDeleteCityException() throws IllegalAccessException {
        //list = MockCityList();
        //City city = new City("Estevan", "SK");
        //list.addCity(city);
        //assertEquals(1, list.getCities().size());
        //list.deleteCity(city);
        //assertThrows(IllegalAccessException.class, () -> {
            //list.deleteCity(city);
        //});
    //}

    //@Test
    //void testCountCities() {
        //list = MockCityList();
        //City city = new City("Regina", "Saskatchewan");
        //list.addCity(city);
        //assertEquals(1, list.getCount());
    //}


}
