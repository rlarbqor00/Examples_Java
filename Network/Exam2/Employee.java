package Network.Exam2;

import java.io.Serializable;

public class Employee implements Serializable {
    String name;
    String addr;
    String jumin;
    String phone;

    public Employee(String name, String addr, String jumin, String phone) {
        this.name = name;
        this.addr = addr;
        this.jumin = jumin;
        this.phone = phone;


    }
    public String getName() {
        return name;

    }
    public String getAddr() {
        return addr;

    }
    public String getJumin() {
        return jumin;

    }
    public String getPhone() {
        return phone;
        
    }

}

    

