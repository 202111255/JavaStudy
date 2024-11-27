//setter와 getter

class Modifier3 {
    private String data;

    //입력용 메서드
    public void SetterData(String data) {
        this.data = data;
    }

    //출력용 메서드
    public String getterData() {
        return data;
    }
}

public class ModifierMainEx03 {
    public static void main(String[] args) {
        Modifier3 m = new Modifier3();

        m.SetterData("강바다");
        System.out.println(m.getterData());
    }
}
