package conexao.OCC.tarefa.model;

import java.util.List;

public class ShippingGroup {
	private String shippingMethod;
	private String description;
	private Object submittedDate;
	private Object shipOnDate;
	private Object actualShipDate;
	private List<Object> trackingInfo;
	private Object specialInstructions;
	private ShippingAddress shippingAddress;
	private List<CommerceItemRelationship> commerceItemRelationships;
	private String state;
	private String id;
	private Object stateDetail;
	private Object trackingNumber;
	private List<Object> handlingInstructions;
	private String shippingGroupClassType;
    
    
	public String getShippingMethod() {
		return shippingMethod;
	}
	public void setShippingMethod(String shippingMethod) {
		this.shippingMethod = shippingMethod;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Object getSubmittedDate() {
		return submittedDate;
	}
	public void setSubmittedDate(Object submittedDate) {
		this.submittedDate = submittedDate;
	}
	public Object getShipOnDate() {
		return shipOnDate;
	}
	public void setShipOnDate(Object shipOnDate) {
		this.shipOnDate = shipOnDate;
	}
	public Object getActualShipDate() {
		return actualShipDate;
	}
	public void setActualShipDate(Object actualShipDate) {
		this.actualShipDate = actualShipDate;
	}
	public List<Object> getTrackingInfo() {
		return trackingInfo;
	}
	public void setTrackingInfo(List<Object> trackingInfo) {
		this.trackingInfo = trackingInfo;
	}
	public Object getSpecialInstructions() {
		return specialInstructions;
	}
	public void setSpecialInstructions(Object specialInstructions) {
		this.specialInstructions = specialInstructions;
	}
	public ShippingAddress getShippingAddress() {
		return shippingAddress;
	}
	public void setShippingAddress(ShippingAddress shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	public List<CommerceItemRelationship> getCommerceItemRelationships() {
		return commerceItemRelationships;
	}
	public void setCommerceItemRelationships(List<CommerceItemRelationship> commerceItemRelationships) {
		this.commerceItemRelationships = commerceItemRelationships;
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
	public Object getStateDetail() {
		return stateDetail;
	}
	public void setStateDetail(Object stateDetail) {
		this.stateDetail = stateDetail;
	}
	public Object getTrackingNumber() {
		return trackingNumber;
	}
	public void setTrackingNumber(Object trackingNumber) {
		this.trackingNumber = trackingNumber;
	}
	public List<Object> getHandlingInstructions() {
		return handlingInstructions;
	}
	public void setHandlingInstructions(List<Object> handlingInstructions) {
		this.handlingInstructions = handlingInstructions;
	}
	public String getShippingGroupClassType() {
		return shippingGroupClassType;
	}
	public void setShippingGroupClassType(String shippingGroupClassType) {
		this.shippingGroupClassType = shippingGroupClassType;
	}
}

