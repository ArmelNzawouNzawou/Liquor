package factory.services.impl.classic.impl;
import repository.item.impl.classic.impl.ChipsRep;
import service.item.impl.classic.impl.ChipsService;

public class ChipsServiceFactyory{
public static ChipsService getChipsRep(){
    return ChipsService.getChipsRepl();
}
}