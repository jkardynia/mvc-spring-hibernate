package pl.deltacore.main.core.persistence.repository;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pl.deltacore.main.core.persistence.entity.Product;

@Repository
public class HibernateProductsRepository implements ProductsRepository{

	@Autowired
    private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	public List<Product> getProducts(String order) {
		return sessionFactory.getCurrentSession().createQuery("from Product")
                .list();
	}
	
	public Product getProduct(Integer id) {
//		return sessionFactory.getCurrentSession().createQuery("from Contact")
//                .list();
		
		Product product = new Product();
		product.setName("Sofa");

		return product;
	}
}
