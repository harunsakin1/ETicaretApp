package com.haruns.eticaretapp.entity;

import com.haruns.eticaretapp.entity.enums.State;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;


@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Data
@MappedSuperclass
public class BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	@Builder.Default
	Long createdDate=System.currentTimeMillis();
	@Builder.Default
	Integer state=1;
	@Builder.Default
	Long updatedAt= System.currentTimeMillis();
	
	@PreUpdate
	public void preUpdate() {
		updatedAt=System.currentTimeMillis();
	}
}