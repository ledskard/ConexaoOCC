package conexao.OCC.tarefa.model;

import java.sql.Date;
import java.util.List;

public class PaymentGroup {
	private Integer amountAuthorized;
	private Integer amount;
	private String gatewayName;
	private Object paymentProps;
	private String id;
	private String state;
	private Date submittedDate;
	private List<Object> debitStatus;
	private List<AuthorizationStatu> authorizationStatus;
	private String currencyCode;
	private String paymentType;
	
    
    public Integer getAmountAuthorized() {
		return amountAuthorized;
	}
	public void setAmountAuthorized(Integer amountAuthorized) {
		this.amountAuthorized = amountAuthorized;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public String getGatewayName() {
		return gatewayName;
	}
	public void setGatewayName(String gatewayName) {
		this.gatewayName = gatewayName;
	}
	public Object getPaymentProps() {
		return paymentProps;
	}
	public void setPaymentProps(Object paymentProps) {
		this.paymentProps = paymentProps;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Date getSubmittedDate() {
		return submittedDate;
	}
	public void setSubmittedDate(Date submittedDate) {
		this.submittedDate = submittedDate;
	}
	public List<Object> getDebitStatus() {
		return debitStatus;
	}
	public void setDebitStatus(List<Object> debitStatus) {
		this.debitStatus = debitStatus;
	}
	public List<AuthorizationStatu> getAuthorizationStatus() {
		return authorizationStatus;
	}
	public void setAuthorizationStatus(List<AuthorizationStatu> authorizationStatus) {
		this.authorizationStatus = authorizationStatus;
	}
	public String getCurrencyCode() {
		return currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	} 
}
