package pl.deltacore.main.core.service;

import java.util.LinkedList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pl.deltacore.main.core.persistence.Product;

@Repository
public class ProductsServiceImpl implements ProductsService{

	@Autowired
    private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	public List<Product> getProducts() {
//		return sessionFactory.getCurrentSession().createQuery("from Contact")
//                .list();
		List<Product> products =  new LinkedList<Product>();
		Product product = new Product();
		product.setName("Sofa");
		products.add(product);
		
		return products;
	}

}
