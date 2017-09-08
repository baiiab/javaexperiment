package exp1_2;

public class Test {

    public static void main(String[] args) {
        AddressValidator validator1 = new CAAddress();
        AddressValidator validator2 = new USAddress();
        String address = "GuangZhou";
        validator1.validate(address);
        validator2.validate(address);
    }
}
