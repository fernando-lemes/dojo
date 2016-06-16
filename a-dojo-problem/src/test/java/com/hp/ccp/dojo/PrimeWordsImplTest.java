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

    @Before
    public void initilizeAlphabet() {
        ArrayList alpha = new ArrayList<String>(
                Arrays.asList("a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z"));
        for (int i = 0 ; i < alpha.size(); i++) {
            alphabet.put(alpha.get(i).toString(), i);
        }

        for (int i = 0 ; i < alpha.size(); i++) {
            alphabet.put(alpha.get(i).toString(), i);
        }
    }


    @Test
    public void checkIfNumberIsPrime() {

    }

    @Test
    public void isPrimeWord_3as_shouldReturnTrue() {
        assertTrue(primeWords.isPrimeWord("aaa"));
    }

    @Test
    public void isPrimeWord_3As_shouldReturnFalse(){
        assertFalse(primeWords.isPrimeWord("AAA"));
    }

    @Test
    public void isPrimeWord_passNonWordPrime_false(){

    }
}
