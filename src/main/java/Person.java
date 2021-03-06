
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int pid;
private String name;
private String email;
private String phone;
@OneToOne(mappedBy = "person")
private Pan pan;
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public Pan getPan() {
	return pan;
}
public void setPan(Pan pan) {
	this.pan = pan;
}


}
