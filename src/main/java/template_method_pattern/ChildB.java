package template_method_pattern;

public class ChildB extends Parent {
    @Override
    public void hook() {
        System.out.println("ChildB 클래스에서 구현한 부분");
    }
}
