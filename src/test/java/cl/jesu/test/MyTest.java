package cl.jesu.test;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MyTest.class)
@ComponentScan
public class MyTest {

    @BeforeClass
    public static void setUp() {

    }


    @Test
    public void whatever() throws Exception {

    }


}
