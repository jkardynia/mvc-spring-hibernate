package pl.deltacore.main.core.persistence.repository;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pl.deltacore.main.core.persistence.entity.Product;
import pl.deltacore.main.core.service.ProductsServiceImpl;

@Repository
public class HibernateProductsRepository implements ProductsRepository{

	@Autowired
    private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	public List<Product> getProducts(String order) {
		return sessionFactory.getCurrentSession().createQuery("from Product")
				.setReadOnly(true)
                .list();
	}
	
	public Product find(Long id) {
		Session session = sessionFactory.getCurrentSession();
		session.setDefaultReadOnly(true);
		
		Product product = (Product) sessionFactory.getCurrentSession().get(Product.class, id);
		
		session.setDefaultReadOnly(false);
		
		return product;
	}
}
