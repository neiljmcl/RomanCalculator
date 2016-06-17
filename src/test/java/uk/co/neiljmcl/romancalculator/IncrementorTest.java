package uk.co.neiljmcl.romancalculator;


import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Fail.fail;

public class IncrementorTest {
    private Incrementor incrementor;
    @Before
    public void setup() {
        incrementor = new Incrementor();
    }

    @Test
    public void increment_i_returns_ii() {
        assertThat(incrementor.apply("i")).isEqualToIgnoringCase("ii");
    }

    @Test
    public void increment_ii_returns_iii() {
        assertThat(incrementor.apply("ii")).isEqualToIgnoringCase("iii");
    }

    @Test
    public void increment_iv_returns_v() {
        assertThat(incrementor.apply("iv")).isEqualToIgnoringCase("iv");
    }

    @Test
    public void increment_v_returns_vi() {
        assertThat(incrementor.apply("v")).isEqualToIgnoringCase("vi");
    }
}
