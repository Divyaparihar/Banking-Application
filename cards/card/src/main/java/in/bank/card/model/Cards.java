package in.bank.card.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Cards {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "card_id")
	private int cardId;
	
	@Column(name = "customer_id")
	private int customerId;
	
	@Column(name = "card_number")
	private int card_number;
	
	@Column(name = "card_type")
	private String cardType;
	
	@Column(name = "expiry_date")
	private LocalDate ExpiryDate;
	
	

	public int getCardId() {
		return cardId;
	}



	public void setCardId(int cardId) {
		this.cardId = cardId;
	}



	public int getCustomerId() {
		return customerId;
	}



	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}



	public int getCard_number() {
		return card_number;
	}



	public void setCard_number(int card_number) {
		this.card_number = card_number;
	}



	public String getCardType() {
		return cardType;
	}



	public void setCardType(String cardType) {
		this.cardType = cardType;
	}



	public LocalDate getExpiryDate() {
		return ExpiryDate;
	}



	public void setExpiryDate(LocalDate expiryDate) {
		ExpiryDate = expiryDate;
	}



	@Override
	public String toString() {
		return "Cards [cardId=" + cardId + ", customerId=" + customerId + ", card_number=" + card_number + ", cardType="
				+ cardType + ", ExpiryDate=" + ExpiryDate + "]";
	}

}
