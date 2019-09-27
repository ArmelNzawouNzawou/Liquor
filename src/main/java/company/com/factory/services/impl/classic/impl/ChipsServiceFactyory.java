package company.com.factory.services.impl.classic.impl;
import company.com.service.item.impl.classic.impl.ChipsService;

public class ChipsServiceFactyory{
public static ChipsService getChipsRep(){
    return ChipsService.getChipsRepl();
}
}