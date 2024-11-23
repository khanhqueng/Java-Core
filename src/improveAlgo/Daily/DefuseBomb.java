package improveAlgo.Daily;

public class DefuseBomb {
    public int[] decrypt(int[] code, int k) {
        if(k==0) return new int[code.length];
        int sum=0;
        int indx= 0;
        int start=1;
        int end=code.length-1;
        int[] result= new int[code.length];
        if(k>0 ){
            for(end=start;end<=k;end++){
                sum+=code[end];
            }
        }
        else {
            for(start=end;start>=code.length+k;start--){
                sum+=code[start];
            }
            start++;
            end++;
        }
        result[indx++]=sum;
        for(int i=1;i<code.length;i++){
            if(end>=code.length) end=code.length%end;
            if(start>=code.length) start=code.length%start;
            sum= sum-code[start]+code[end];
            start++;
            end++;
            result[indx++]= sum;
        }
        return result;
    }
}
