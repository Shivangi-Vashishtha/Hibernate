package com.Beginner.Hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Remittance {
	
	@Id
	int payment_id;
	
	String DbtrAcnt;
	int amt;
	BenName_Embeddable benNm;  // class name which will get firstName and lastNmae of Beneficiary
	String BenAcnt;
	String BIC;
	public String getDbtrAcnt() {
		return DbtrAcnt;
	}
	public void setDbtrAcnt(String dbtrAcnt) {
		DbtrAcnt = dbtrAcnt;
	}
	public int getAmt() {
		return amt;
	}
	public void setAmt(int amt) {
		this.amt = amt;
	}
		
	
	
	public BenName_Embeddable getBenNm() {
		return benNm;
	}
	public void setBenNm(BenName_Embeddable benNm) {
		this.benNm = benNm;
	}
	public String getBenAcnt() {
		return BenAcnt;
	}
	public void setBenAcnt(String benAcnt) {
		BenAcnt = benAcnt;
	}
	public String getBIC() {
		return BIC;
	}
	public void setBIC(String bIC) {
		BIC = bIC;
	}
	public int getPayment_id() {
		return payment_id;
	}
	public void setPayment_id(int payment_id) {
		this.payment_id = payment_id;
		
		
	}
	
	
	@Override
	public String toString() {
		return "Remittance [payment_id=" + payment_id + ", DbtrAcnt=" + DbtrAcnt + ", amt=" + amt + ", benNm=" + benNm
				+ ", BenAcnt=" + BenAcnt + ", BIC=" + BIC + "]";
	}
}
