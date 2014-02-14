package pl.deltacore.main.core.persistence.repository;

import java.util.List;

import pl.deltacore.main.core.persistence.entity.Product;

public interface ProductsRepository {
	public List<Product> getProducts(String order);
	public Product getProduct(Long id);
	public Product load(Long id);
	public void save(Long id);
	public void delete(Long id);
}
