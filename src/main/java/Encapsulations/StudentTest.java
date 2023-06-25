package Encapsulations;

public class StudentTest {
    public static void main(String[] args) {
        Student st = new Student();
        st.setName("Encapsulation");
        st.setAge(12);
        System.out.println("Name:"+st.getName());
        System.out.println("Age:"+st.getAge());
    }
}
