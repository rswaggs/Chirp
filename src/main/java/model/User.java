// Reference: https://projectlombok.org/features/all
// @NoArgsConstructor if we had row that could be created with no data excluding PK
// @RequiredArgsConstructor if we had row that could be created with few fields with data
// @AllArgsConstructor if we had row that could be created with all fields with data
// @Data = @ToString, @EqualsAndHashCode, @Getter, @Setter, and @RequiredArgsConstructor

package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "Users")  // Name for JPA-QL queries (the tablename for SQL queries)
@Getter  // Generators all the getters and setters
@Setter
@AllArgsConstructor
@Table(name = "Users") // This tells Hibernate to make a table out of this class
public class User {
	@Id
	@Column(name="Username", nullable=false, length=50)
    private String username;
	
	@Column(name="Email", nullable=false, length=50, unique=true)
	private String email;
	
	@Column(name="Password", nullable=false, length=50)
	private String password;
}
