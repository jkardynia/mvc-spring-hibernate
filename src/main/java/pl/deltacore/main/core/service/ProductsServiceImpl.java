package pl.deltacore.main.core.service;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

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

	static Logger log = Logger.getLogger(ProductsServiceImpl.class.getName());

	@Autowired
    private ProductsRepository productsRepository;
	
	/**
	 * @Query
	 */
	public List<Product> getProducts(String order) {
		return productsRepository.getProducts(order);
	}

	/**
	 * @Query
	 */
	public Product getProduct(String id) {
		log.log(Level.WARNING, "servicemojid: "+id);
		
		return productsRepository.getProduct(Long.parseLong(id));
	}
	
	/**
	 * @Command
	 */
	public void orderProduct(OrderProductRequest req) {
		OrderAggregate order = new OrderAggregate();
		
		order.addProduct(req.getId());
		order.finalize();
	}

}
