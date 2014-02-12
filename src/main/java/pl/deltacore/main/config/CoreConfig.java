package pl.deltacore.main.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import pl.deltacore.main.core.persistence.repository.ProductsRepository;
import pl.deltacore.main.core.persistence.repository.HibernateProductsRepository;
import pl.deltacore.main.core.service.ProductsService;
import pl.deltacore.main.core.service.ProductsServiceImpl;

@Configuration
public class CoreConfig {

  @Bean
  public ProductsService createService() {
    return new ProductsServiceImpl();
  }

}
