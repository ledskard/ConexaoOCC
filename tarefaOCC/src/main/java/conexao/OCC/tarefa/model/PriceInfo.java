package conexao.OCC.tarefa.model;

import java.util.List;

public class PriceInfo {
	private Boolean discounted;
    private Integer amount;
    private Integer secondaryCurrencyShippingSurcharge;
    private Double rawTotalPrice;
    private Double salePrice;
    private String priceListId;
    private Integer quantityDiscounted;
    private Boolean amountIsFinal;
    private Boolean onSale;
    private Integer shippingSurcharge;
    private Boolean discountable;
    private List<CurrentPriceDetailsSorted> currentPriceDetailsSorted;
    private String currencyCode;
    private Double listPrice;
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
	public Integer getSecondaryCurrencyShippingSurcharge() {
		return secondaryCurrencyShippingSurcharge;
	}
	public void setSecondaryCurrencyShippingSurcharge(Integer secondaryCurrencyShippingSurcharge) {
		this.secondaryCurrencyShippingSurcharge = secondaryCurrencyShippingSurcharge;
	}
	public Double getRawTotalPrice() {
		return rawTotalPrice;
	}
	public void setRawTotalPrice(Double rawTotalPrice) {
		this.rawTotalPrice = rawTotalPrice;
	}
	public Double getSalePrice() {
		return salePrice;
	}
	public void setSalePrice(Double salePrice) {
		this.salePrice = salePrice;
	}
	public String getPriceListId() {
		return priceListId;
	}
	public void setPriceListId(String priceListId) {
		this.priceListId = priceListId;
	}
	public Integer getQuantityDiscounted() {
		return quantityDiscounted;
	}
	public void setQuantityDiscounted(Integer quantityDiscounted) {
		this.quantityDiscounted = quantityDiscounted;
	}
	public Boolean getAmountIsFinal() {
		return amountIsFinal;
	}
	public void setAmountIsFinal(Boolean amountIsFinal) {
		this.amountIsFinal = amountIsFinal;
	}
	public Boolean getOnSale() {
		return onSale;
	}
	public void setOnSale(Boolean onSale) {
		this.onSale = onSale;
	}
	public Integer getShippingSurcharge() {
		return shippingSurcharge;
	}
	public void setShippingSurcharge(Integer shippingSurcharge) {
		this.shippingSurcharge = shippingSurcharge;
	}
	public Boolean getDiscountable() {
		return discountable;
	}
	public void setDiscountable(Boolean discountable) {
		this.discountable = discountable;
	}
	public List<CurrentPriceDetailsSorted> getCurrentPriceDetailsSorted() {
		return currentPriceDetailsSorted;
	}
	public void setCurrentPriceDetailsSorted(List<CurrentPriceDetailsSorted> currentPriceDetailsSorted) {
		this.currentPriceDetailsSorted = currentPriceDetailsSorted;
	}
	public String getCurrencyCode() {
		return currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	public Double getListPrice() {
		return listPrice;
	}
	public void setListPrice(Double listPrice) {
		this.listPrice = listPrice;
	}

}
