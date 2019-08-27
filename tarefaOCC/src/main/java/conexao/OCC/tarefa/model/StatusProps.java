package conexao.OCC.tarefa.model;

import java.sql.Date;

public class StatusProps {
	private String hostTransactionTimestamp;
	private String responseReason;
	private String responseDescription;
	private String hostTransactionId;
    private String currencyCode;
    private String occs_tx_id;
    private Date occs_tx_timestamp;
    private String responseCode;
	
    public String getHostTransactionTimestamp() {
		return hostTransactionTimestamp;
	}
	public void setHostTransactionTimestamp(String hostTransactionTimestamp) {
		this.hostTransactionTimestamp = hostTransactionTimestamp;
	}
	public String getResponseReason() {
		return responseReason;
	}
	public void setResponseReason(String responseReason) {
		this.responseReason = responseReason;
	}
	public String getResponseDescription() {
		return responseDescription;
	}
	public void setResponseDescription(String responseDescription) {
		this.responseDescription = responseDescription;
	}
	public String getHostTransactionId() {
		return hostTransactionId;
	}
	public void setHostTransactionId(String hostTransactionId) {
		this.hostTransactionId = hostTransactionId;
	}
	public String getCurrencyCode() {
		return currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	public String getOccs_tx_id() {
		return occs_tx_id;
	}
	public void setOccs_tx_id(String occs_tx_id) {
		this.occs_tx_id = occs_tx_id;
	}
	public Date getOccs_tx_timestamp() {
		return occs_tx_timestamp;
	}
	public void setOccs_tx_timestamp(Date occs_tx_timestamp) {
		this.occs_tx_timestamp = occs_tx_timestamp;
	}
	public String getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}
}
