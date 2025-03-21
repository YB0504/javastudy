package prototype;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Cloneable {

    private List<String> empList;

    public Employee() {
        empList = new ArrayList<String>();
    }

    public Employee(List<String> empList) {
        this.empList = empList;
    }

    public void loadData() {
        empList.add("이름1");
        empList.add("이름2");
        empList.add("이름3");
        empList.add("이름4");
    }

    public List<String> getEmpList() {
        return empList;
    }

    public Object clone() throws CloneNotSupportedException {
        List<String> temp = new ArrayList<String>();
        for (String s : this.empList) {
            temp.add(s);
        }
        return new Employee(temp);
    }
}