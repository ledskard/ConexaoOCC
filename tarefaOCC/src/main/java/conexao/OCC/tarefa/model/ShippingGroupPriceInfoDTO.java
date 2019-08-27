package conexao.OCC.tarefa.model;

public class ShippingGroupPriceInfoDTO {
	private Integer secondaryCurrencyTaxAmount;
	private Boolean discounted;
	private Integer shippingTax;
	private Integer secondaryCurrencyShippingAmount;
	private Integer amount;
	private Integer rawShipping; 
	private Boolean amountIsFinal;
	private String currencyCode;
	
	
	public Integer getSecondaryCurrencyTaxAmount() {
		return secondaryCurrencyTaxAmount;
	}
	public void setSecondaryCurrencyTaxAmount(Integer secondaryCurrencyTaxAmount) {
		this.secondaryCurrencyTaxAmount = secondaryCurrencyTaxAmount;
	}
	public Boolean getDiscounted() {
		return discounted;
	}
	public void setDiscounted(Boolean discounted) {
		this.discounted = discounted;
	}
	public Integer getShippingTax() {
		return shippingTax;
	}
	public void setShippingTax(Integer shippingTax) {
		this.shippingTax = shippingTax;
	}
	public Integer getSecondaryCurrencyShippingAmount() {
		return secondaryCurrencyShippingAmount;
	}
	public void setSecondaryCurrencyShippingAmount(Integer secondaryCurrencyShippingAmount) {
		this.secondaryCurrencyShippingAmount = secondaryCurrencyShippingAmount;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public Integer getRawShipping() {
		return rawShipping;
	}
	public void setRawShipping(Integer rawShipping) {
		this.rawShipping = rawShipping;
	}
	public Boolean getAmountIsFinal() {
		return amountIsFinal;
	}
	public void setAmountIsFinal(Boolean amountIsFinal) {
		this.amountIsFinal = amountIsFinal;
	}
	public String getCurrencyCode() {
		return currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

}
