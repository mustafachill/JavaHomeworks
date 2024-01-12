public class TestEmployee {
    public static void main(String[] args) {
        Employee mehmet = new Employee("Mehmet Arslan", 1, 55000, 40, "Software Developer", 5, 6);
        Employee harun = new Employee("Harun Çiftçi", 2, 120000, 59, "Project Manager", 6, 7);

        mehmet.getName();
        mehmet.setName("Ali");

        mehmet.getId();
        mehmet.setId(13);

        mehmet.getSalary();
        mehmet.setSalary(65456);

        mehmet.getAge();
        mehmet.setAge(87);

        mehmet.getPosition();
        mehmet.setPosition("CEO");

        mehmet.getSsTax(mehmet.getsSTaxRate());
        mehmet.getHealthFee(mehmet.getHealthFeeRate());
        mehmet.getFedTax();
        mehmet.getSsTax(mehmet.getsSTaxRate());
        mehmet.getHealthFee(mehmet.getHealthFeeRate());
        mehmet.getInsurance();
        mehmet.getNetPay();

        System.out.println("------------------------------------------------");

        harun.getName();
        harun.setName("Mustafa");

        harun.getId();
        harun.setId(13);

        harun.getSalary();
        harun.setSalary(65456);

        harun.getAge();
        harun.setAge(87);

        harun.getPosition();
        harun.setPosition("CEO");

        harun.getSsTax(harun.getsSTaxRate());
        harun.getHealthFee(harun.getHealthFeeRate());
        harun.getFedTax();
        harun.getSsTax(harun.getsSTaxRate());
        harun.getHealthFee(harun.getHealthFeeRate());
        harun.getInsurance();
        harun.getNetPay();
    }
}