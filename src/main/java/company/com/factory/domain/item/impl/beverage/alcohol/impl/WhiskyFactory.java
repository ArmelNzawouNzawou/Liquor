package company.com.factory.domain.item.impl.beverage.alcohol.impl;

import company.com.domain.item.impl.beverage.alcohol.impl.Whisky;

public class WhiskyFactory {
   public static Whisky getWhisky(String id, String name){
       return new Whisky.Builder(id).buildName(name).build();
   }
}
