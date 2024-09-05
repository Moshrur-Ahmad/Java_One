public class HelloWorld {
    public int roll;
    public String name;       //Global Variable
    public boolean passed;
    public HelloWorld()//Constructor
    {
        roll=100;
        name="CSE";
        passed=true;
    }
    public HelloWorld(int roll,String name,boolean passed)//Para Constructor
    {
        this.roll=roll;
        this.name=name;
        this.passed=passed;
    }
    public String getName() {
        return name;          //Getter Method
    }

    public int getRoll() {
        return roll;
    }
    public boolean isPassed() {
        return passed;
    }
    public void setName(String name)  //Setter Method
    {
        this.name=name; //method's Local variable
    }
    public void setRoll(int roll) {
        this.roll = roll;
    }
    public void setPassed(boolean passed) {
        this.passed = passed;
    }

    public static void main(String[] args) {
        HelloWorld helloWorld=new HelloWorld();//variable creation or objrct creation of class
        HelloWorld helloWorld2=new HelloWorld(300,"RU",true);//Another object creation
        //helloWorld.name="ICE";
        //System.out.println(helloWorld.name);
        helloWorld.setName("ICE");
        helloWorld.setRoll(400);
        helloWorld.setPassed(false);
        System.out.println(helloWorld.getName());//calling method not variable
        System.out.println(helloWorld.getRoll());
        System.out.println(helloWorld.isPassed());
        System.out.println(helloWorld2.getName());//calling method not variable
        System.out.println(helloWorld.getRoll());
        System.out.println(helloWorld2.isPassed());
    }

}
