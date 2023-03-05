package io.shodo.rover

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InitalPositionTest {
    @Test
    fun positionRover(){
        val x = 0;
        val y = 0;
        assertThat(x).isEqualTo(0);
        assertThat(y).isEqualTo(0);
    }
}