package hello;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class AppTest {
    private App app = new App();

    @Test
    public void appTesteGas(){
        ArrayList<Integer> c = new ArrayList<>();
        c.add(1);
        c.add(1);
        c.add(1);
        c.add(2);
        c.add(2);
        c.add(2);
        c.add(3);
        c.add(3);
        c.add(3);
        c.add(4);
        assertThat(app.voto(c), is("MUITO OBRIGADO!"+
        "\nAlcool: " +3+
        "\nGasolina: " +3+
        "\nDiesel: " +3));
    }
}
