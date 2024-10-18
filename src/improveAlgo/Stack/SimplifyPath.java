package improveAlgo.Stack;

import java.util.Stack;

public class SimplifyPath {
    public String simplifyPath(String path) {
        String newPath= path.replaceAll("/{2,}", "/");
        Stack<String> result= new Stack<>();
        String[] names= newPath.split("/");
        for(String string: names){
            if(string.equals("..") && !result.isEmpty()){
                result.pop();
                continue;
            }
            else if(string.equals("..")){

            }
            if(string.equals(".")) continue;
            result.push(string);

        }
        String res= result.stream().reduce("/", (acc,current)-> acc.isEmpty() ? "/"+current : acc + (acc.endsWith("/") ? "" : "/") + current );
        return res;
    }
}
