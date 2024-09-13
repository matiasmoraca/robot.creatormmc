package robot.creatormmc;

public class Main {

	    public static void main(String[] args) {
	 
	        Robotmmc miRobotmmc = new Robotmmc();


	        miRobotmmc.mostrarComponentes();

	        Outfitmmc torneommc = new Torneommc();
	        miRobotmmc.vestirOutfit(torneommc);

	
	        Outfitmmc combatemmc = new Combatemmc();
	        miRobotmmc.vestirOutfit(combatemmc);
	    }
	}


