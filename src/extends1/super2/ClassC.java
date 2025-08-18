package extends1.super2;

public class ClassC extends ClassB {

    public ClassC() {
        super(10, 20); // 부모 클래스에 기본 생성자가 없으면 생략 불가, 내가 직접 호출해줘야 함.
        System.out.println("ClassC 생성자");
    }
}
