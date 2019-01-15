public class Truck extends  Vehicle {
    public int getLoad() {
        return load;
    }

    public void setLoad(int load) {
        this.load = load;
    }
 Truck(String model, int doors, int load){
        super(model,doors);
        setLoad(load);

 }
    private  int load;
    public void  print(){
        super.print();
        System.out.println("Load"+load);
    }
}
