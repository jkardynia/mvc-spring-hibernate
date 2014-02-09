package pl.deltacore.main.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import pl.deltacore.main.core.dto.OrderProductRequest;
import pl.deltacore.main.core.persistence.entity.Product;
import pl.deltacore.main.core.service.ProductsService;

@RestController
public class ProductsController {

	@Autowired
    private ProductsService productsService;
	
	//sample url: /products/?order=desc
    @RequestMapping(method = RequestMethod.GET, value="/products")
    @ResponseStatus(HttpStatus.OK)
    public List<Product> list(@RequestParam(value="order", required=false, defaultValue="asc") String order) {
    	//return "moj response: " + order;
    	return productsService.getProducts(order);
    } 
    
    @RequestMapping(method = RequestMethod.POST, value="/product/{id}/order")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody void order(@PathVariable String id){  	
    	
    	productsService.orderProduct(new OrderProductRequest(id));
    } 
}  