package enter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import enter.model.Category;
import enter.repository.CategoryRepo;

@Controller
public class CategoryController {

	@Autowired
	private CategoryRepo categoryRepository;

	@GetMapping("/category/all")
	public String listProducts(Model model) {
		List<Category> categories = categoryRepository.findAll();
		model.addAttribute("categories", categories);
		return "categories";
	}
}
