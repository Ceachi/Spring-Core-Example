package using_only_annotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// snapDragon is a cpu
@Component("snapdragon")
@Primary // primary trb adaugat, altfel nu o sa stie care din SnapDragon si MediaTech sa pune in Autowired-ul din Samsung
public class Snapdragon implements MobileProcessor {

	public void process() {
		System.out.println("World best CPU");	
		
	}

}
