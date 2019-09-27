package company.com.service.item.impl.beverage.nonalcohol.impl;

import company.com.domain.item.impl.beverage.nonalcohol.impl.EnergyDrink;
import company.com.factory.repository.item.impl.beverage.nonalcohol.impl.EnergyDrinkRepFactory;
import company.com.repository.item.impl.beverage.nonalcohol.impl.EnergyDrinkRep;
import company.com.service.item.impl.beverage.nonalcohol.EnergyDrinkInt;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
@Component
public class EnergyDrinkService implements EnergyDrinkInt {

    private static EnergyDrinkService energyDrinkRep=null;
    private EnergyDrinkRep energyDrink= EnergyDrinkRepFactory.getEnergyDrinkRep();

    private EnergyDrinkService() {
    }
public static EnergyDrinkService getEnergyDrinkRep(){
        if(energyDrinkRep==null){
            energyDrinkRep=new EnergyDrinkService();
        }return energyDrinkRep;
}


    @Override
    public EnergyDrink create(EnergyDrink energyDrink) {
        return this.energyDrink.create(energyDrink);
    }

    @Override
    public EnergyDrink update(EnergyDrink energyDrink) {
        return this.energyDrink.update(energyDrink);
    }

    @Override
    public void delete(String id) {
        energyDrink.delete(id);
    }

    @Override
    public EnergyDrink read(String id) {
        return energyDrink.read(id);
    }

    @Override
    public ArrayList<EnergyDrink> readAlll() {
        return energyDrink.readAll();
    }
}
