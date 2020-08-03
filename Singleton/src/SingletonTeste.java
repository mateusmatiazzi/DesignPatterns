import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SingletonTeste {

    @Test
    void deveCriarUmSingleton() {
        String expected = "Sou um singleton";
        Singleton singleton = Singleton.getSingleton();
        assertEquals(expected, singleton.getString());
    }

    @Test
    public void deveCriarDoisSingletonsEVerificarSeElesSaoIguais(){
        Singleton singleton1 = Singleton.getSingleton();
        Singleton singleton2 = Singleton.getSingleton();
        assertEquals(System.identityHashCode(singleton1), System.identityHashCode(singleton2));
    }
}
