package reques;

public class User {
	String name;
	String age;
	String remark;

	public User(String name, String age, String remark) {
		super();
		this.name = name;
		this.age = age;
		this.remark = remark;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", remark=" + remark + "]";
	}

}
