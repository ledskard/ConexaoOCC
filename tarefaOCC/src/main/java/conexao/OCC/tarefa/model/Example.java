package conexao.OCC.tarefa.model;

import java.sql.Date;
import java.util.List;

public class Example {
	private Boolean gwp;
    private String secondaryCurrencyCode;
    private Date submittedDate;
    private String salesChannel;
    private Object configuratorId;
    private String uuid;
    private Object organizationId;
    private List<Relationship> relationships;
    private Integer exchangeRate;
    private List<Link> links;
    private String id;
    private String state;
    private Boolean taxCalculated;
    private Object combinedPriceInfos;
    private List<CommerceItem> commerceItems;
    private List<ShippingGroup> shippingGroups;
    private Object freezeDate;
    private Boolean taxExempt;
    private Object profile;
    private Object queuedOrderSubmitData;
    private String cartName;
    private Boolean paymentInitiatedEmailSent;
    private Boolean payShippingInSecondaryCurrency;
    private Integer shippingGroupCount;
    private Object taxExemptionCode;
    private Object createdByOrderId;
    private String orderAction;
    private String esf_status;
    private List<Object> submissionErrorMessages;
    private String profileId;
    private Object activeQuoteOrderId;
    private List<Object> approverIds;
    private Object agentId;
    private Long lastModifiedTime;
    private String priceGroupId;
    private Long creationTime;
    private String sourceSystem;
    private List<Object> gwpMarkers;
    private String esf_additionalInfo;
    private String locale;
    private List<PaymentGroup> paymentGroups;
    private Boolean payTaxInSecondaryCurrency;
    private ShippingGroupPriceInfoDTO priceInfo;
    private List<Object> submissionProgress;
    private String catalogId;
    private Object esf_omsSubOrders;
    private Integer totalCommerceItemCount;
    private Boolean externalContext;
    private Object cancelReason;
    private Object quoteInfo;
    private TaxPriceInfo taxPriceInfo;
    private Date lastModifiedDate;
    private List<Object> approvalSystemMessages;
    private List<Object> approverMessages;
    private Integer paymentGroupCount;
    private List<Object> submissionErrorCodes;
    private Object recurringChargePriceInfo;
    private Object organization;
    private String siteId;   
    
	public Boolean getGwp() {
		return gwp;
	}
	public void setGwp(Boolean gwp) {
		this.gwp = gwp;
	}
	public String getSecondaryCurrencyCode() {
		return secondaryCurrencyCode;
	}
	public void setSecondaryCurrencyCode(String secondaryCurrencyCode) {
		this.secondaryCurrencyCode = secondaryCurrencyCode;
	}
	public Date getSubmittedDate() {
		return submittedDate;
	}
	public void setSubmittedDate(Date submittedDate) {
		this.submittedDate = submittedDate;
	}
	public String getSalesChannel() {
		return salesChannel;
	}
	public void setSalesChannel(String salesChannel) {
		this.salesChannel = salesChannel;
	}
	public Object getConfiguratorId() {
		return configuratorId;
	}
	public void setConfiguratorId(Object configuratorId) {
		this.configuratorId = configuratorId;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public Object getOrganizationId() {
		return organizationId;
	}
	public void setOrganizationId(Object organizationId) {
		this.organizationId = organizationId;
	}
	public List<Relationship> getRelationships() {
		return relationships;
	}
	public void setRelationships(List<Relationship> relationships) {
		this.relationships = relationships;
	}
	public Integer getExchangeRate() {
		return exchangeRate;
	}
	public void setExchangeRate(Integer exchangeRate) {
		this.exchangeRate = exchangeRate;
	}
	public List<Link> getLinks() {
		return links;
	}
	public void setLinks(List<Link> links) {
		this.links = links;
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
	public Boolean getTaxCalculated() {
		return taxCalculated;
	}
	public void setTaxCalculated(Boolean taxCalculated) {
		this.taxCalculated = taxCalculated;
	}
	public Object getCombinedPriceInfos() {
		return combinedPriceInfos;
	}
	public void setCombinedPriceInfos(Object combinedPriceInfos) {
		this.combinedPriceInfos = combinedPriceInfos;
	}
	public List<CommerceItem> getCommerceItems() {
		return commerceItems;
	}
	public void setCommerceItems(List<CommerceItem> commerceItems) {
		this.commerceItems = commerceItems;
	}
	public List<ShippingGroup> getShippingGroups() {
		return shippingGroups;
	}
	public void setShippingGroups(List<ShippingGroup> shippingGroups) {
		this.shippingGroups = shippingGroups;
	}
	public Object getFreezeDate() {
		return freezeDate;
	}
	public void setFreezeDate(Object freezeDate) {
		this.freezeDate = freezeDate;
	}
	public Boolean getTaxExempt() {
		return taxExempt;
	}
	public void setTaxExempt(Boolean taxExempt) {
		this.taxExempt = taxExempt;
	}
	public Object getProfile() {
		return profile;
	}
	public void setProfile(Object profile) {
		this.profile = profile;
	}
	public Object getQueuedOrderSubmitData() {
		return queuedOrderSubmitData;
	}
	public void setQueuedOrderSubmitData(Object queuedOrderSubmitData) {
		this.queuedOrderSubmitData = queuedOrderSubmitData;
	}
	public String getCartName() {
		return cartName;
	}
	public void setCartName(String cartName) {
		this.cartName = cartName;
	}
	public Boolean getPaymentInitiatedEmailSent() {
		return paymentInitiatedEmailSent;
	}
	public void setPaymentInitiatedEmailSent(Boolean paymentInitiatedEmailSent) {
		this.paymentInitiatedEmailSent = paymentInitiatedEmailSent;
	}
	public Boolean getPayShippingInSecondaryCurrency() {
		return payShippingInSecondaryCurrency;
	}
	public void setPayShippingInSecondaryCurrency(Boolean payShippingInSecondaryCurrency) {
		this.payShippingInSecondaryCurrency = payShippingInSecondaryCurrency;
	}
	public Integer getShippingGroupCount() {
		return shippingGroupCount;
	}
	public void setShippingGroupCount(Integer shippingGroupCount) {
		this.shippingGroupCount = shippingGroupCount;
	}
	public Object getTaxExemptionCode() {
		return taxExemptionCode;
	}
	public void setTaxExemptionCode(Object taxExemptionCode) {
		this.taxExemptionCode = taxExemptionCode;
	}
	public Object getCreatedByOrderId() {
		return createdByOrderId;
	}
	public void setCreatedByOrderId(Object createdByOrderId) {
		this.createdByOrderId = createdByOrderId;
	}
	public String getOrderAction() {
		return orderAction;
	}
	public void setOrderAction(String orderAction) {
		this.orderAction = orderAction;
	}
	public String getEsf_status() {
		return esf_status;
	}
	public void setEsf_status(String esf_status) {
		this.esf_status = esf_status;
	}
	public List<Object> getSubmissionErrorMessages() {
		return submissionErrorMessages;
	}
	public void setSubmissionErrorMessages(List<Object> submissionErrorMessages) {
		this.submissionErrorMessages = submissionErrorMessages;
	}
	public String getProfileId() {
		return profileId;
	}
	public void setProfileId(String profileId) {
		this.profileId = profileId;
	}
	public Object getActiveQuoteOrderId() {
		return activeQuoteOrderId;
	}
	public void setActiveQuoteOrderId(Object activeQuoteOrderId) {
		this.activeQuoteOrderId = activeQuoteOrderId;
	}
	public List<Object> getApproverIds() {
		return approverIds;
	}
	public void setApproverIds(List<Object> approverIds) {
		this.approverIds = approverIds;
	}
	public Object getAgentId() {
		return agentId;
	}
	public void setAgentId(Object agentId) {
		this.agentId = agentId;
	}
	public Long getLastModifiedTime() {
		return lastModifiedTime;
	}
	public void setLastModifiedTime(Long lastModifiedTime) {
		this.lastModifiedTime = lastModifiedTime;
	}
	public String getPriceGroupId() {
		return priceGroupId;
	}
	public void setPriceGroupId(String priceGroupId) {
		this.priceGroupId = priceGroupId;
	}
	public Long getCreationTime() {
		return creationTime;
	}
	public void setCreationTime(Long creationTime) {
		this.creationTime = creationTime;
	}
	public String getSourceSystem() {
		return sourceSystem;
	}
	public void setSourceSystem(String sourceSystem) {
		this.sourceSystem = sourceSystem;
	}
	public List<Object> getGwpMarkers() {
		return gwpMarkers;
	}
	public void setGwpMarkers(List<Object> gwpMarkers) {
		this.gwpMarkers = gwpMarkers;
	}
	public String getEsf_additionalInfo() {
		return esf_additionalInfo;
	}
	public void setEsf_additionalInfo(String esf_additionalInfo) {
		this.esf_additionalInfo = esf_additionalInfo;
	}
	public String getLocale() {
		return locale;
	}
	public void setLocale(String locale) {
		this.locale = locale;
	}
	public List<PaymentGroup> getPaymentGroups() {
		return paymentGroups;
	}
	public void setPaymentGroups(List<PaymentGroup> paymentGroups) {
		this.paymentGroups = paymentGroups;
	}
	public Boolean getPayTaxInSecondaryCurrency() {
		return payTaxInSecondaryCurrency;
	}
	public void setPayTaxInSecondaryCurrency(Boolean payTaxInSecondaryCurrency) {
		this.payTaxInSecondaryCurrency = payTaxInSecondaryCurrency;
	}
	public ShippingGroupPriceInfoDTO getPriceInfo() {
		return priceInfo;
	}
	public void setPriceInfo(ShippingGroupPriceInfoDTO priceInfo) {
		this.priceInfo = priceInfo;
	}
	public List<Object> getSubmissionProgress() {
		return submissionProgress;
	}
	public void setSubmissionProgress(List<Object> submissionProgress) {
		this.submissionProgress = submissionProgress;
	}
	public String getCatalogId() {
		return catalogId;
	}
	public void setCatalogId(String catalogId) {
		this.catalogId = catalogId;
	}
	public Object getEsf_omsSubOrders() {
		return esf_omsSubOrders;
	}
	public void setEsf_omsSubOrders(Object esf_omsSubOrders) {
		this.esf_omsSubOrders = esf_omsSubOrders;
	}
	public Integer getTotalCommerceItemCount() {
		return totalCommerceItemCount;
	}
	public void setTotalCommerceItemCount(Integer totalCommerceItemCount) {
		this.totalCommerceItemCount = totalCommerceItemCount;
	}
	public Boolean getExternalContext() {
		return externalContext;
	}
	public void setExternalContext(Boolean externalContext) {
		this.externalContext = externalContext;
	}
	public Object getCancelReason() {
		return cancelReason;
	}
	public void setCancelReason(Object cancelReason) {
		this.cancelReason = cancelReason;
	}
	public Object getQuoteInfo() {
		return quoteInfo;
	}
	public void setQuoteInfo(Object quoteInfo) {
		this.quoteInfo = quoteInfo;
	}
	public TaxPriceInfo getTaxPriceInfo() {
		return taxPriceInfo;
	}
	public void setTaxPriceInfo(TaxPriceInfo taxPriceInfo) {
		this.taxPriceInfo = taxPriceInfo;
	}
	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}
	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}
	public List<Object> getApprovalSystemMessages() {
		return approvalSystemMessages;
	}
	public void setApprovalSystemMessages(List<Object> approvalSystemMessages) {
		this.approvalSystemMessages = approvalSystemMessages;
	}
	public List<Object> getApproverMessages() {
		return approverMessages;
	}
	public void setApproverMessages(List<Object> approverMessages) {
		this.approverMessages = approverMessages;
	}
	public Integer getPaymentGroupCount() {
		return paymentGroupCount;
	}
	public void setPaymentGroupCount(Integer paymentGroupCount) {
		this.paymentGroupCount = paymentGroupCount;
	}
	public List<Object> getSubmissionErrorCodes() {
		return submissionErrorCodes;
	}
	public void setSubmissionErrorCodes(List<Object> submissionErrorCodes) {
		this.submissionErrorCodes = submissionErrorCodes;
	}
	public Object getRecurringChargePriceInfo() {
		return recurringChargePriceInfo;
	}
	public void setRecurringChargePriceInfo(Object recurringChargePriceInfo) {
		this.recurringChargePriceInfo = recurringChargePriceInfo;
	}
	public Object getOrganization() {
		return organization;
	}
	public void setOrganization(Object organization) {
		this.organization = organization;
	}
	public String getSiteId() {
		return siteId;
	}
	public void setSiteId(String siteId) {
		this.siteId = siteId;
	}
}
