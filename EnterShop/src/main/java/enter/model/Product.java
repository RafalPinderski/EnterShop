package enter.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "products")
@NamedQuery(name = "Product.findAll", query = "SELECT p FROM Product p")
public class Product implements Serializable {
	private static final long serialVersionUID = -4061994571161904391L;

	@Id
	@Column(name = "product_id")
	private int productid;

	@Column(name = "name")
	private String name;

	@Column(name = "category")
	private String category;

	@Column(name = "price")
	private double price;

	@Column(name = "description")
	private String description;

	public Product() {
		
	}
}
