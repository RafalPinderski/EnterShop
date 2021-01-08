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
@Table(name = "product_categories")
@NamedQuery(name = "Category.findAll", query = "SELECT c FROM Category c")
public class Category implements Serializable {
	private static final long serialVersionUID = -3844670176432040066L;

	@Id
	@Column(name = "category")
	private String category;

	@Column(name = "category_description")
	private String categoryDescription;
	
	public Category( ) {
	}
}
