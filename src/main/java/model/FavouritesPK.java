// Reference: https://projectlombok.org/features/all
// @NoArgsConstructor if we had row that could be created with no data excluding PK
// @RequiredArgsConstructor if we had row that could be created with few fields with data
// @AllArgsConstructor if we had row that could be created with all fields with data
// @Data = @ToString, @EqualsAndHashCode, @Getter, @Setter, and @RequiredArgsConstructor

package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@EqualsAndHashCode
@Getter
@Setter
@AllArgsConstructor
public class FavouritesPK implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	
	// Since these values act as foreign keys
	//  specify relationship with the appropriate annoations
	@ManyToOne
	@JoinColumn(
            name = "company_id",
            referencedColumnName = "Username")
	@Column(name="PersonID", nullable=false, length=50)
	protected String personId;
	
	@ManyToOne
	@JoinColumn(
            name = "company_id",
            referencedColumnName = "AudioID")
	@Column(name="AudioID", nullable=false)
	protected String audioId;
}
