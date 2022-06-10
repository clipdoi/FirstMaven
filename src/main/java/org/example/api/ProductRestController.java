package org.example.api;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import org.example.entities.Product;
import org.example.models.ProductModel;

@RestController
@RequestMapping("api/product")
public class ProductRestController {
	
	@RequestMapping(value="find", method= RequestMethod.GET, produces = MimeTypeUtils.APPLICATION_JSON_VALUE)
	public ResponseEntity<Product> find(){
		try {
			ProductModel productModel = new ProductModel();
			return new ResponseEntity<Product>(productModel.find(), HttpStatus.OK);
			
		}catch(Exception e) {
			return new ResponseEntity<Product>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@RequestMapping(value="findAll", method= RequestMethod.GET, produces = MimeTypeUtils.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Product>> findAll(){
		try {
			ProductModel productModel = new ProductModel();
			return new ResponseEntity<List<Product>>(productModel.findAll(), HttpStatus.OK);
			
		}catch(Exception e) {
			return new ResponseEntity<List<Product>>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@RequestMapping(value="create", method= RequestMethod.POST, 
			produces = MimeTypeUtils.APPLICATION_JSON_VALUE,
			consumes = MimeTypeUtils.APPLICATION_JSON_VALUE)
	public ResponseEntity<Product> create(@RequestBody Product product){
		try {
			System.out.println("id: " + product.getId());
			System.out.println("name: "+product.getName());
			product.setId("tv99");
			return new ResponseEntity<Product>(product, HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<Product>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@RequestMapping(value="update", method= RequestMethod.PUT, 
			produces = MimeTypeUtils.APPLICATION_JSON_VALUE,
			consumes = MimeTypeUtils.APPLICATION_JSON_VALUE)
	public ResponseEntity<Product> update(@RequestBody Product product){
		try {
			System.out.println("id: " + product.getId());
			System.out.println("name: "+product.getName());
			product.setId("tv100");
			return new ResponseEntity<Product>(product, HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<Product>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@RequestMapping(value="delete/{id}", method= RequestMethod.DELETE, produces = MimeTypeUtils.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> delete(@PathVariable("id") String id){
		try {
			return new ResponseEntity<String>(id, HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
		}
	}
}
