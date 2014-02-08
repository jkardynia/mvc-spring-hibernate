package pl.deltacore.main.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import pl.deltacore.main.core.persistence.Product;
import pl.deltacore.main.core.service.ProductsService;

@Controller
public class ProductController {

	@Autowired
    private ProductsService productsService;
	
    @RequestMapping("/products")
    public @ResponseBody List<Product> greeting() {
        
    	
    	return productsService.getProducts();
    } 
}  