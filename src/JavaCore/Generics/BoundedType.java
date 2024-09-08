package JavaCore.Generics;

import java.util.stream.IntStream;

public class BoundedType<T extends Number & A > {
    private T type;

    public T getType() {
        return type;
    }

    public void setType(T type) {
        this.type = type;
    }
    public <U extends Number> void inspect(U u){
        System.out.println("T: " + type.getClass().getName());
        System.out.println("U: "+ u.getClass().getName());
    }
}
