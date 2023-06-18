package HW_019;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

public class TestRunner {

    static void start(Class object) throws InvocationTargetException, IllegalAccessException {
        CalcTests calcTests = new CalcTests();

        String className = object.getSimpleName();
        System.out.println("Class : " + className);

        Method[] methods = object.getDeclaredMethods();

        try {
            int count = 0;
            for (Method method : methods) {  //Before
                Annotation[] annotations = method.getDeclaredAnnotations();
                String annotationName = annotations[0].annotationType().getSimpleName();
                if (annotationName.equals("BeforeSuite")) {
                    count++;
                    if (count > 1) {
                        throw new BeforOrAfterMoreOneTimeExeption();
                    }
                    method.invoke(calcTests);
                }
            }
        } catch (BeforOrAfterMoreOneTimeExeption e) {
            System.out.println("Only one time " + e);
        }

        //-----------------------------------------------------------------------------
        SortedMap<Integer, Method> methodSortedMap = new TreeMap<>();

        for (Method method : methods) {  //Test
            Annotation[] annotations = method.getDeclaredAnnotations(); //take annotation

            String annotationName = annotations[0].annotationType().getSimpleName();

            if (annotationName.equals("Test")) {
                int priority = method.getAnnotation(Test.class).priority();
                methodSortedMap.put(priority, method);
            }
        }
        for (Map.Entry<Integer, Method> entry : methodSortedMap.entrySet()) {
            entry.getValue().invoke(calcTests);
        }
        //------------------------------------------------------------------------------
        try {
            int count = 0;
            for (Method method : methods) {  //AfterSuite
                Annotation[] annotations = method.getDeclaredAnnotations();
                String annotationName = annotations[0].annotationType().getSimpleName();
                if (annotationName.equals("AfterSuite")) {
                    count++;
                    if (count > 1) {
                        throw new BeforOrAfterMoreOneTimeExeption();
                    }
                    method.invoke(calcTests);
                }
            }
        }catch (BeforOrAfterMoreOneTimeExeption e){
            System.out.println("Only one time " + e);
        }
    }
}
