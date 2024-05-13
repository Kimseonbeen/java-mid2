package generic.ex5;

import generic.animal.Animal;

public class WildcardEx {

    // 이것은 제네릭 메서드
    // Box<Dog> dogBox를 전달한다. 타입 추론에 의해 타입 T가 Dog가 된다.
    static <T> void printGenericV1(Box<T> box) {
        System.out.println("T = " + box);
        System.out.println("T = " + box.get());
    }

    // 이것은 제네릭 메서드가 아니다. 일반적인 메서드
    // Box<Dog> dogBox를 전달한다. 와일드카드 ?는 모든 타입을 받을 수 있다.
    static void printWildcardV1(Box<?> box) {
        System.out.println("? = " + box.get());
    }

    static <T extends Animal> void printGenericV2(Box<T> box) {
        T t = box.get();
        System.out.println("이름 = " + t.getName());
    }


    /**
     * 제네릭 메서드와 마찬가지로 와일드카드에도 상한을 둘 수 있다.
     * 여기서는 ? extends Animal
     * Animal과 그 하위 타입만 입력 받는다. 만약 다른 타입을 입력하면 컴파일 오류가 발생
     * box.get()을 통해서 꺼낼 수 있는 타입의 최대 부모는 Animal이 된다. 따라서 Animal 타입으로 조회할 수 있다.
     */
    static void printWildcardV2(Box<? extends Animal> box) {
        Animal animal = box.get();  // T로 꺼내는게아니라 바로 Animal 꺼낼 수 있음
        System.out.println("이름(?) = " + animal.getName());
    }
    //Box<Dog>, Box<Cat>, Box<Object>

    static <T extends Animal> T printAndReturnGeneric(Box<T> box) {
        T t = box.get();
        System.out.println("이름 = " + t.getName());
        return t;
    }

    static Animal printAndReturnWildCard(Box<? extends Animal> box) {
        Animal animal = box.get();
        System.out.println("이름 = " + animal.getName());
        return animal;
    }

}
