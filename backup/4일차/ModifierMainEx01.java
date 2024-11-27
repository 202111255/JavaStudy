class Modifier {
    //멤버필드
    String data1 = "default";
    public String data2 = "public";
    protected String data3 = "protected";
    private String data4 = "private";

    void viewData() {
        System.out.println(this.data1);
        System.out.println(this.data2);
        System.out.println(this.data3);
        System.out.println(this.data4); //내부에서는 접근가능
    }
}

public class ModifierMainEx01 {
    public static void main(String[] args) {
        Modifier m = new Modifier();

        System.out.println(m.data1);
        System.out.println(m.data2);
        System.out.println(m.data3);
        //System.out.println(m.data4);

        m.viewData();
    }
}
