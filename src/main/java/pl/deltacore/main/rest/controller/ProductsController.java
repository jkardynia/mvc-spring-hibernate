package pl.deltacore.main.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import pl.deltacore.main.core.persistence.entity.Product;
import pl.deltacore.main.core.service.ProductsService;

@Controller
public class ProductsController {

	@Autowired
    private ProductsService productsService;
	
    @RequestMapping(method = RequestMethod.GET, value="/products")
    public @ResponseBody List<Product> greeting() {
        
    	
    	return productsService.getProducts();
    } 
}  