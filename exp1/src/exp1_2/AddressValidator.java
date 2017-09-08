package exp1_2;

public interface AddressValidator {

    /**
     * 验证地址
     * @param address 给定地址
     * @return 是否验证成功
     */
    boolean validate(String address);
}
