package enter.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import enter.model.Product;
import enter.repository.ProductRepository;

@Controller
public class ProductController {
	@Autowired
	private ProductRepository productsRepository;
	
	@GetMapping("/products/all")
	public String listProducts(Model model) {
		List<Product> products = productsRepository.findAll();
		model.addAttribute("products", products);
		return "products";
	}
	@GetMapping("/products/{id}")
	public String oneProduct(Model model,
			@PathVariable("id") Integer product_id) {
		Optional<Product> maybeProduct = productsRepository.findById(product_id);
		if(maybeProduct.isPresent()) {
			model.addAttribute("product", maybeProduct.get());
			return "product";
		} else {
			model.addAttribute("id", product_id);
			return "missing_product";
		}
	}
}