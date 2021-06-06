package com.Beginner.Hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Remittance {
	
	@Id
	int payment_id;
	
	String DbtrAcnt;
	int amt;
	String benNm;
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
	public String getBenNm() {
		return benNm;
	}
	public void setBenNm(String benNm) {
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
}