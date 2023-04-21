package tr.edu.ogu.ceng.dto.responses.create;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateInternshipResponseDto {
	private Long id;
	private String status;
	private Timestamp startDate;
	private Timestamp endDate;
	private int days;
	private Long studentId;
	private Long companyId;
	private Long facultySupervisorId;
}
