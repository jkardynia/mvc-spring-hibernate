package pl.deltacore.main.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pl.deltacore.main.core.domain.OrderAggregate;
import pl.deltacore.main.core.dto.OrderProductRequest;
import pl.deltacore.main.core.persistence.entity.Product;
import pl.deltacore.main.core.persistence.repository.ProductsRepository;

@Service
@Transactional
public class ProductsServiceImpl implements ProductsService{

	@Autowired
    private ProductsRepository productsRepository;
	
	public List<Product> getProducts(String order) {
		return productsRepository.getProducts(order);
	}

	public void orderProduct(OrderProductRequest req) {
		OrderAggregate order = new OrderAggregate();
		
		order.addProduct(productsRepository.getProduct(req.getId()));
		order.finalize();
	}

}
