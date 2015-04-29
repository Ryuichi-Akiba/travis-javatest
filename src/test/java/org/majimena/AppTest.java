package org.majimena;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(Enclosed.class)
public class AppTest {

    public static class GreetTest {

        private App sut;

        @Before
        public void setUp() {
            sut = new App();
        }

        @Test
        public void whenNullThenSayHelloWorld() {
            String actual = sut.greet(null);

            assertThat(actual).isEqualTo("Hello, World!!");
        }

        @Test
        public void sayHelloTravis() {
            String actual = sut.greet("Travis!!!");

            assertThat(actual).isEqualTo("Hello, Travis!!!");
        }

    }

}