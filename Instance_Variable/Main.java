
class Employee {
    String empName ;
    String eFather ;
    String eAddress;
    String eDepartment ;
    int esalary ;
    long eContact;
    void display(String empn,String fathername,String address,String department,int salary,long contact){
        empName=empn;
        eFather=fathername;
        eAddress = address;
        eDepartment=department;
        esalary=salary;
        eContact = contact;

        System.out.println("----------x----------");
        System.out.println("Name: "+empName+"\nFather's Name: "+eFather+"\nAddress: "+eAddress+
        "\nDepartMent: "+eDepartment+"\nSalary: "+esalary+"\nContact: "+eContact);
    }
}

class Main{
   public static void main(String[] args) {
        Employee p = new Employee();
        p.display("XYZ","ABC","abc sector-7","IT",35000,1234567890);
    }
}
/*6):Employe :class
instance variable 
empname
efather
eaddress
edepartment 
esalary 
econtact
want to print all the data through three ways  */