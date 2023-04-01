package tr.edu.ogu.ceng.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tr.edu.ogu.ceng.dao.InternshipRepository;
import tr.edu.ogu.ceng.model.Internship;

@Service()
public class InternshipService {
	@Autowired
	private InternshipRepository InternshipRepo;
	public Internship addInternship(Internship internship) {
		return InternshipRepo.save(internship);
	}
}
