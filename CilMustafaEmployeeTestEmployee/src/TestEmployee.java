/***********************************************************************
 @Title:	CilMustafaTestEmployee.java
 @Purpose:	To get familiar with usage of methods defined in a class
 @Author:    (Cil Mustafa)
 @Date:   	(12.01.2024)
 @Version:	1.0
 ************************************************************************/

public class TestEmployee {
    public static void main(String[] args) {
        Employee mehmet = new Employee("Mehmet Arslan", 1, 55000, 40, "Software Developer", 5, 6);
        Employee harun = new Employee("Harun Çiftçi", 2, 120000, 59, "Project Manager", 6, 7);


        System.out.println("Employee name is: " + mehmet.getName());
        mehmet.setName("Ali");
        System.out.println("Employee name is set to: " + mehmet.getName());
        System.out.println("------------------------------------------------");

        System.out.println("Employee id is: " + mehmet.getId());
        mehmet.setId(13);
        System.out.println("Employee id is set to " + mehmet.getId());
        System.out.println("------------------------------------------------");

        System.out.println("Employee salary is: " + mehmet.getSalary());
        mehmet.setSalary(65456);
        System.out.println("Employee salary is set to: " + mehmet.getSalary());
        System.out.println("------------------------------------------------");

        System.out.println("Employee age is: " + mehmet.getAge());
        mehmet.setAge(87);
        System.out.println("Employee age is set to: " + mehmet.getAge());
        System.out.println("------------------------------------------------");

        System.out.println("Employee position is : " + mehmet.getPosition());
        mehmet.setPosition("CTO");
        System.out.println("Employee position is set to: " + mehmet.getPosition());
        System.out.println("------------------------------------------------");

        System.out.println("Employee's SS Tax is: " + mehmet.getSsTax(mehmet.getsSTaxRate()));
        System.out.println("Employee's Health Fee is: " + mehmet.getHealthFee(mehmet.getHealthFeeRate()));
        System.out.println("Employee's Fed Tax is: " + mehmet.getFedTax());
        System.out.println("Employee's Insurance is: " + mehmet.getInsurance());
        System.out.println("Employee's Net Pay is: " + mehmet.getNetPay());
        System.out.println("------------------------------------------------");

        System.out.println(" ");
        System.out.println("------------------------------------------------");
        System.out.println("Employee name is: " + harun.getName());
        harun.setName("Mustafa");
        System.out.println("Employee name is set to: " + harun.getName());
        System.out.println("------------------------------------------------");

        System.out.println("Employee id is: " + harun.getId());
        harun.setId(99);
        System.out.println("Employee id is set to " + harun.getId());
        System.out.println("------------------------------------------------");

        System.out.println("Employee salary is: " + harun.getSalary());
        harun.setSalary(200000);
        System.out.println("Employee salary is set to: " + harun.getSalary());
        System.out.println("------------------------------------------------");

        System.out.println("Employee age is: " + harun.getAge());
        harun.setAge(78);
        System.out.println("Employee age is set to: " + harun.getAge());
        System.out.println("------------------------------------------------");

        System.out.println("Employee position is : " + harun.getPosition());
        harun.setPosition("CEO");
        System.out.println("Employee position is set to: " + harun.getPosition());
        System.out.println("------------------------------------------------");

        System.out.println("Employee's SS Tax is: " + harun.getSsTax(harun.getsSTaxRate()));
        System.out.println("Employee's Health Fee is: " + harun.getHealthFee(harun.getHealthFeeRate()));
        System.out.println("Employee's Fed Tax is: " + harun.getFedTax());
        System.out.println("Employee's Insurance is: " + harun.getInsurance());
        System.out.println("Employee's Net Pay is: " + harun.getNetPay());
        System.out.println("------------------------------------------------");
    }
}