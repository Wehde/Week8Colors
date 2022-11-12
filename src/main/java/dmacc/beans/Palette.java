/**
 * @author Kilian Wehde - kewehde
 * CIS175 - Fall 2022
 * Oct 20, 2022
 */
package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Palette {
	//Variables
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private int count;
	private String colors; //Planning on joining with HexColor in next weeks assignment. That is if I can get a list to work..
	
	//Getters and Setters
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
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
	/**
	 * @return the count
	 */
	public int getCount() {
		return count;
	}
	/**
	 * @param count the count to set
	 */
	public void setCount(int count) {
		this.count = count;
	}
	/**
	 * @return the colors
	 */
	public String getColors() {
		return colors;
	}
	/**
	 * @param colors the colors to set
	 */
	public void setColors(String colors) {
		this.colors = colors;
	}
	
	//Constructors
	/**
	 * 
	 */
	public Palette() {
		super();
	}
	/**
	 * @param name
	 */
	public Palette(String name) {
		super();
		this.name = name;
	}
	/**
	 * @param name
	 * @param count
	 * @param colors
	 */
	public Palette(String name, int count, String colors) {
		super();
		this.name = name;
		this.count = count;
		this.colors = colors;
	}
	/**
	 * @param id
	 * @param name
	 * @param count
	 * @param colors
	 */
	public Palette(long id, String name, int count, String colors) {
		super();
		this.id = id;
		this.name = name;
		this.count = count;
		this.colors = colors;
	}
	
	//Methods
	@Override
	public String toString() {
		return "Palette [id=" + id + ", name=" + name + ", count=" + count + ", colors=" + colors + "]";
	}
	
	
	
	

}
