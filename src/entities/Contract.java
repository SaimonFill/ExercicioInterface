package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {

	private Integer number;
	private Date date;
	private Double totalValue;
	
	List<Installment> installments = new ArrayList<Installment>();

	public Contract() {
	}
	
	public Contract(Integer numberInteger, Date date, Double totalValue) {
		this.number = numberInteger;
		this.date = date;
		this.totalValue = totalValue;
	}

	public Integer getNumberInteger() {
		return number;
	}

	public void setNumberInteger(Integer numberInteger) {
		this.number = numberInteger;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public List<Installment> getInstallments() {
		return installments;
	}
	
}
