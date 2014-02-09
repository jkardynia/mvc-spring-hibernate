package pl.deltacore.main.core.persistence.repository;

import java.util.LinkedList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pl.deltacore.main.core.persistence.entity.Product;

@Repository
public class ProductsDaoImpl implements ProductsDao{

//	@Autowired
//    private SessionFactory sessionFactory;
//	
	public List<Product> getProducts(String order) {
//		return sessionFactory.getCurrentSession().createQuery("from Contact")
//                .list();
		
		List<Product> products =  new LinkedList<Product>();
		Product product = new Product();
		product.setName("Sofa");
		products.add(product);

		return products;
	}
	
	public Product getProduct(Integer id) {
//		return sessionFactory.getCurrentSession().createQuery("from Contact")
//                .list();
		
		Product product = new Product();
		product.setName("Sofa");

		return product;
	}
}
