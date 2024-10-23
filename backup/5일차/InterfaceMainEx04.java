interface Employee {
    void salary();
}

class Child1Employee implements Employee {
    public void salary() {
        System.out.println("1");
    }
}

class Child2Employee implements Employee {
    public void salary() {
        System.out.println("2");
    }
}




public class InterfaceMainEx04 {
    public static void main(String[] args) {
        Employee e1 = new Child1Employee();
        Employee e2 = new Child2Employee();
        
        e1.salary();
        e2.salary();

    }
}
