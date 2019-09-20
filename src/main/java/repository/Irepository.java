package repository;

import java.util.ArrayList;

public interface Irepository<T,ID>
{
    T create(T t);
    T update(T t);
    void delete(ID id);
    T read(ID id);
    ArrayList<T> readAll();
    int getItemNumber();

}//end com.repository
