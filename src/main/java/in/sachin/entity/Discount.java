package in.sachin.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Discount {

	private Integer id;
	private String name;
	private String desc;
	private Double discount_percent;
	private boolean active;
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
