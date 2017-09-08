package exp1_2;

public class CAAddress implements AddressValidator {

    @Override
    public boolean validate(String address) {
        System.out.println("正在验证CAAddress...");
        return false;
    }
}
