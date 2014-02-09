package pl.deltacore.main.core.dto;

public class OrderProductRequest {
	private Integer id;
	
	public OrderProductRequest(String id){
		this.id = Integer.getInteger(id);
	}
	
	public Integer getId() {
		return id;
	}
}
