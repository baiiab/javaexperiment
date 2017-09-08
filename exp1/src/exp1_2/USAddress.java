package exp1_2;

public class USAddress implements AddressValidator {

    @Override
    public boolean validate(String address) {
        System.out.println("正在验证USAddress...");
        return false;
    }
}
