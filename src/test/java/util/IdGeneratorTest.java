package util;

import org.junit.Test;
import service.item.impl.beverage.alcohol.impl.BeerService;

import static org.junit.Assert.*;

public class IdGeneratorTest {

    @Test
    public void generateRandomGivenSuffix() {

    }

    @Test
    public void getClassName() {
        String name=IdGenerator.getClassName(BeerService.class);
        System.out.println(name);
    }

    @Test
    public void getSuffixFromClassName() {
        String name=IdGenerator.getSuffixFromClassName(BeerService.class);
        System.out.println(name);


    }
}