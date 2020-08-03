public class Singleton {

    private String mensagem = "Sou um singleton";
    private static Singleton singleton = null;

    private Singleton(){}

    public static Singleton getSingleton() {
        if (singleton == null){
            singleton = new Singleton();
        }

        return singleton;
    }

    public String getString() {
        return mensagem;
    }
}
