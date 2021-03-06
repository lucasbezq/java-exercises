package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	private Date manufacturerDate;

	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, Double price, Date manufacturerDate) {
		super(name, price);
		this.manufacturerDate = manufacturerDate;
	}

	public Date getManufacturerDate() {
		return manufacturerDate;
	}

	public void setManufacturerDate(Date manufacturerDate) {
		this.manufacturerDate = manufacturerDate;
	}
	
	@Override
	public String priceTag() {
		return super.getName()
				+ " (used)"
				+ String.format(", $%.2f", super.getPrice())
				+ " (Manufacturer date: " + sdf.format(manufacturerDate)
				+ ")";
	}

}
