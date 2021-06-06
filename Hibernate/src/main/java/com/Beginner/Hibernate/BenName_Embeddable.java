package com.Beginner.Hibernate;

import javax.persistence.Embeddable;

@Embeddable
public class BenName_Embeddable {
	
	String FirstName;
	String LastNmae;
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastNmae() {
		return LastNmae;
	}
	public void setLastNmae(String lastNmae) {
		LastNmae = lastNmae;
	}
	@Override
	public String toString() {
		return "BenName_Embeddable [FirstName=" + FirstName + ", LastNmae=" + LastNmae + "]";
	}
	

}
