package conexao.OCC.tarefa.model;

public class CommerceItemRelationship {
	private Object availablePickupDate;
	private Object inventoryLocationId;
	private Integer amount;
	private Integer quantity;
	private Boolean pointOfNoRevision;
	private String relationshipType;
	private Integer returnedQuantity;
	private Object preferredPickupDate;
	private Range range; 
	private Object commerceItemExternalId;
	private String commerceItemId;
	private String state;
    
    public Range getRange() {
		return range;
	}
	public void setRange(Range range) {
		this.range = range;
	}
	public String id;
    
    
	public Object getAvailablePickupDate() {
		return availablePickupDate;
	}
	public void setAvailablePickupDate(Object availablePickupDate) {
		this.availablePickupDate = availablePickupDate;
	}
	public Object getInventoryLocationId() {
		return inventoryLocationId;
	}
	public void setInventoryLocationId(Object inventoryLocationId) {
		this.inventoryLocationId = inventoryLocationId;
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
	public Boolean getPointOfNoRevision() {
		return pointOfNoRevision;
	}
	public void setPointOfNoRevision(Boolean pointOfNoRevision) {
		this.pointOfNoRevision = pointOfNoRevision;
	}
	public String getRelationshipType() {
		return relationshipType;
	}
	public void setRelationshipType(String relationshipType) {
		this.relationshipType = relationshipType;
	}
	public Integer getReturnedQuantity() {
		return returnedQuantity;
	}
	public void setReturnedQuantity(Integer returnedQuantity) {
		this.returnedQuantity = returnedQuantity;
	}
	public Object getPreferredPickupDate() {
		return preferredPickupDate;
	}
	public void setPreferredPickupDate(Object preferredPickupDate) {
		this.preferredPickupDate = preferredPickupDate;
	}
	public Object getCommerceItemExternalId() {
		return commerceItemExternalId;
	}
	public void setCommerceItemExternalId(Object commerceItemExternalId) {
		this.commerceItemExternalId = commerceItemExternalId;
	}
	public String getCommerceItemId() {
		return commerceItemId;
	}
	public void setCommerceItemId(String commerceItemId) {
		this.commerceItemId = commerceItemId;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
}
