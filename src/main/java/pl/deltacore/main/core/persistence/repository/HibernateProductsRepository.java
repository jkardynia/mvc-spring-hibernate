package pl.deltacore.main.core.persistence.repository;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pl.deltacore.main.core.persistence.entity.Product;
import pl.deltacore.main.core.service.ProductsServiceImpl;

@Repository
public class HibernateProductsRepository implements ProductsRepository{

	static Logger log = Logger.getLogger(ProductsServiceImpl.class.getName());
	
	@Autowired
    private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	public List<Product> getProducts(String order) {
		return sessionFactory.getCurrentSession().createQuery("from Product")
                .list();
	}
	
	public Product find(Long id) {
		log.log(Level.WARNING, "DAOmojid: "+id);
		return (Product) sessionFactory.getCurrentSession().load(Product.class, id);
	}
}
