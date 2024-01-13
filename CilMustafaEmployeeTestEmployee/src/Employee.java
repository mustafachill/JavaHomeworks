public class Employee {
    // name = name of an employee
    private String name;

    // id = employee id
    private int id;

    // salary = employee salary
    private double salary;

    // age = employee age
    private int age;

    // position = employee title
    private String position;

    // ssTaxRate = rate for sSTax method's parameter
    private int sSTaxRate;

    // healthFeeRate = rate for healthFee method's parameter
    private int healthFeeRate;


    Employee() {
    }

    Employee(String name, int id, double salary, int age, String position, int sSTaxRate, int healthFeeRate) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.age = age;
        this.position = position;
        this.sSTaxRate = sSTaxRate;
        this.healthFeeRate = healthFeeRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getsSTaxRate() {
        return sSTaxRate;
    }

    public void setsSTaxRate(int sSTaxRate) {
        this.sSTaxRate = sSTaxRate;
    }

    public int getHealthFeeRate() {
        return healthFeeRate;
    }

    public void setHealthFeeRate(int healthFeeRate) {
        this.healthFeeRate = healthFeeRate;
    }


    public int getFedTax() {
        int fedTax = (int) Math.ceil((salary - 800) * 17 / 100);
        return fedTax;
    }

    public int getSsTax(int rate) {
        int sSTax = (int) Math.ceil(salary * rate / 100);
        return sSTax;
    }

    public int getHealthFee(int rate) {
        int healthFee = (int) Math.ceil(salary * rate / 100);
        return healthFee;
    }

    public int getInsurance() {
        int insurance = 0;
        if (age > 0 && age < 40) {
            insurance = (int) Math.ceil(salary * 3 / 100);
        } else if (age >= 40 && age < 50) {
            insurance = (int) Math.ceil(salary * 4 / 100);
        } else if (age >= 50 && age < 60) {
            insurance = (int) Math.ceil(salary * 5 / 100);
        } else if (age >= 60) {
            insurance = (int) Math.ceil(salary * 6 / 100);
        } else {
            System.out.println("Wrong age entry. Please try again.");
            getInsurance();
        }
        return insurance;
    }

    public double getNetPay() {
        double netPay = salary - getFedTax() - getSsTax(sSTaxRate) - getHealthFee(healthFeeRate) - getInsurance();
        return netPay;
    }

    /* public void announcerForSet(String changing, int whatIsChanging){
        System.out.println("Employee " + changing + " is set to: " + whatIsChanging);
    }
    public void announcerForSet(String changing, String whatIsChanging){
        System.out.println("Employee " + changing + " is set to: " + whatIsChanging);
    }

    public void announcerForSet(String changing, double whatIsChanging){
        System.out.println("Employee " + changing + " is set to: " + whatIsChanging);
    }

    public void announcerForGet(String changing, int whatIsChanging){
        System.out.println(name+"'s " + changing + " is: " + whatIsChanging);
    }
    public void announcerForGet(String changing, String whatIsChanging){
        System.out.println(name+"'s " + changing + " is: " + whatIsChanging);
    }

    public void announcerForGet(String changing, double whatIsChanging){
        System.out.println(name+"'s " + changing + " is: " + whatIsChanging);
    } */

}