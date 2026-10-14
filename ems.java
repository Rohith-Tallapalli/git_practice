import java.util.*;

class emp_details{
    String emp_id;
    String emp_name;
    String dept;
    int salary;

    emp_details(String emp_id,String emp_name,String dept,int salary){
        this.emp_id=emp_id;
        this.emp_name=emp_name;
        this.dept=dept;
        this.salary=salary;
    }
}

public class ems{
    public static void main(String[] args) {
        List<emp_details> emp_list=new ArrayList<>();
        emp_list.add(new emp_details("E001", "Rohith", "IT", 50000));
        emp_list.add(new emp_details("E011", "Chintu", "IT", 55000));
        emp_list.add(new emp_details("E002", "Nivass", "Management", 65000));
        emp_list.add(new emp_details("E032", "Dinosaur", "IT", 90000));
        emp_list.add(new emp_details("E001", "Rohith", "IT", 50000));
        emp_list.add(new emp_details("E043", "KaSai", "IT", 80000));
        emp_list.add(new emp_details("E003", "Sai", "Finance", 55000));


        for(emp_details emp:emp_list){
           if(emp.dept.equals("IT")){
               System.out.println("Employee ID: "+emp.emp_id);
               System.out.println("Employee Name: "+emp.emp_name);
               System.out.println("Department: "+emp.dept);
               System.out.println("Salary: "+emp.salary);
               System.out.println();
           }
        }
        //highest salary employee
        int highest_salary = 0;
        for(emp_details emp:emp_list){
            if(emp.salary>highest_salary){
                highest_salary =emp.salary;
            }
        }
        for(emp_details emp:emp_list){
            if(emp.salary==highest_salary){
                System.out.println("Highest salaried emp is: "+emp.emp_id+"\nName:"+emp.emp_name+"\nSalary is:"+emp.salary+"\nFrom dept of "+emp.dept);
            }
        }

        //sorting
        for(int i=0;i<emp_list.size()-1;i++){
            if(emp_list.get(i).salary>emp_list.get(i+1).salary){
                emp_details temp=emp_list.get(i);
                emp_list.set(i,emp_list.get(i+1));
                emp_list.set(i+1,temp);
            }
        }
        System.out.println("\nEmployees after sorting:");
        for (emp_details emp : emp_list) {
            System.out.println("Employee ID: " + emp.emp_id);
            System.out.println("Employee Name: " + emp.emp_name);
            System.out.println("Department: " + emp.dept);
            System.out.println("Salary: " + emp.salary);
        }


       // Removing duplicates 
       Set<String> emp_ids = new HashSet<>();
       List<emp_details> unique_ems = new ArrayList<>();
       
       for (emp_details emp : emp_list) {
        if (emp_ids.add(emp.emp_id)) {
            unique_ems.add(emp);
        }
    }
    emp_list.clear();
    emp_list.addAll(unique_ems);

    System.out.println("Employees after removing duplicates:");
    for (emp_details emp : emp_list) {
        System.out.println("Employee ID: " + emp.emp_id);
        System.out.println("Employee Name: " + emp.emp_name);
        System.out.println("Department: " + emp.dept);
        System.out.println("Salary: " + emp.salary);
}

       // Count
       System.out.println("-------------------------");
       HashMap<String, Integer> dept_count = new HashMap<>();
       System.out.println("Employee count in each department:");
       for (emp_details emp : emp_list) {
        String dept = emp.dept;
        
        if (dept_count.containsKey(dept)) {
            dept_count.put(dept, dept_count.get(dept) + 1);
        } else {
            dept_count.put(dept, 1);
        }
        }

        for (String dept : dept_count.keySet()) {
             System.out.println(dept + ": " + dept_count.get(dept));
            }
}
}
