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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "AudioFiles")
@Getter
@Setter
@AllArgsConstructor
@Table(name = "AudioFiles")
public class AudioFile {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="AudioID", nullable=false)
	private Integer audioId;
	
	@Column(name="FilePath", nullable=false, length=70)
	private String filePath;
}