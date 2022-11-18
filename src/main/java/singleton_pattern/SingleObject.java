package singleton_pattern;

public class SingleObject {
    private static SingleObject singleObject = null;

    private SingleObject() {

    }

    public static SingleObject getInstance() {
        if (singleObject == null) {
            singleObject = new SingleObject();
        }

        return singleObject;
    }

}
