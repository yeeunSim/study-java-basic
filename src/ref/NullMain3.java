package ref;

public class NullMain3 {
    public static void main(String[] args) {
        BigData bigData = new BigData(); // x001
        System.out.println("bigData.count = " + bigData.count); // 0
        System.out.println("bigData.data = " + bigData.data); // x001 -> Null

        // NullPointerException
        System.out.println("bigData.data.value = " + bigData.data.value); // null.value -> 예외 발생
    }
}
