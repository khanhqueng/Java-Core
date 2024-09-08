package JavaCore.Generics.InheritanceGeneric;

public interface GenericDao<T> {
    void insert(T obj);
    void update(T obj);
}
