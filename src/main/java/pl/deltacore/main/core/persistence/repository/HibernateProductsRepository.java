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
	
	public Product getProduct(Long id) {
		Session session = sessionFactory.getCurrentSession();
		session.setDefaultReadOnly(true);
		
		Product product = load(id);
		
		session.setDefaultReadOnly(false);
		
		return product;
	}
	
	public Product load(Long id) {
		Product product = (Product) sessionFactory.getCurrentSession().get(Product.class, id);
		
		return product;
	}

	public void save(Long id) {
		// TODO Auto-generated method stub
		
	}

	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}
}
