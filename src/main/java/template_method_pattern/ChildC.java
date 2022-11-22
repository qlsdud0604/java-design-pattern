package template_method_pattern;

public class ChildC extends Parent {
    @Override
    public void hook() {
        System.out.println("ChildC 클래스에서 구현한 부분");
    }
}
