package com.ddoong2.library;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class HelloTest {

    @Test
    public void 메세지를_확인() throws Exception {
        // given
        String message = "Hello World!";

        // when
        Hello hello = new Hello();

        // then
        assertThat(hello.message()).isEqualTo(message);
    }

}