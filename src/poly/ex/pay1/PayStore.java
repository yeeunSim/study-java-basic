package poly.ex.pay1;

// 추상 메서드를 하나라도 가지면 반드시 abstract class로 선언해야 함.
// 하지만 추상 메서드가 전혀 없어도 abstract class로 선언할 수 있음.
// 즉, abstract class는 "이 클래스는 직접 객체를 만들 수 없고, 상속해서 써라" 라는 의미를 주는 것
// "반드시 추상 메서드가 있어야 한다"는 건 아님!!

public abstract class PayStore {
    //결제 수단 추가시 변하는 부분
    public static Pay findPay(String option) {
        if (option.equals("kakao")) {
            return new KakaoPay();
        } else if (option.equals("naver")) {
            return new NaverPay();
        } else {
            return new DefaultPay();
        }
    }
}
