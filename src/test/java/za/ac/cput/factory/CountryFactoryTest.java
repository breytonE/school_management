package za.ac.cput.factory;

/* Ethan George
Student Number 218008430
g
 */

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.Country;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.class)
public class CountryFactoryTest {

    ArrayList<Country> countries = new ArrayList<>();

    private static final Country country1 = CountryFactory.createCountry("South Africa" , "3");

    private static final Country country2 = CountryFactory.createCountry("Wales" , "2");
    private static final Country country3 = CountryFactory.createCountry("England" , "1");


    private static final Country country4 = country3;


    @Test
    void a_builder(){
        countries.add(country1);
        System.out.println("Added " + countries.get(0));
        countries.add(country2);
        System.out.println("Added " + countries.get(1));
        assertNotNull(countries);

    }

    @Test
    void b_objectEquality(){

        assertNotEquals(country1.getCountryId() , country2.getCountryId());
        assertNotEquals(country1.getCountryName() , country2.getCountryName());
        assertNotEquals(country1 , country2);
        assertEquals(country3 , country4);

        assertNotNull(country1);
        assertNotNull(country2);
        assertNotNull(country3);
        assertNotNull(country4);

        System.out.println("Test Passed");

    }

    @Test
    void c_objectIdentity(){


        assertNotSame(country1.getCountryId() , country2.getCountryId());
        assertNotSame(country1.getCountryName() , country2.getCountryName());
        assertSame(country3 , country4);

        assertNotNull(country1);
        assertNotNull(country2);
        assertNotNull(country3);
        assertNotNull(country4);
        System.out.println("Test Passed");


    }

}
