import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class reflect {
    public static void main(String[] args) {
        Class clazz = fistanotation.class;
        System.out.println(clazz);
        try {
            Constructor cons = clazz.getConstructor();
            try {
                fistanotation anot1 = (fistanotation) cons.newInstance();
            } catch (InstantiationException e) {
                throw new RuntimeException(e);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e);
            }
            System.out.println(cons);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
}