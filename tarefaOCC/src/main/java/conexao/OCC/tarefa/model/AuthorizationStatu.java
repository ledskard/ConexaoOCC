package conexao.OCC.tarefa.model;

import java.util.List;

public class AuthorizationStatu {
	private Integer amount;
    private StatusProps statusProps;
    private Boolean transactionSuccess;
    private Object errorMessage;
    private List<Object> externalStatusProps;
    private String transactionId;
    
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public StatusProps getStatusProps() {
		return statusProps;
	}
	public void setStatusProps(StatusProps statusProps) {
		this.statusProps = statusProps;
	}
	public Boolean getTransactionSuccess() {
		return transactionSuccess;
	}
	public void setTransactionSuccess(Boolean transactionSuccess) {
		this.transactionSuccess = transactionSuccess;
	}
	public Object getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(Object errorMessage) {
		this.errorMessage = errorMessage;
	}
	public List<Object> getExternalStatusProps() {
		return externalStatusProps;
	}
	public void setExternalStatusProps(List<Object> externalStatusProps) {
		this.externalStatusProps = externalStatusProps;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
    
}
