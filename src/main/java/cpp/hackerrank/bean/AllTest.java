package cpp.hackerrank.bean;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AllTest {
	@SerializedName("data")
	@Expose
	private List<Test> data = null;
	@SerializedName("page_total")
	@Expose
	private int pageTotal;
	@SerializedName("offset")
	@Expose
	private int offset;
	@SerializedName("previous")
	@Expose
	private String previous;
	@SerializedName("next")
	@Expose
	private String next;
	@SerializedName("first")
	@Expose
	private String first;
	@SerializedName("last")
	@Expose
	private String last;
	@SerializedName("total")
	@Expose
	private int total;
	
	/**
	 * @return the data
	 */
	public List<Test> getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(List<Test> data) {
		this.data = data;
	}
	/**
	 * @return the pageTotal
	 */
	public int getPageTotal() {
		return pageTotal;
	}
	/**
	 * @param pageTotal the pageTotal to set
	 */
	public void setPageTotal(int pageTotal) {
		this.pageTotal = pageTotal;
	}
	/**
	 * @return the offset
	 */
	public int getOffset() {
		return offset;
	}
	/**
	 * @param offset the offset to set
	 */
	public void setOffset(int offset) {
		this.offset = offset;
	}
	/**
	 * @return the previous
	 */
	public String getPrevious() {
		return previous;
	}
	/**
	 * @param previous the previous to set
	 */
	public void setPrevious(String previous) {
		this.previous = previous;
	}
	/**
	 * @return the next
	 */
	public String getNext() {
		return next;
	}
	/**
	 * @param next the next to set
	 */
	public void setNext(String next) {
		this.next = next;
	}
	/**
	 * @return the first
	 */
	public String getFirst() {
		return first;
	}
	/**
	 * @param first the first to set
	 */
	public void setFirst(String first) {
		this.first = first;
	}
	/**
	 * @return the last
	 */
	public String getLast() {
		return last;
	}
	/**
	 * @param last the last to set
	 */
	public void setLast(String last) {
		this.last = last;
	}
	/**
	 * @return the total
	 */
	public int getTotal() {
		return total;
	}
	/**
	 * @param total the total to set
	 */
	public void setTotal(int total) {
		this.total = total;
	}
}
