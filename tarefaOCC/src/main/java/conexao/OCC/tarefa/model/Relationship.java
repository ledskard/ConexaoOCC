package conexao.OCC.tarefa.model;

public class Relationship {
	private String paymentGroupId;
	private Integer amount;
	private String relationshipType;
	private String id;
    
	public String getPaymentGroupId() {
		return paymentGroupId;
	}
	public void setPaymentGroupId(String paymentGroupId) {
		this.paymentGroupId = paymentGroupId;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public String getRelationshipType() {
		return relationshipType;
	}
	public void setRelationshipType(String relationshipType) {
		this.relationshipType = relationshipType;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
}
