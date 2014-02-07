package pl.core.model.dao;

import java.util.LinkedList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pl.core.model.entity.Product;

@Repository
public class ProductsDaoImpl implements ProductsDao{

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
