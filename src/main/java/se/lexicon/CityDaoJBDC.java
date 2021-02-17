package se.lexicon;

import se.lexicon.DaoPackage.CityDao;
import se.lexicon.model.City;

import java.sql.*;
import java.util.List;

public class CityDaoJBDC implements CityDao {

    private Connection mySqlConnection() {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "1234");
            Statement statement = connection.createStatement();
            String selectAllCities = "select id,name,population from city";
            ResultSet resultSet = statement.executeQuery(selectAllCities);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String population = resultSet.getString("population");
                System.out.println("Id: " + id + " Name: " + name + " Population: " + population);
            }
            System.out.println("Connection is established");
        } catch (SQLException e) {
            e.printStackTrace();
        }


    @Override
    public City findById(int id) {
        Connection connection = mySqlConnection();


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
