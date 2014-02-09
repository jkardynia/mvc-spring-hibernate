package pl.deltacore.main.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.deltacore.main.core.domain.OrderAggregate;
import pl.deltacore.main.core.dto.OrderProductRequest;
import pl.deltacore.main.core.persistence.entity.Product;
import pl.deltacore.main.core.persistence.repository.ProductsDao;

@Service
public class ProductsServiceImpl implements ProductsService{

	@Autowired
    private ProductsDao productsDao;
	
	@SuppressWarnings("unchecked")
	public List<Product> getProducts(String order) {
		return productsDao.getProducts(order);
	}

	public void orderProduct(OrderProductRequest req) {
		OrderAggregate order = new OrderAggregate();
		
		order.addProduct(productsDao.getProduct(req.getId()));
		order.finalize();
	}

}
