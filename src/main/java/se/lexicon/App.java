package se.lexicon;

import se.lexicon.DaoPackage.CityDao;
import se.lexicon.DaoPackage.CityDaoIml;
import se.lexicon.model.City;

import java.util.List;

public class App {
    public static void main(String[] args) {
        CityDao dao = new CityDaoIml();
        City city = dao.findById(6);
        System.out.println("city = " + city);

        System.out.println("_________________________");
        List<City> findByCode = dao.findByCode("TJK");
        findByCode.forEach(System.out::println);


        System.out.println("___________________________");
        List<City> findByName = dao.findByName("Breda");
        findByName.forEach(System.out::println);

        System.out.println("___________________________");
        List<City> findAll = dao.findAll();
        findAll.forEach(System.out::println);

        System.out.println("___________________________");
        City addCity = new City("Gaza", "PSE", "Gaza", 353632);
        City insertCity = dao.add(addCity);
        System.out.println("insertCity = " + insertCity);


        System.out.println("___________________________");
        City updateCity = new City("Gaza", "PSE", "Gaza", 353632);
        City updatedCity = dao.update(updateCity);
        System.out.println(updatedCity);

        System.out.println("___________________________");
        City deleteCity = new City("Gaza", "PSE", "Gaza", 353632);
        int delete = dao.delete(deleteCity);
        System.out.println("delete = " + delete);

    }
}
