package ref;

public class VarChange1 {
    public static void main(String[] args) {
        int a = 10;
        int b = a;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // a 변경
        a = 20;
        System.out.println("변경 a = 20");
        System.out.println("a = " + a);
        // 여기서는 변수 `a` 에 들어있는 값 `10` 을 복사해서 변수 `b` 에 대입한다. 변수 `a` 자체를 `b` 에 대입하는 것이 아니다!
        System.out.println("b = " + b);

        // b 변경
        b = 30;
        System.out.println("변경 b = 30");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
