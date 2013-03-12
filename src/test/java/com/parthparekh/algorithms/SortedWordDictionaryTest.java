package com.parthparekh.algorithms;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;


/**
 * Unit test for SortedWordDictionary class
 *
 * @author: Parth Parekh
 */
public class SortedWordDictionaryTest {

    private SortedWordDictionary sortedWordDictionary;

    @Before
    public void setUp() throws IOException {
        sortedWordDictionary = new SortedWordDictionary();
        loadDictionary();
    }

    private void loadDictionary() throws IOException {
        String executionPath = System.getProperty("user.dir");
        String fileSeparator = System.getProperty("file.separator");
        sortedWordDictionary.loadDictionary(executionPath + fileSeparator + "wordlist" + fileSeparator + "wordlist.txt");
    }

    @Test
    public void fileLoadTest() {
        Assert.assertTrue(sortedWordDictionary.isDictionaryLoaded());
    }

    @Test
    public void addWordTest() {
        Assert.assertTrue(sortedWordDictionary.addWord("parth"));
    }

    @Test
    public void findSingleWordAnagramsTest() {
        Assert.assertEquals(4, sortedWordDictionary.findSingleWordAnagrams("tea").size());
        Assert.assertEquals(5, sortedWordDictionary.findSingleWordAnagrams("enlist").size());
    }
}
