package in.sachin.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Product_Inventory {
	@Id
	private Integer Id;
	private Integer quantity;
	@CreationTimestamp
	@Column(name="CREATE_DATE", updatable = false)
	private LocalDate created_at;
	@CreationTimestamp
	@Column(name="modify_DATE", updatable = false)
	private LocalDate modified_at;
	@CreationTimestamp
	@Column(name="deleted_DATE", updatable = false)
	private LocalDate deleted_at;

}
