import com.pojo.Address;
import com.pojo.Employee;

import java.util.HashMap;
import java.util.Map;

public class MyComparison {
    public static void main(String[] args) {
        Map<Employee, Address> entry = new HashMap<>();
        entry.put(new Employee(100,"vivek"),new Address("ranchi"));
        entry.put(new Employee(101,"aayush"),new Address("patna"));
        entry.put(new Employee(102,"anubhav"),new Address("pune"));
        System.out.println(entry);
    }
}
