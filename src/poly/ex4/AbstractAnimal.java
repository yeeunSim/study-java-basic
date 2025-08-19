package poly.ex4;

public abstract class AbstractAnimal {
    public abstract void sound();
    public abstract void move();

    // Abstract 클래스
    // 클래스니까 필드, 생성자, 일반 메서드, 추상 메서드를 다 가질 수 있음.
    //"추상적 개념(틀)"을 제공하면서, 공통된 구현도 같이 주고 싶을 때 사용.
    //단일 상속만 가능 → 계층 구조에서 뼈대를 제공하는 용도에 적합.
    //→ 즉, “공통된 상태 + 공통된 로직 + 일부 추상적인 것”을 한 번에 주고 싶을 때 쓰는 게 맞음.
}
