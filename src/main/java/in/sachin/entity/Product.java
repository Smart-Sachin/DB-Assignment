package in.sachin.entity;

import java.time.LocalDate;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.CurrentTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Product {
	@Id
	private Integer Id;
	private String name;
	private String desc;
	private String sku;
	private Integer categoru_id;
	private Integer inventory_id;
	private Double price;
	private Integer discount_id;
	@CreationTimestamp
	@Column(name="CREATE_DATE", updatable = false)
	private LocalDate created_id;
	@UpdateTimestamp
	@Column(name="modified_id", updatable = false)
	private LocalDate modified_id;
	@CurrentTimestamp
	@Column(name="delete_id", updatable = false)
	private LocalDate deleted_id;
	
	@OneToMany
	@JoinColumn(name="id")
	private Product_Category pcategory;
	
	@OneToMany
	@JoinColumn(name="id")
	private Product_Inventory pInventory;
	
	@OneToMany
	@JoinColumn(name="id")
	private Discount ds;
}
