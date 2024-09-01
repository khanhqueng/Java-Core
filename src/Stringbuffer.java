public class Stringbuffer {
    public static void main(String[] args) {
        // similar to builder but this support synchronization
        Test test1= new Test();
        test1.start();
        Test test2= new Test();
        test2.start();
        System.out.println(test1.hello()+ "1");
        System.out.println(test2.hello()+ "2");
    }
    public static void stringBuffer(){
        // mutable char sequence, improve performance when manipulate with String
    }
    static class Test extends Thread{
        StringBuffer bf;
        public Test(){
            bf= new StringBuffer();
        }
        public String hello() {
            bf.append("Hello World");
            return(bf.toString());
        }

    }
}
