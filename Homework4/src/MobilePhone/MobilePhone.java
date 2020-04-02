package MobilePhone;

public class MobilePhone {
    public String brandAndModel;
    public int batteryCapacity;
    public int batteryAmount;
    int freeMemory;
    public int memory;
    public  String appName;
    public int appUsageTime;
    public int appNeededMemory;

    public MobilePhone(String brandAndModel,int batteryCapacity,int memory){
        this.brandAndModel = brandAndModel;
        this.batteryCapacity = batteryCapacity;
        this.memory = memory;
        freeMemory = memory;
        batteryAmount=batteryCapacity;
    }

  public void charge(){
        batteryAmount = batteryCapacity;
        System.out.println(brandAndModel +" has been charged. Remain battery capacity: "+batteryAmount+" mAh");
  }

  public void installApplication(String appName,int appNeededMemory) {
      if (freeMemory >= appNeededMemory) {
          freeMemory=freeMemory-appNeededMemory;
          System.out.println("Application " + appName + " has been installed on " + brandAndModel + ". Remain memory: " + freeMemory + " MB");
      }else{
          System.out.println("Application "+ appName + " can't be installed on "+ brandAndModel +". There are no enough memory");
      }
  }

  public void use(String appName,int appUsageTime){
        if(batteryAmount==0)
        {
            System.out.println("Application "+ appName+" can't be run on "+brandAndModel+". Phone discharged");

        } else if(batteryAmount>0) {
            if (appUsageTime >= (batteryAmount / 100)) {
                batteryAmount = 0;
                System.out.println("Application " + appName + " has been used for " + (batteryAmount / 100) + " hours on "
                        + brandAndModel + ". Phone has been discharged.");
            } else if (appUsageTime < (batteryAmount / 100)) {
                batteryAmount = batteryAmount - (appUsageTime * 100);
                System.out.println("Application" + appName + " has been ran for " + appUsageTime + " hours on " + brandAndModel +
                        ". Remain battery capacity: " + batteryAmount + " mAh");
            }
        }
  }
}
