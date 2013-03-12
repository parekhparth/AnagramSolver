package com.parthparekh.algorithms;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.Set;


/**
 * Unit test for AnagramSolver class
 *
 * @author: Parth Parekh
 */
public class AnagramSolverTest {

    private AnagramSolver anagramSolver;

    @Before
    public void setUp() throws IOException {
        String executionPath = System.getProperty("user.dir");
        String fileSeparator = System.getProperty("file.separator");
        String wordListPath = executionPath + fileSeparator + "wordlist" + fileSeparator + "wordlist.txt";
        anagramSolver = new AnagramSolver(3, wordListPath);
    }

    @Test
    public void findAnagramsTest() throws IOException {
        Set<Set<String>> anagrams = anagramSolver.findAllAnagrams("silent");
        Assert.assertNotNull(anagrams);
        Assert.assertEquals(10, anagrams.size());
    }
}
