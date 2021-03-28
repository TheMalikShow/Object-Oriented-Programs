public class Watch {
  int charge = 0;

    String name;

    public   void charge(){

        if (charge<100) {
            charge = charge + 20;
        }
            else if (charge==100){
                charge=100;
            }
        System.out.println("Charging Increased  : "+charge );
        }


    public void  charging (){

        System.out.println("Current Charging :"+charge+ "%");
        if(charge==100){
            System.out.println("CHARGING FULL");
        }

    }
    public void SetName(String Name){
        this.name = Name;

    }
    public void GetName(){
        System.out.println(name );

    }
}
