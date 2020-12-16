public class Droid {
  String name;
  int batteryLevel;

  // constructor
  public Droid(String droidName){
    name = droidName;
    batteryLevel = 100;

  }
  // introduction
  public String toString(){
    return "Hello, I’m the droid: " + name;
  }

  // perform task
  public void performTask(String task){
  batteryLevel = batteryLevel - 10;
  System.out.println(name+ " is performing task: " + task);
  }

  // energy report
  public int energyReport(batteryLevel){
    return batteryLevel;
    System.out.println("The battery level is " + batteryLevel);
  }


  public static void main(String[] args) {
    Droid codey = new Droid("Codey");
    System.out.println(codey);
    codey.performTask("dancing");
    codey.performTask("coding");
  }
}