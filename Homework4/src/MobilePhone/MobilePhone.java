package MobilePhone;

public class MobilePhone {
    private String brand;
    private String model;
    private int batteryCapacity;
    private int batteryAmount;
    private int freeMemory;
    int memory;


    public MobilePhone(String brandAndModel,int batteryCapacity,int memory){
        String[] brandAndModel1=brandAndModel.split(" ");
        this.brand = brandAndModel1[0];
        this.model = brandAndModel1[1];
        this.batteryCapacity = batteryCapacity;
        this.memory = memory;
        freeMemory = memory;
        batteryAmount=batteryCapacity;
    }

  public void charge(){
        batteryAmount = batteryCapacity;
        System.out.println(brand+" "+model +" has been charged. Remain battery capacity: "+batteryAmount+" mAh");
  }

  public void installApplication(String appName,int appNeededMemory) {
      if (freeMemory >= appNeededMemory) {
          freeMemory=freeMemory-appNeededMemory;
          System.out.println("Application " + appName + " has been installed on " + brand+" "+model + ". Remain memory: " + freeMemory + " MB");
      }else{
          System.out.println("Application "+ appName + " can't be installed on "+ brand+" "+model +". There are no enough memory");
      }
  }

  public void use(String appName,int appUsageTime){
        if(batteryAmount==0)
        {
            System.out.println("Application "+ appName+" can't be run on "+brand+" "+model+". Phone discharged");

        } else if(batteryAmount>0) {
            int batteryHours=batteryAmount/100;
            if (appUsageTime >= batteryHours) {
                batteryAmount = 0;
                System.out.println("Application " + appName + " has been used for " + batteryHours+ " hours on "
                        + brand+" "+model + ". Phone has been discharged.");
            } else{
                batteryAmount = batteryAmount - (appUsageTime * 100);
                System.out.println("Application" + appName + " has been ran for " + appUsageTime + " hours on " + brand+" "+model +
                        ". Remain battery capacity: " + batteryAmount + " mAh");
            }
        }
  }
}
