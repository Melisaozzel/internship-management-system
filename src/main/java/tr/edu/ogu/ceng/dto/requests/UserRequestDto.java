package tr.edu.ogu.ceng.dto.requests;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRequestDto {
	private Long id;
	private String username;
	private String password;
	private String email;
	private long userTypeId;
	private Timestamp createDate;
	private Timestamp updateDate;
}
