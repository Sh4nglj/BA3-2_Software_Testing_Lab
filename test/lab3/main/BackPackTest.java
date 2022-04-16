//package lab3.main;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;

import java.util.Arrays;

import static org.junit.Assert.*;

/** 
* BackPack Tester. 
* 
* @author sh4nglj 
* @since <pre>03/28/2022</pre> 
* @version 1.0 
*/ 
public class BackPackTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: main(String[] args) 
* 
*/ 
@Test
public void testMain() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: BackPack_Solution(int m, int n, int[] w, int[] p) 
* 
*/ 
@Test
public void testBackPack_Solution() throws Exception { 
//TODO: Test goes here... 
    //最大容量为10
    int m = 10;
    int n = 3;
        /*
        放入的三个物体重量分别为3， 4， 5；价值分别为4， 5， 6
         */
    int[] w = {3, 4, 5};
    int[] p = {4, 5, 6};
    int[][] result = {{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 4, 4, 4, 4, 4, 4, 4, 4},
            {0, 0, 0, 4, 5, 5, 5, 9, 9, 9, 9},
            {0, 0, 0, 4, 5, 6, 6, 9, 10, 11, 11}};
    BackPack b = new BackPack();
    assertArrayEquals(result, b.BackPack_Solution(m, n, w, p));
}


} 
