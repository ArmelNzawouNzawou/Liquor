package company.com.repository;

import java.util.ArrayList;

public interface Irepository<T,t> {
    T create(T t);
    T update(T t);
    void delete(String id);
    T read(String id);
    ArrayList<T> readAll();

}//end com.company.com.repository
