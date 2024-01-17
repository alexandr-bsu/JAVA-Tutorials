package OOP.StrategyCryptoProject;

public interface CryptoAlg {
    public String encrypt(String secret);
    public String decrypt(String encrypted_secret);
}
