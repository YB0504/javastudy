package prototype;

import java.util.List;

public class EmployeeMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee employee = new Employee();
        employee.loadData();

        Employee empNew = (Employee) employee.clone();
        Employee empNew1 = (Employee) employee.clone();

        List<String> list = empNew.getEmpList();
        list.add("추가 이름");

        List<String> list1 = empNew1.getEmpList();
        list1.remove("이름1");

        System.out.println("employee List: " +employee.getEmpList());
        System.out.println("empNew List: "+list);
        System.out.println("empNew1 List: "+list1);
    }
}
