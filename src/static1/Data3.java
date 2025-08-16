package static1;

public class Data3 {
    public String name;
    public static int count; // static

    public Data3(String name) {
        this.name = name;
        // Data3.count++; 같은 뜻인데, 내 거(Data3)는 생략 가능함.
        count++;
    }
}
