package in.bank.insurance.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class Insurance {


	@Column(name = "customer_id")
	int customerId;
	
	@Column(name = "insurance_type")
	String insuranceType;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "insured_amount")
	int insuredAmount;
	
	@Column(name = "insurance_end_date")
	String insuranceEndDate;
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getInsuranceType() {
		return insuranceType;
	}
	public void setInsuranceType(String insuranceType) {
		this.insuranceType = insuranceType;
	}
	public int getInsuredAmount() {
		return insuredAmount;
	}
	public void setInsuredAmount(int insuredAmount) {
		this.insuredAmount = insuredAmount;
	}
	public String getInsuranceEndDate() {
		return insuranceEndDate;
	}
	public void setInsuranceEndDate(String insuranceEndDate) {
		this.insuranceEndDate = insuranceEndDate;
	}
	@Override
	public String toString() {
		return "Insurance [customerId=" + customerId + ", insuranceType=" + insuranceType + ", insuredAmount="
				+ insuredAmount + ", insuranceEndDate=" + insuranceEndDate + "]";
	}
	
}
