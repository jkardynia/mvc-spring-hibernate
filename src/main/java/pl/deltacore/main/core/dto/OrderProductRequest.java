package pl.deltacore.main.core.dto;

public class OrderProductRequest {
	private Long id;
	
	public OrderProductRequest(String id){
		this.id = Long.getLong(id);
	}
	
	public Long getId() {
		return id;
	}
}
