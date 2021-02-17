package se.lexicon;

import se.lexicon.DaoPackage.CityDao;
import se.lexicon.DaoPackage.CityDaoIml;
import se.lexicon.model.City;

public class App {
    public static void main( String[] args ) {
        CityDao dao = new CityDaoIml();
        City city = dao.findById(6);
        System.out.println("city = " + city);
    }
}
