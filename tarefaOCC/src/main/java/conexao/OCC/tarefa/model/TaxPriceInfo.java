package conexao.OCC.tarefa.model;

public class TaxPriceInfo {
	private Integer secondaryCurrencyTaxAmount;
	private Boolean discounted;
	private Integer valueAddedTax;
	private Integer amount;
	private Integer countyTax;
	private Boolean isTaxIncluded;
	private Integer miscTax;
	private Integer districtTax;
	private Integer stateTax;
	private Object miscTaxInfo;
	private Integer countryTax;
	private Integer cityTax;
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
	public Integer getValueAddedTax() {
		return valueAddedTax;
	}
	public void setValueAddedTax(Integer valueAddedTax) {
		this.valueAddedTax = valueAddedTax;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public Integer getCountyTax() {
		return countyTax;
	}
	public void setCountyTax(Integer countyTax) {
		this.countyTax = countyTax;
	}
	public Boolean getIsTaxIncluded() {
		return isTaxIncluded;
	}
	public void setIsTaxIncluded(Boolean isTaxIncluded) {
		this.isTaxIncluded = isTaxIncluded;
	}
	public Integer getMiscTax() {
		return miscTax;
	}
	public void setMiscTax(Integer miscTax) {
		this.miscTax = miscTax;
	}
	public Integer getDistrictTax() {
		return districtTax;
	}
	public void setDistrictTax(Integer districtTax) {
		this.districtTax = districtTax;
	}
	public Integer getStateTax() {
		return stateTax;
	}
	public void setStateTax(Integer stateTax) {
		this.stateTax = stateTax;
	}
	public Object getMiscTaxInfo() {
		return miscTaxInfo;
	}
	public void setMiscTaxInfo(Object miscTaxInfo) {
		this.miscTaxInfo = miscTaxInfo;
	}
	public Integer getCountryTax() {
		return countryTax;
	}
	public void setCountryTax(Integer countryTax) {
		this.countryTax = countryTax;
	}
	public Integer getCityTax() {
		return cityTax;
	}
	public void setCityTax(Integer cityTax) {
		this.cityTax = cityTax;
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
