package generic.ex4;

import generic.animal.Animal;

public class ComplexBox<T extends Animal> {

    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    // 제네릭 타입 보다 재네릭 메서드가 우선순위를 가진다.
    // 여기서 적용된 제너릭 메서드의 타입의 상한은 존재하지않음
    // 참고로 프로그래밍에서 이렇게 모호한건 좋지 않음 T -> Z로 변경
    public <Z> Z printAndReturn(Z z) {
        System.out.println("animal.className : " + animal.getClass().getName());
        System.out.println("t.className : " + z.getClass().getName());
        return z;
    }
}
