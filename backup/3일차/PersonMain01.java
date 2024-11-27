//실행 클래스
//public static void main()


//데이터 클래스 <- 우리가 만들고자 하는 것
class Person { //보통 클래스마다 분리하지만 공부를 위해 합쳐놓은 것
    String name;
    int age;
    double height;
    double weight;
}

public class PersonMain01 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "이순신";
        p1.age = 44;
        p1.height = 163;
        p1.weight = 60;

        //Person p2 = new Person();
    }
}