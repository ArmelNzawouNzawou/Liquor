package company.com.service;

import java.util.ArrayList;

public interface Service<T,t> {
    T create(T t);
    T update(T t);
    void delete(String id);
    T read(String id);
    ArrayList<T> readAlll();
}
