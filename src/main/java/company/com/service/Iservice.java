package company.com.service;
import java.util.ArrayList;

public interface Iservice <T,t> {
    T create(T t);
    T update(T t);
    void delete(String id);
    T read(String id);
    ArrayList<T> readAlll();
}
