package com.parthparekh.algorithms;

import junit.framework.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


/**
 * Unit test for AnagramSolverHelper functions
 *
 * @author: Parth Parekh
 */
public class AnagramSolverHelperTest {

    @Test
    public void isSubsetTest() {
        Assert.assertTrue(AnagramSolverHelper.isSubset("parth".toCharArray(), "partah".toCharArray()));
        Assert.assertFalse(AnagramSolverHelper.isSubset("partha".toCharArray(), "parth".toCharArray()));
        Assert.assertTrue(AnagramSolverHelper.isSubset("parth".toCharArray(), "parth".toCharArray()));
        Assert.assertTrue(AnagramSolverHelper.isSubset("part".toCharArray(), "parth".toCharArray()));
    }

    @Test
    public void isEquivalentTest() {
        Assert.assertTrue(AnagramSolverHelper.isEquivalent("parth".toCharArray(), "htrap".toCharArray()));
        Assert.assertFalse(AnagramSolverHelper.isEquivalent("parth".toCharArray(), "parekh".toCharArray()));
        Assert.assertFalse(AnagramSolverHelper.isEquivalent("part".toCharArray(), "parth".toCharArray()));
        Assert.assertTrue(AnagramSolverHelper.isEquivalent("parth".toCharArray(), "parth".toCharArray()));
    }

    @Test
    public void setDifferenceTest() {
        Assert.assertTrue(Arrays.equals("t".toCharArray(), AnagramSolverHelper.setDifference("parth".toCharArray(),
                "parekh".toCharArray())));
        Assert.assertTrue(Arrays.equals("".toCharArray(), AnagramSolverHelper.setDifference("parth".toCharArray(),
                "htrap".toCharArray())));
        Assert.assertTrue(Arrays.equals("parth".toCharArray(), AnagramSolverHelper.setDifference("parth".toCharArray(),
                "xyz".toCharArray())));
    }

    @Test
    public void setMultiplicationTest() {
        Set<String> set1 = new HashSet<String>();
        set1.add("parth");
        set1.add("parekh");

        Set<String> set2 = new HashSet<String>();
        set2.add("1");
        set2.add("2");

        Set<String> set3 = new HashSet<String>();
        set3.add("a");

        Assert.assertEquals(4, AnagramSolverHelper.setMultiplication(set1, set2, set3).size());
        set3.add("b");
        Assert.assertEquals(8, AnagramSolverHelper.setMultiplication(set1, set2, set3).size());
        set2.add("3");
        Assert.assertEquals(12, AnagramSolverHelper.setMultiplication(set1, set2, set3).size());
        set3.add("c");
        Assert.assertEquals(18, AnagramSolverHelper.setMultiplication(set1, set2, set3).size());
    }
}
