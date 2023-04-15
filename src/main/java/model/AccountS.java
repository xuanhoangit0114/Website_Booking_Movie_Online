package model;

public class AccountS {
       private Long id;
       private String fullname;
       private String phone_number;
       private String password;
       private Long roleid;
	
	

	public AccountS(Long id, String fullname, String phone_number, String password, Long roleid) {
		super();
		this.id = id;
		this.fullname = fullname;
		this.phone_number = phone_number;
		this.password = password;
		this.roleid = roleid;
	}
	public Long getRoleid() {
		return roleid;
	}
	public void setRoleid(Long roleid) {
		this.roleid = roleid;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "AccountS [id=" + id + ", fullname=" + fullname + ", password=" + password + ", phone_number="
				+ phone_number + ", roleid=" + roleid + "]";
	}
	
}