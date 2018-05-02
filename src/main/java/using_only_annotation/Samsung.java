package using_only_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("samsung")
public class Samsung {
	
	@Autowired
	//@Qualifier("mediaTech") // ii specifici special ce bean sa puna dintre mediaTech si Snapdragon
	MobileProcessor cpu;
	/*
	 * Autowired, o sa caute  obiectul cpu,
	 * cauta in AppConfig si cauta dupa un return type (! nu dupa nume)
	 * MobileProcessor, in cazul meu este getProcessor din Appconfig
	 */

	public MobileProcessor getCpu() {
		return cpu;
	}
	public void setCpu(MobileProcessor cpu) {
		this.cpu = cpu;
	}



	public void config() {
		System.out.println("Octa core, 4 gb Ram, 21 mb Camera");
		cpu.process();
	}

}
