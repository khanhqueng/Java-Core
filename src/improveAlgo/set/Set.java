package improveAlgo.set;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Set {
    public List<Integer> set;

    public Set() {
        set = new ArrayList<>();
    }

    public boolean insert(int val) {
        for(Integer integer: set){

            if(integer== val) {
                return false;
            }
        }
        set.add(val);
        return true;
    }

    public boolean remove(int val) {
        Iterator<Integer> integerIterator= set.iterator();
        while (integerIterator.hasNext()){
            if(integerIterator.next()==val){
                integerIterator.remove();
                return true;
            }
        }
        return false;
    }

    public int getRandom() {
        int indexRandom = (int)(Math.random()* set.size());
        return set.get(indexRandom);
    }
}
