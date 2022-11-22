package template_method_pattern;

public class ChildA extends Parent {
    @Override
    public void hook() {
        System.out.println("ChildA 클래스에서 구현한 부분");
    }
}
