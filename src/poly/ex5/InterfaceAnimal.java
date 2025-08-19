package poly.ex5;

public interface InterfaceAnimal {
    void sound(); // public abstract
    void move(); // public abstract


    // Interface
    // 사실상 순수 추상 클래스의 역할.
    //규약(계약)을 엄격하게 강제 → 구현 클래스는 반드시 인터페이스 메서드를 구현해야 함.
    //상태(필드) 가질 수 없음 → 객체의 “역할”만 정의.
    //다중 구현 가능 → "이 객체는 여러 역할을 동시에 할 수 있다"를 표현할 때 강력.
    //→ 그래서 규정을 빡빡하게 적용하고 싶을 때 쓰는 게 맞음.
}
