/**
 * 
 */
package Implement_OOPS_using_JAVA_with_Data_Structures_and_Beyond;

/**
 * @author libelef
 *
 */
import java.util.*;
public class File {

	/**
	 * 
	 */
	
	private String name;
	private float  size;
	private String ext;
	
	
	
	public File() {
		// TODO Auto-generated constructor stub
	}
	
	public String getExt() {
		return ext;
	}
	public String getName() {
		return name;
	}
	public float getSize() {
		return size;
	}
	
	
	public void setExt(String ext) {
		this.ext = ext;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSize(float size) {
		this.size = size;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
