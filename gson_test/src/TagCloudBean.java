
public class TagCloudBean {
	private String name;
	private int id;
	private int support;
	
	//ctor
	public TagCloudBean(String _name, int _id, int _sup) {
		name=_name;
		id=_id;
		support=_sup;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSupport() {
		return support;
	}
	public void setSupport(int support) {
		this.support = support;
	}
	
}
