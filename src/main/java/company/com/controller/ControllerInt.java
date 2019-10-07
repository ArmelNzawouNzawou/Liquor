package company.com.controller;

import java.util.ArrayList;
import java.util.List;

public interface ControllerInt<T,t> {

    T create(T t);
    T read(String id);
    void delete(String id);
    T update(T t);
    List<T> readAll();

}
