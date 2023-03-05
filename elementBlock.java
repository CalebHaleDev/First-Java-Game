public class elementBlock{
    private int atomicNumber;
    private int charge;

    public elementBlock(int atomicNumber, int charge){
        this.atomicNumber = atomicNumber;
        this.charge = charge;
        System.out.println("a new element with atomic number "+atomicNumber+" has been made");
    }
    
    void sayStats(){
        System.out.println(this.atomicNumber+" "+this.charge);
    }
}
