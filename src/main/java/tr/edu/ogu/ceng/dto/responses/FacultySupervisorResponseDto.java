package tr.edu.ogu.ceng.dto.responses;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FacultySupervisorResponseDto {
	private Long id;
	private String name;
	private String surname;
	private String phoneNumber;
	private String supervisorNo;
}
