package company.com.service;
import java.util.ArrayList;
import java.util.List;

public interface Iservice <T,t> {
    T create(T t);
    T update(T t);
    void delete(String id);
    T read(String id);
    List<T> readAlll();
}
