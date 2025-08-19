package poly.ex2;

public class AnimalPolyMain1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();
        Duck duck = new Duck();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);
        soundAnimal(duck);
    }

    /**
     * [메서드에 private, static을 붙인 이유]
     *
     * 1. private
     * - 이 메서드는 AnimalPolyMain1 클래스 안에서만 사용되는 "보조 메서드"이다.
     * - 외부 클래스에서 접근할 필요가 없으므로 private으로 감춰서 캡슐화를 유지한다.
     * - 즉, "누군가 함부로 수정하지 못하게"라기보다는
     *   "외부에서 접근할 필요가 없는 기능을 감춘다"라는 의미에 가깝다.
     *
     * 2. static
     * - main() 메서드가 static이므로, 같은 클래스 안에서 바로 호출할 수 있도록 static으로 맞췄다.
     * - static 메서드 안에서는 인스턴스 멤버에 직접 접근할 수 없기 때문에,
     *   main()에서 soundAnimal()을 편리하게 호출하려면 static이어야 한다.
     * - 만약 static이 아니면, 다음처럼 객체를 만들어서 호출해야 한다:
     *      AnimalPolyMain1 app = new AnimalPolyMain1();
     *      app.soundAnimal(dog);
     *
     * 3. Animal 클래스에 넣지 않은 이유
     * - Animal 클래스의 책임은 "동물이 낼 수 있는 소리를 정의하는 것(sound())"이다.
     * - soundAnimal()은 "동물의 소리를 테스트하는 보조 기능"이므로,
     *   Animal 클래스의 본래 역할(행동 정의)과는 어울리지 않는다.
     * - 따라서 Animal이 아닌, 실행과 테스트를 담당하는 메인 클래스나 유틸리티 클래스에 두는 것이 책임 분리 원칙에 맞다.
     */

    // 동물이 추가 되어도 변하지 않는 코드
    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
