package ObjectClass;

class Employee implements Cloneable {
    int id;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class CloneMethod {

    public static void main(String[] args) {
        try {
            Employee e = new Employee(101, "Shreya");
            Employee e1 = (Employee) e.clone();

            System.out.println(e.id + " " + e.name);
            System.out.println(e1.id + " " + e1.name);

        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
    }
}

