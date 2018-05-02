package using_only_annotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("mediaTech")
public class MediaTech implements MobileProcessor {

	public void process() {
				System.out.println("2nd best CPU");
	}

}
