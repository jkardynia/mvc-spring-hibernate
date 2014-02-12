package pl.deltacore.main.core.persistence.repository;

import java.util.List;

import pl.deltacore.main.core.persistence.entity.Product;

public interface ProductsRepository {
	public List<Product> getProducts(String order);
	public Product find(Long id);
}
