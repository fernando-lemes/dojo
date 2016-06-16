package com.hp.ccp.dojo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PrimeWordsImplTest {


    PrimeWordsImpl primeWords = new PrimeWordsImpl();

    Map<String, Integer> alphabet = new HashMap<String, Integer>();

    @Test
    public void isPrimeWord_3as_shouldReturnTrue() {
        assertTrue(primeWords.isPrimeWord("aaa"));
    }

    @Test
    public void isPrimeWord_3As_shouldReturnFalse(){
        assertFalse(primeWords.isPrimeWord("AAA"));
    }

    @Test
    public void isPrimeWord_withNumberAndLetters_shouldExcludeNumbers(){
        assertTrue(primeWords.isPrimeWord("aaa24566--.,@#!@#$%¨&*()_+B"));
    }
}
