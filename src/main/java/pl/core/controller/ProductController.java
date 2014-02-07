package pl.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import pl.core.model.entity.Product;
import pl.core.service.ProductService;

@Controller
public class ProductController {

	@Autowired
    private ProductService productService;
	
    @RequestMapping("/products")
    public @ResponseBody List<Product> greeting() {
        
    	
    	return productService.getProducts();
    } 
}  