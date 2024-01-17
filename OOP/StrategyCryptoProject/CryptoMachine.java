package OOP.StrategyCryptoProject;

public class CryptoMachine {
    CryptoAlg algorithm;
    public String decrypt(String encrypted_secret){
        return algorithm.decrypt(encrypted_secret);
    }

    public String encrypt(String secret){
        return algorithm.encrypt(secret);
    }

    public void setAlgorithm(CryptoAlg algorithm) {
        this.algorithm = algorithm;
    }
}
