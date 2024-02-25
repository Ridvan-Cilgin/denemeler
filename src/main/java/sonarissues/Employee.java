package sonarissues;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Employee implements Serializable, Cloneable {

    private static final long serialVersionUID = 1L;
    public String name = null;
    public Date joinDate = null;

    public Employee() {
        super();
    }

    public Employee(String name, Date joinDate) {
        super();
        this.name = name;
        this.joinDate = joinDate;
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Date getJoinDate() {
//        return joinDate;
//    }
//
//    public void setJoinDate(Date joinDate) {
//        this.joinDate = joinDate;
//    }
}
