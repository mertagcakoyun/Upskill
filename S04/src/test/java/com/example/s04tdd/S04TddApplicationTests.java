package com.example.s04tdd;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class S04TddApplicationTests {

    // when n=1 return 0
    // when n=2 return 1

    @Test
    void shouldReturnZeroWhenNEqualsOne() {

        assertThat(new Fibonacci().findNthElement(1)).isEqualTo(0);

    }

    @Test
    void shouldReturnOneWhenNEqualsTwo() {

        assertThat(new Fibonacci().findNthElement(2)).isEqualTo(1);
    }

    @Test
    void shouldReturnOneWhenNEqualsThree () {

        assertThat(new Fibonacci().findNthElement(3)).isEqualTo(1);
    }

    @Test
    void shouldReturnTwoWhenNEqualsFour() {

        assertThat(new Fibonacci().findNthElement(4)).isEqualTo(2);
    }

    @Test
    void shouldReturnTwoWhenNEqualsFour2() {

        assertThat(new Fibonacci().findNthElement(5)).isEqualTo(3);
    }

}
