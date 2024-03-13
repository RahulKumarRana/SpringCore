package lifeCycleMethods;

public class Declration implements Intialization,DisposableBean {
    private String Name;
    private int rollNo;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	@Override
	public String toString() {
		return "Declration [Name=" + Name + ", rollNo=" + rollNo + "]";
	}
	public Declration() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    public void init() {
    	System.out.println("Your are in intit method.....");
    }
    public void destroy() {
    	System.out.println("Object is now destroying..");
    }
}
