package conexao.OCC.tarefa.model;

public class CurrentPriceDetailsSorted {
	private Integer secondaryCurrencyTaxAmount;
    private Boolean discounted;
    private Integer amount;
    private Integer quantity;
    private Boolean amountIsFinal;
    private Range range;
    private Integer tax;
    private Integer orderDiscountShare;
    private Integer detailedUnitPrice;
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
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Boolean getAmountIsFinal() {
		return amountIsFinal;
	}
	public void setAmountIsFinal(Boolean amountIsFinal) {
		this.amountIsFinal = amountIsFinal;
	}
	public Range getRange() {
		return range;
	}
	public void setRange(Range range) {
		this.range = range;
	}
	public Integer getTax() {
		return tax;
	}
	public void setTax(Integer tax) {
		this.tax = tax;
	}
	public Integer getOrderDiscountShare() {
		return orderDiscountShare;
	}
	public void setOrderDiscountShare(Integer orderDiscountShare) {
		this.orderDiscountShare = orderDiscountShare;
	}
	public Integer getDetailedUnitPrice() {
		return detailedUnitPrice;
	}
	public void setDetailedUnitPrice(Integer detailedUnitPrice) {
		this.detailedUnitPrice = detailedUnitPrice;
	}
	public String getCurrencyCode() {
		return currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
   
}
