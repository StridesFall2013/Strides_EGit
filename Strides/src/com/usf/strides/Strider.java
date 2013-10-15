package com.usf.strides;

import java.util.List;


// Strider Object
public class Strider {
	
	public Strider (String strider_name,
			String strider_password,
			String strider_email, 
			String strider_memo, 
			int strider_rating, 
			int strider_id, 
			List<String> strides_list,
			List<Strider> friends_list) 
	{
		super();
		this.strider_name     = strider_name;
		this.strider_password = strider_password;
		this.strider_email    = strider_email;
		this.strider_memo     = strider_memo;
		this.strider_rating   = strider_rating;
		this.strider_id       = strider_id;
		this.strides_list     = strides_list;
		this.friends_list     = friends_list;
	}
	
	public String getStriderName(){
		return strider_name;
	}
	
	public String getStriderPassword(){
		return strider_password;
	}
	
	public String getStriderEmail() {
		return strider_email;
	}
	
	public String getStriderMemo() {
		return strider_memo;
	}
	
	public int getStriderRating() {
		return strider_rating;
	}
	
	public int getStriderID() {
		return strider_id;
	}
	
	public List<String> getStridesList() {
		return strides_list;
	}
	
	public List<Strider> getFrienList() {
		return friends_list;
	}
	
	private String        strider_name;     // Striders name
	private String		  strider_password; // Striders password
	private String        strider_email;    // Striders email
	private String        strider_memo;	    // Memo for the profile
	private int       	  strider_rating;   // striders rating based on how many strides they complete (1-5) ((how_many_complete / strides_list.Count) % 5)
	private int           strider_id;	    // Strider ID
	private List<String>  strides_list;	    // List of strides the user has in their bank 
	private List<Strider> friends_list;		// Friend list of specific strider
}
