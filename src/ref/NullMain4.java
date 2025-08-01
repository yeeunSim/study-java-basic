package ref;

public class NullMain4 {
    public static void main(String[] args) {
        BigData bigData = new BigData(); // x001
        bigData.data = new Data(); // x002
        System.out.println("bigData.count = " + bigData.count); // 0
        System.out.println("bigData.data = " + bigData.data); // x002

        // bigData는 x001 참조값을 가진다. -> x001.data.value
        System.out.println("bigData.data.value = " + bigData.data.value); // x001.data는 x002 값을 가진다. -> x002.value
    }
}
