package ref;

public class NullMain2 {
    public static void main(String[] args) {
        Data data = null; // 팜조할 주소가 존재하지 않는다는 뜻
        data.value = 10; // null.value = 10; 이므로 NullPointerException 예외 발생
        System.out.println("data = " + data.value);
    }
}
