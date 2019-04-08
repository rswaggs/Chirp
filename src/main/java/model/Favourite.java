// Reference: https://projectlombok.org/features/all
// @NoArgsConstructor if we had row that could be created with no data excluding PK
// @RequiredArgsConstructor if we had row that could be created with few fields with data
// @AllArgsConstructor if we had row that could be created with all fields with data
// @Data = @ToString, @EqualsAndHashCode, @Getter, @Setter, and @RequiredArgsConstructor

package model;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.EmbeddedId;

@Entity(name = "Favourites")
@Getter
@Setter
@Table(name = "Favourites")
public class Favourite {
	
	@EmbeddedId
	private FavouritesPK favouritesPK;
}