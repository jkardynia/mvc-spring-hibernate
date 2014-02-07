package pl.core.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.core.model.dao.ProductsDao;
import pl.core.model.entity.Product;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
    private ProductsDao productsDao;
	
	@Transactional
	public List<Product> getProducts() {
		return productsDao.getProducts();
	}

}
