package JavaCore;

public class Stringbuilder {
    public static void main(String[] args) {
        // test performance
        long startTime = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer("Java");
        for (int i=0; i<10000; i++){
            sb.append("test");
        }
        System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");
        startTime = System.currentTimeMillis();
        StringBuilder sb2 = new StringBuilder("Java");
        for (int i=0; i<10000; i++){
            sb2.append("test");
        }
        System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");

}
    public static void stringBuilder(){
        // mutable char sequence, improve performance when manipulate with String
        StringBuilder builder= new StringBuilder("Khanh");
        builder.append("hello");
        builder.replace(1,5,"cucheu");
        builder.insert(1,"wtf");
        builder.insert(2, new char[] {'2','3'});
        System.out.println(builder);
    }
}
