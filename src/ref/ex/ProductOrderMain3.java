package ref.ex;

public class ProductOrderMain3 {

    // 🔸 클래스 변수 (== 멤버 변수, == 필드) 중에서 static이 붙은 변수
    // ➡ 클래스 로딩 시 메모리에 딱 하나만 존재하며 모든 메소드와 인스턴스에서 공유됨
    static int totalAmount = 0;

    public static void main(String[] args) {
        // 🔹 orders는 지역 변수 (main 메서드 내에서만 사용 가능)
        ProductOrder[] orders = new ProductOrder[3];

        // 🔸 createOrder()를 통해 인스턴스 생성
        orders[0] = createOrder("두부", 2000, 2);
        orders[1] = createOrder("김치", 5000, 1);
        orders[2] = createOrder("콜라", 1500, 2);

        // 🔹 향상된 for문으로 각 order 인스턴스를 순회
        for (ProductOrder order : orders) {
            printOrders(order);     // 상품 정보 출력
            getTotalAmount(order);  // 총 금액 누적
        }

        System.out.println("총 결제 금액: " + totalAmount);
    }

    // 🔹 클래스 메서드 (static이 붙은 메서드) - 클래스 변수나 static 메서드만 직접 접근 가능
    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();

        // ✅ 아래 3개는 인스턴스 변수 (= 멤버 변수, = 필드)
        // ➡ ProductOrder 클래스의 객체를 만들어야 접근할 수 있음 (즉, new로 생성된 order 통해 접근)
        order.productName = productName;  // 인스턴스 변수
        order.price = price;              // 인스턴스 변수
        order.quantity = quantity;        // 인스턴스 변수

        return order;
    }

    // 🔹 클래스 메서드 (static 메서드)
    static void printOrders(ProductOrder order) {
        System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
        // ↑ productName, price, quantity 모두 인스턴스 변수
    }

    // 🔹 클래스 메서드
    static int getTotalAmount(ProductOrder order) {
        // 클래스 변수 totalAmount에 값을 누적
        totalAmount += order.price * order.quantity;
        return totalAmount;
    }
}
