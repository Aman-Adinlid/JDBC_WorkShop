package se.lexicon;

import se.lexicon.DaoPackage.CityDao;
import se.lexicon.model.City;

import java.sql.Connection;
import java.util.List;

public class CityDaoJBDC implements CityDao {


    @Override
    public City findById(int id) {
        return null;
    }

    @Override
    public List<City> findByCode(String code) {
        return null;
    }

    @Override
    public List<City> findByName(String name) {
        return null;
    }

    @Override
    public List<City> findAll() {
        return null;
    }

    @Override
    public City add(City city) {
        return null;
    }

    @Override
    public City update(City city) {
        return null;
    }

    @Override
    public int delete(City city) {
        return 0;
    }
}
