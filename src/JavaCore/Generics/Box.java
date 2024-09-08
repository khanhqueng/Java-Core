package JavaCore.Generics;

public class Box<T > {
    private T type;

    public T getType() {
        return type;
    }

    public void setType(T type) {
        this.type = type;
    }
    public void add(T t){
        type= t;
    }
}
