package template_method_pattern;

public abstract class Parent {

    /** 자식에서 공통적으로 사용하는 부분(템플릿 메서드) */
    public void someMethod() {
        templateMethod01();

        /** 자식에서 다르게 구현해야 하는 부분(훅) */
        hook();

        templateMethod02();
    }

    public void templateMethod01() {
        System.out.println("Parent 클래스에서 실행되는 부분 - 상");
    }

    public void templateMethod02() {
        System.out.println("Parent 클래스에서 실행되는 부분 - 하");
    }

    abstract public void hook();
}
