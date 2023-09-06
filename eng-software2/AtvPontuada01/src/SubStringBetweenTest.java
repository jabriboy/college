import static org.assertj.core.api.Assertions.*;
import org.junit.Test;

public class SubStringBetweenTest {
    @Test
    public void nullString(){
        SubStringBetween sub = new SubStringBetween();
        String[] result = sub.substringsBetween(null, "n", "l");

        assertThat(result).isEqualTo(null);
    }
    @Test
    public void emptyOpen(){
        SubStringBetween sub = new SubStringBetween();
        String[] result = sub.substringsBetween("null", "", "l");

        assertThat(result).isEqualTo(null);
    }
    @Test
    public void emptyClose(){
        SubStringBetween sub = new SubStringBetween();
        String[] result = sub.substringsBetween("null", "n", "");

        assertThat(result).isEqualTo(null);
    }

    @Test
    public void notValidOpen(){
        SubStringBetween sub = new SubStringBetween();
        String[] result = sub.substringsBetween("open", "l", "e");

        assertThat(result).isEqualTo(null);
    }

    @Test
    public void notValidClose(){
        SubStringBetween sub = new SubStringBetween();
        String[] result = sub.substringsBetween("open", "p", "l");

        assertThat(result).isEqualTo(null);
    }

    @Test
    public void ValidResult(){
        SubStringBetween sub = new SubStringBetween();
        String[] result = sub.substringsBetween("open", "o", "n");

        String[] expected = {"pe"};

        assertThat(result).isEqualTo(expected);
    }


}
