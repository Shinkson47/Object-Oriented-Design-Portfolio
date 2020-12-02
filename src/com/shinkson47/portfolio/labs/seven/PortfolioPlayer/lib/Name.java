package com.shinkson47.portfolio.labs.seven.PortfolioPlayer.lib;

/**
 * A name has a first name and a family name.
 * There is an option to produce a full name by combining these.
 * 
 * @author Luke
 */
public class Name implements Comparable<Name> {

	//Fields
	private String firstName;
	private String familyName;
	
	
	//Constructors
	public Name() {
		firstName = "";
		familyName = "";
	}
	
	public Name(String firstName, String familyName) {
		this.firstName = firstName;
		this.familyName = familyName;
	}

    public static String sanitize(String name) {
		final String DEFAULT = "";

		if (name == null || name.equals(""))
			return DEFAULT;

		if (name.matches("([A-Z]([a-z])*)"))
			return name.substring(0,1).toUpperCase() + name.substring(1);
		else return DEFAULT;
    }


    //Methods
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getFamilyName() {
		return familyName;
	}

	public String getFullName() {
		if (firstName.equals("") && familyName.equals("")) {
			return "";
		} else {
			return firstName + " " + familyName;
		}
	}

	public String asEmail(){
		return asEmail("email.com");
	}

	public String asEmail(String Domain){
		return firstName.toLowerCase().charAt(0) + "." + familyName.toLowerCase().substring(0, 3) + "@" + Domain;
	}


	@Override
	public String toString() {
		return "Name:[firstName=" + firstName + ", familyName=" + familyName + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		// test exceptional cases, i.e. obj not null and is a Name
		if (obj == null || this.getClass() != obj.getClass())
			return false;

		Name other = (Name) obj; // downcast to a Name object

		// compare first & family names using String's .equals() method
		return this.familyName.equals(other.familyName)
			&& this.firstName.equals(other.firstName);
	}
	
	@Override
	public int compareTo(Name other) {
		int result = this.familyName.compareTo(other.familyName);
		
		if (result == 0) {
			result = this.firstName.compareTo(other.firstName);
		}
		
		return result;
	}
}
