package OOP.StrategyCryptoProject;

public class SHA256 implements CryptoAlg{
    @Override
    public String encrypt(String secret) {
        return "SHA-256: " + secret;
    }

    @Override
    public String decrypt(String encrypted_secret) {
        return "SHA-256: secret";
    }
}
