package basicweb;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JUnitIntroduction {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("Ejecutado antes de clase...");
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        System.out.println("Ejecutado después de clase...");
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("Ejecutado antes...");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Ejecutado después...");
    }

    @Test
    public void test1() {
        System.out.println("Prueba ejecutada1...");
    }

    @Test
    public void test2() {
        System.out.println("Prueba ejecutada2...");
    }
}
