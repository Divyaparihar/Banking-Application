package in.bank.loans.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Loans {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "loan_number")
	private int loanNumber;
	
	@Column(name = "customer_id")
	private int customerId;
	
	@Column(name = "loan_type")
	private String loan_type;
	
	@Column(name = "loan_amount ")
	private int loan_amount;
	
	@Column(name = "loan_end_date ")
	private LocalDate loan_end_date;
	
	public int getLoanNumber() {
		return loanNumber;
	}
	public void setLoanNumber(int loanNumber) {
		this.loanNumber = loanNumber;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getLoan_type() {
		return loan_type;
	}
	public void setLoan_type(String loan_type) {
		this.loan_type = loan_type;
	}
	public int getLoan_amount() {
		return loan_amount;
	}
	public void setLoan_amount(int loan_amount) {
		this.loan_amount = loan_amount;
	}
	public LocalDate getLoan_end_date() {
		return loan_end_date;
	}
	public void setLoan_end_date(LocalDate loan_end_date) {
		this.loan_end_date = loan_end_date;
	}
	@Override
	public String toString() {
		return "Customer [loanNumber=" + loanNumber + ", customerId=" + customerId + ", loan_type=" + loan_type
				+ ", loan_amount=" + loan_amount + ", loan_end_date=" + loan_end_date + "]";
	}
	
	
}
