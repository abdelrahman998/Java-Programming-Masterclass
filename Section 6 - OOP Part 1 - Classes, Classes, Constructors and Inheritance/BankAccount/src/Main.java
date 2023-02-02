public class Main {
    public static void main(String[] args) {


        BankAccount amiraAccount = new BankAccount();
        System.out.println(amiraAccount.getNumber());


        System.out.println("-----------------------------------------------------------------------");


        BankAccount bobsBankAccount = new BankAccount();//("1235",0.00,"bob","a.ael@gmail.com", "0102225854");

        System.out.println(bobsBankAccount.getNumber());
        System.out.println(bobsBankAccount.getBalance());
        bobsBankAccount.withdrawal(235);
        bobsBankAccount.setBalance(125);

        bobsBankAccount.withdrawal(100.0);
        bobsBankAccount.deposit(50.0);
        bobsBankAccount.withdrawal(100.0);
        bobsBankAccount.deposit(51.0);
        bobsBankAccount.withdrawal(100.0);

        BankAccount ahmedAccount = new BankAccount("Ahmed", "ahmed@gmail.com","01022559645");
        System.out.println(ahmedAccount.getNumber() + " name " + ahmedAccount.getCustomerName());

        System.out.println("-----------------------------------------------------------------------");



        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("Ahmed", 25000.00);
        System.out.println(person2.getName());

        VipCustomer person3 = new VipCustomer("Mohamed", 100.00, "mohamed@gamil.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmailAdress());

    }
}
