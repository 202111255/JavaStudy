class Student1 {
    private String hakbun;
    private String name;
    private String phone_num;
    private int age;
    private String address;
    Student1(String hakbun, String name, String phone_num, int age, String address) {
        setHakbun(hakbun);
        setName(name);
        setPhoneNum(phone_num);
        setAge(age);
        setAddress(address);
    }
    public void setHakbun(String hakbun) {
        this.hakbun = hakbun;
    }

    public String getHakbun() {
        return this.hakbun;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setPhoneNum(String phone_num) {
        this.phone_num = phone_num;
    }

    public String getPhoneNum() {
        return this.phone_num;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return this.address;
    }
} 


public class quiz3 {
    public static void main(String[] args) {
        Student1[] studentArr = new Student1[10];
        Student1 s1 = new Student1("1001", "홍길동", "010-111-1111", 20, "서울시");
        Student1 s2 = new Student1("1002", "박문수", "010-222-2222", 22, "경기도");
        Student1 s3 = new Student1("1003", "임꺽정", "010-333-3333", 25, "강원도");
        studentArr[0] = s1;
        studentArr[1] = s2;
        studentArr[3] = s3;

        System.out.println(studentArr[1].getName());

        /*
         * 학생기록을 위한 프로그램
            학생
            학번      이름      전화번호        나이  주소
            1001        홍길동   010-111-1111    20  서울시
            1002        박문수   010-222-2222    22  경기도
            1003        임꺽정   010-333-3333    25  강원도
            1. 학생 데이터를 2차원 배열을 이용해서 입력하고 출력
            1. 학생 데이터를 1차원 배열과 학생(Student) 클래스를 이용해서 입력하고 출력
                * 캡슐화를 사용하면 좋음
         */
    }
}
