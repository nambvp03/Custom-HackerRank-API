package cpp.hackerrank.bean;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Test {
	@SerializedName("id")
	@Expose
	private String id;
	/*@SerializedName("unique_id")
	@Expose
	private String uniqueId;*/
	@SerializedName("name")
	@Expose
	private String name;
	/*@SerializedName("duration")
	@Expose
	private int duration;
	@SerializedName("owner")
	@Expose
	private String owner;
	@SerializedName("instructions")
	@Expose
	private String instructions;
	@SerializedName("created_at")
	@Expose
	private String createdAt;
	@SerializedName("state")
	@Expose
	private String state;
	@SerializedName("locked")
	@Expose
	private boolean locked;
	@SerializedName("starred")
	@Expose
	private boolean starred;
	@SerializedName("start_time")
	@Expose
	private Object startTime;
	@SerializedName("end_time")
	@Expose
	private Object endTime;
	@SerializedName("questions")
	@Expose
	private List<String> questions = null;
	@SerializedName("sections")
	@Expose
	private Object sections;
	@SerializedName("tags")
	@Expose
	private List<Object> tags = null;*/
	
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
}
