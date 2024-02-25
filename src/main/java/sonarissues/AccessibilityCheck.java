package sonarissues;

import java.lang.reflect.Field;
import java.util.Date;

public class AccessibilityCheck {
    public static void main(String[] args) {
        Class<Employee> c = Employee.class;
        try {
            Employee e = c.newInstance();
            Field name = c.getDeclaredField("name");
//            c.getDeclaredMethod().getNam
            Field doj = c.getDeclaredField("joinDate");
//            name.setAccessible(true);
            doj.setAccessible(true);
            System.out.println("Value of name: " + name.get(e));
            System.out.println("Value of joinDate: "
                    + name.get(e));
            name.set(e, "Harry");
            doj.set(e, new Date());
            System.out.println("Changed value of name: "
                    + name.get(e));
            System.out.println("Changed value of joinDate: "
                    + doj.get(e));

        } catch (InstantiationException | NoSuchFieldException
                 | SecurityException | IllegalAccessException ex) {
            System.out.println(ex.getMessage());
        }

        Employee employee = new Employee();
        System.out.println(employee.getName());
    }
}
