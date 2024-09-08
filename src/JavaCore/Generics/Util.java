package JavaCore.Generics;

public class Util {
    public static <K,V> boolean compare(KeyPair<K,V> pair1, KeyPair<K,V> pair2){
        return pair1.getKey().equals(pair2.getKey())  &&
                pair1.getValue().equals(pair2.getValue());
    }
}
