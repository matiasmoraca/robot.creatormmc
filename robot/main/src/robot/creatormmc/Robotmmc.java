package robot.creatormmc;

public class Robotmmc{
    private Manommc manoIzquierda;
    private Manommc manoDerecha;
    private Piernammc piernaIzquierda;
    private Piernammc piernaDerecha;
    private Torsommc torso;
    private Cabezammc cabeza;
    private Outfitmmc outfit;

    public Robotmmc() {
        this.manoIzquierda = new Manommc();
        this.manoDerecha = new Manommc();
        this.piernaIzquierda = new Piernammc();
        this.piernaDerecha = new Piernammc();
        this.torso = new Torsommc("Piel sintetica");
        this.cabeza = new Cabezammc("negro");
    }

    public void vestirOutfit(Outfitmmc outfitmmc) {
        this.outfit = outfitmmc;
        System.out.println("El robot se ha vestido con: " + outfit.getDescripcion());
    }

    public void mostrarComponentes() {
        manoIzquierda.getNumDedosmmc();
        manoDerecha.golpemmc();
        piernaDerecha.lapatadammc();
        piernaIzquierda.lapatadammc();
        torso.Endurecermmc();
        System.out.println("El material del torso es de " + torso.getMaterialmmc());
        System.out.println("El robot tiene pelo y es de color " + cabeza.getColorCabellommc());
        cabeza.girarCabezammc();
  
    }
    
   
}
