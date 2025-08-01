package ref.ex;

import java.util.Scanner;

public class ProductOrderMain4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int num = sc.nextInt();
        sc.nextLine();
        // 🔸 주의!
        // nextInt()는 숫자만 읽고, 사용자가 친 Enter(줄바꿈 문자 '\n')는 읽지 않음.
        // 그래서 버퍼에 \n이 남아있게 되고,
        // 그 다음에 nextLine()을 호출하면 남아있던 \n을 그대로 읽어버려서 "" (빈 문자열)이 들어감.
        // 이걸 방지하려고 nextLine() 한 번 호출해서 버퍼를 "비워주는" 작업을 함.

        ProductOrder[] orders = new ProductOrder[num];

        for (int i = 0; i < num; i++) {
            System.out.println((i+1) + "번째 주문 정보를 입력하세요.");

            System.out.print("상품명: ");
            String productName = sc.nextLine();
            // 🔹 여기선 nextLine()을 써서 사용자가 입력한 문자열 한 줄 전체(띄어쓰기 포함)를 읽어옴.

            System.out.print("가격: ");
            int price = sc.nextInt(); // 숫자만 읽고, 줄바꿈(\n)은 버퍼에 남김

            System.out.print("수량: ");
            int quantity = sc.nextInt(); // 마찬가지로 줄바꿈(\n)은 여전히 버퍼에 남음
            sc.nextLine();
            // 🔸 그래서 여기서도 nextInt() 이후 다음 nextLine()을 위해 버퍼 비워줌
            // 만약 이걸 안 하면 다음 루프에서 상품명 입력을 제대로 못 받게 됨

            orders[i] = createOrder(productName, price, quantity);
        }

        printOrders(orders);
        int totalAmount = getTotalAmount(orders);
        System.out.println("총 결제 금액: " + totalAmount);
    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }

    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int totalAmount = 0;
        for (ProductOrder order : orders) {
            totalAmount += order.price * order.quantity;
        }
        return totalAmount;
    }
}
