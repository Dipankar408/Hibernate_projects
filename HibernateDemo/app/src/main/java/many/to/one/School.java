package many.to.one;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="schools")
public class School {
	
	@Id
	private int scl_id;
	private String scl_name;
	public int getScl_id() {
		return scl_id;
	}
	public void setScl_id(int scl_id) {
		this.scl_id = scl_id;
	}
	public String getScl_name() {
		return scl_name;
	}
	public void setScl_name(String scl_name) {
		this.scl_name = scl_name;
	}
	
	

}
