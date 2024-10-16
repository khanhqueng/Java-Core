package improveAlgo.WaterAndJug;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Main {
    class Node{
        public int x;
        public int y;
        public Node(int x, int y){
            this.x=x;
            this.y=y;
        }
    }
    public boolean canMeasureWater(int x, int y, int target) {
        Node root= new Node(0,0);
        Queue<Node> queue= new LinkedList<>();
        Set<String> set= new HashSet<>();
        queue.add(root);
        set.add("0,0");
        while(!queue.isEmpty()){
            Node curr= queue.poll();
            if(curr.x+ curr.y==target) return true;
            int tempX,tempY;
            // x-> y
            tempX= curr.x- Math.min(curr.x, y- curr.y);
            tempY= curr.y+ Math.min(curr.x, y- curr.y);
            if(!set.contains(tempX+","+tempY)) {
                set.add(tempX + "," + tempY);
                queue.add(new Node(tempX, tempY));
            }
            // y-> x
            tempX= curr.x+ Math.min(curr.y, x- curr.x);
            tempY= curr.y- Math.min(curr.y, x- curr.x);
            if(!set.contains(tempX+","+tempY)) {
                set.add(tempX+","+tempY);
                queue.add(new Node(tempX,tempY));
            }
            // empty x
            tempX= 0;
            tempY= curr.y;
            if(!set.contains(tempX+","+tempY)) {
                set.add(tempX+","+tempY);
                queue.add(new Node(tempX,tempY));
            }
// empty y
            tempX= curr.x;
            tempY= 0;
            if(!set.contains(tempX+","+tempY)) {
                set.add(tempX+","+tempY);
                queue.add(new Node(tempX,tempY));
            }
// full x
            tempX= x;
            tempY= curr.y;
            if(!set.contains(tempX+","+tempY)) {
                set.add(tempX+","+tempY);
                queue.add(new Node(tempX,tempY));
            }
// full y
            tempX= curr.x;
            tempY= y;
            if(!set.contains(tempX+","+tempY)) {
                set.add(tempX+","+tempY);
                queue.add(new Node(tempX,tempY));
            }
        }
        return false;
    }
}
