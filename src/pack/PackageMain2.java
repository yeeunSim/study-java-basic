package pack;

import pack.a.User;
// import pack.a.*; //pack.a의 모든 클래스 사용
import pack.a.User2;

public class PackageMain2 {
    public static void main(String[] args) {
        Data data = new Data();
        User user = new User(); // import 사용으로 패키지명 생략 가능
        User2 user2 = new User2();
    }
}
