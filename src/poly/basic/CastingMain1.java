package poly.basic;

public class CastingMain1 {
    public static void main(String[] args) {
        // 부모 변수가 자식 인스턴스 참조 (다형적 참조)
        Parent poly = new Child(); // x001
        // 단 자식의 기능은 호출할 수 없다. 컴파일 오류 발생
        // poly.childMethod();

        // 다운캐스팅 (부모 타입 -> 자식 타입)
        // 참고로 캐스팅을 한다고 해서 `Parent poly` 의 타입이 변하는 것은 아니다.
        // 해당 참조값을 꺼내고 꺼낸 참조값이 `Child` 타입이 되는 것이다.
        // 따라서 `poly` 의 타입은 `Parent`로 기존과 같이 유지된다.
        Child child = (Child) poly; // x001
        child.childMethod();
    }
}
