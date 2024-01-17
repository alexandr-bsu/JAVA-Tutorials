package OOP.StrategyCryptoProject;

public class Executor {
    public void execute(){
        CryptoMachine cryptoMachine = new SHA256Machine();
        String pass = cryptoMachine.encrypt("ПАРОЛЬ ЗАПУСКА РАКЕТЫ: 123");
        System.out.println(pass);
        String decoded = cryptoMachine.decrypt("ахалай-махалай");
        System.out.println(decoded);
    }
}
