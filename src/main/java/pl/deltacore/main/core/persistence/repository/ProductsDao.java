package pl.deltacore.main.core.persistence.repository;

import java.util.List;

import pl.deltacore.main.core.persistence.entity.Product;

public interface ProductsDao {
	public List<Product> getProducts(String order);
	public Product getProduct(Integer id);
}
