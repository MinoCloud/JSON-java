package org.json;

/**
 * Used to hold a known valid JSON string in a JSON structure
 * without the overhead of parsing it first. 
 * @author Marcus Longmuir
 * @version 2013-03-01
 */
public class RawJSON {

	String rawJSON = null;

	public RawJSON(String string){
		this.rawJSON = string;
	}

	public void setString(String toSet){
		this.rawJSON = toSet;
	}

	public void useContentFrom(RawJSON other){
		this.rawJSON = other.rawJSON;
	}
	public void cloneJSONObject(JSONObject obj){
		this.rawJSON = obj.toString();
	}

	public String toString(){
		return this.rawJSON;
	}
}