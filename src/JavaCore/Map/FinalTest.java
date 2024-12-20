package JavaCore.Map;

public class FinalTest {
    public final Student student= new Student();
    public static void main(String[] args){
        FinalTest finalTest = new FinalTest();
        finalTest.student.setId(2);
        finalTest.student.setName("herrfds");
        System.out.println(finalTest.student);
    }
}
