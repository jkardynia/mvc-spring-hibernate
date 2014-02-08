package pl.deltacore.main.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.deltacore.main.core.persistence.entity.Product;
import pl.deltacore.main.core.persistence.repository.ProductsDao;

@Service
public class ProductsServiceImpl implements ProductsService{

	@Autowired
    private ProductsDao productsDao;
	
	@SuppressWarnings("unchecked")
	public List<Product> getProducts() {
		//tutaj nalezy konwertowac obiekty na DTO
		return productsDao.getProducts();
	}

}
