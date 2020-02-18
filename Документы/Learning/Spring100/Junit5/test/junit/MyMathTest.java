package junit;

import org.junit.Before;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MyMathTest {

    @BeforeEach
    public void before() {
        System.out.println("Before test");
    }
    @AfterAll
    public static void after() {
        System.out.println("After test");
    }
    @Test
    public  void sum_with3numbers() {
        System.out.println("Test1");
        MyMath myMath = new MyMath();
        int result = myMath.sum(new int[] {1, 2, 3});
        assertEquals(6, result);
        System.out.println(result);
    }
    @Test
    public void sum_with1number() {
        System.out.println("Test2");
        assertEquals(3,new MyMath().sum(new int[] {3}));
    }
}