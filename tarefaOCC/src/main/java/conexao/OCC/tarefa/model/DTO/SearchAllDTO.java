package conexao.OCC.tarefa.model.DTO;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import conexao.OCC.tarefa.model.Example;
import conexao.OCC.tarefa.model.Link;
import conexao.OCC.tarefa.model.Sort;

public class SearchAllDTO {
	@JsonProperty("total")
	private Integer total;
	@JsonProperty("totalResults")
	private Integer totalResults;
	@JsonProperty("offset")
	private Integer offset;
	@JsonProperty("limit")
	private Integer limit;
	@JsonProperty("links")
	private List<Link> links;
	@JsonProperty("sort")
	private List<Sort> sorts;
	@JsonProperty("items")
	private List<Example> items;
	
	public List<Example> getItems() {
		return items;
	}
	public void setItems(List<Example> items) {
		this.items = items;
	}
	public List<Sort> getSorts() {
		return sorts;
	}
	public void setSorts(List<Sort> sorts) {
		this.sorts = sorts;
	}
	
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	public Integer getTotalResults() {
		return totalResults;
	}
	public void setTotalResults(Integer totalResults) {
		this.totalResults = totalResults;
	}
	public Integer getOffset() {
		return offset;
	}
	public void setOffset(Integer offset) {
		this.offset = offset;
	}
	public Integer getLimit() {
		return limit;
	}
	public void setLimit(Integer limit) {
		this.limit = limit;
	}
	public List<Link> getLinks() {
		return links;
	}
	public void setLinks(List<Link> links) {
		this.links = links;
	}
	
	
	
}
	