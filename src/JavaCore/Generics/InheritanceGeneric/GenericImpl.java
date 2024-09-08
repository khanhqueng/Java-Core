package JavaCore.Generics.InheritanceGeneric;

import java.util.ArrayList;
import java.util.List;

public class GenericImpl<T> implements GenericDao<T> {
    private List<T> list= new ArrayList<>();

    @Override
    public void insert(T obj) {
        list.add(obj);
    }

    @Override
    public void update(T obj) {
        list.remove(obj);
    }

    @Override
    public String toString() {
        return "GenericImpl{" +
                "list=" + list +
                '}';
    }
}
