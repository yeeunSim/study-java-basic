package access.a;

public class AccessInnerMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();

        //pulbic 호출 가능
        data.publicField = 1;
        data.publicMethod();

        // 같은 패키지 default 호출 가능
        data.defaultField = 2;
        data.defalutMethod();

        // private 호출 불가
        // data.privateField = 3;
        // data.privateMethod();

        data.innerAccess();
    }
}
