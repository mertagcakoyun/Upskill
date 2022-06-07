package com.example.s04tdd;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class S04TddApplicationTests {

    // when n=1
    // when n=2
    @Test
    void shouldReturnZeroWhenNEqualsOne() {

        assertThat(new Fibonacci().findNthElement(1)).isEqualTo(0);
    }

    @Test
    void shouldReturnOneWhenNEqualsTwo() {

        assertThat(new Fibonacci().findNthElement(1)).isEqualTo(0);
    }

}
