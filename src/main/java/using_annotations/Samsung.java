package using_annotations;

import org.springframework.beans.factory.annotation.Autowired;

public class Samsung {
	
	@Autowired
	MobileProcessor cpu;
	/*
	 * Autowired, o sa cauta ca are nevoie de obiectul cpu,
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
