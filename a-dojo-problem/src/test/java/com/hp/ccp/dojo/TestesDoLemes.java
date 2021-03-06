package com.hp.ccp.dojo;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;
import org.junit.Test;

/**
 * Some other tests
 */
public class TestesDoLemes {

    PrimeWords primeWords = new PrimeWordsImpl();

    @Test
    public void zeroLengthWord_shouldNotBePrime() {
        assertFalse(primeWords.isPrimeWord(""));
    }

    @Test
    public void realBigWord_shouldNotTakeMoreThan100ms() {
        long startMillis = System.currentTimeMillis();
        primeWords.isPrimeWord("CDSCDSCSDCSDCCSDNCJSDNCJKSDNCJSDNCDNCJKSDNCKJSDNCJKSDNCJKSDNCK" +
                "JSDNCJKSDNCJNCKSDNCSJKDCBSDCBVSDJHKVFWEFIFBDCARBBDVBVHDFBVDFHBVRIEUVUIOBVNDBV" +

                "SDFBVDFUIVBDFJKVBDFVISBFVJKFBVSDFJKBVDFJKLBVDFKBJVFDJKVBSJKVBVJKBSVJKBSFVJKDF" +
                "JSDNCJKSDNCJNCKSDNCSJKDCBSDCBVSDJHKVFWEFIFBDCARBBDVBVHDFBVDFHBVRIEUVUIOBVNDBV" +
                "SDFBVDFUIVBDFJKVBDFVISBFVJKFBVSDFJKBVDFJKLBVDFKBJVFDJKVBSJKVBVJKBSVJKBSFVJKDF" +
                "JSDNCJKSDNCJNCKSDNCSJKDCBSDCBVSDJHKVFWEFIFBDCARBBDVBVHDFBVDFHBVRIEUVUIOBVNDBV" +
                "SDFBVDFUIVBDFJKVBDFVISBFVJKFBVSDFJKBVDFJKLBVDFKBJVFDJKVBSJKVBVJKBSVJKBSFVJKDF" +
                "JSDNCJKSDNCJNCKSDNCSJKDCBSDCBVSDJHKVFWEFIFBDCARBBDVBVHDFBVDFHBVRIEUVUIOBVNDBV" +
                "SDFBVDFUIVBDFJKVBDFVISBFVJKFBVSDFJKBVDFJKLBVDFKBJVFDJKVBSJKVBVJKBSVJKBSFVJKDF" +
                "JSDNCJKSDNCJNCKSDNCSJKDCBSDCBVSDJHKVFWEFIFBDCARBBDVBVHDFBVDFHBVRIEUVUIOBVNDBV" +
                "SDFBVDFUIVBDFJKVBDFVISBFVJKFBVSDFJKBVDFJKLBVDFKBJVFDJKVBSJKVBVJKBSVJKBSFVJKDF" +
                "JSDNCJKSDNCJNCKSDNCSJKDCBSDCBVSDJHKVFWEFIFBDCARBBDVBVHDFBVDFHBVRIEUVUIOBVNDBV" +
                "SDFBVDFUIVBDFJKVBDFVISBFVJKFBVSDFJKBVDFJKLBVDFKBJVFDJKVBSJKVBVJKBSVJKBSFVJKDF" +
                "JSDNCJKSDNCJNCKSDNCSJKDCBSDCBVSDJHKVFWEFIFBDCARBBDVBVHDFBVDFHBVRIEUVUIOBVNDBV" +
                "SDFBVDFUIVBDFJKVBDFVISBFVJKFBVSDFJKBVDFJKLBVDFKBJVFDJKVBSJKVBVJKBSVJKBSFVJKDF" +
                "JSDNCJKSDNCJNCKSDNCSJKDCBSDCBVSDJHKVFWEFIFBDCARBBDVBVHDFBVDFHBVRIEUVUIOBVNDBV" +
                "SDFBVDFUIVBDFJKVBDFVISBFVJKFBVSDFJKBVDFJKLBVDFKBJVFDJKVBSJKVBVJKBSVJKBSFVJKDF" +
                "JSDNCJKSDNCJNCKSDNCSJKDCBSDCBVSDJHKVFWEFIFBDCARBBDVBVHDFBVDFHBVRIEUVUIOBVNDBV" +
                "SDFBVDFUIVBDFJKVBDFVISBFVJKFBVSDFJKBVDFJKLBVDFKBJVFDJKVBSJKVBVJKBSVJKBSFVJKDF" +
                "JSDNCJKSDNCJNCKSDNCSJKDCBSDCBVSDJHKVFWEFIFBDCARBBDVBVHDFBVDFHBVRIEUVUIOBVNDBV" +
                "SDFBVDFUIVBDFJKVBDFVISBFVJKFBVSDFJKBVDFJKLBVDFKBJVFDJKVBSJKVBVJKBSVJKBSFVJKDF" +
                "JSDNCJKSDNCJNCKSDNCSJKDCBSDCBVSDJHKVFWEFIFBDCARBBDVBVHDFBVDFHBVRIEUVUIOBVNDBV" +
                "SDFBVDFUIVBDFJKVBDFVISBFVJKFBVSDFJKBVDFJKLBVDFKBJVFDJKVBSJKVBVJKBSVJKBSFVJKDF" +
                "JSDNCJKSDNCJNCKSDNCSJKDCBSDCBVSDJHKVFWEFIFBDCARBBDVBVHDFBVDFHBVRIEUVUIOBVNDBV" +
                "SDFBVDFUIVBDFJKVBDFVISBFVJKFBVSDFJKBVDFJKLBVDFKBJVFDJKVBSJKVBVJKBSVJKBSFVJKDF" +
                "SDFBVDFUIVBDFJKVBDFVISBFVJKFBVSDFJKBVDFJKLBVDFKBJVFDJKVBSJKVBVJKBSVJKBSFVJKDF" +
                "JSDNCJKSDNCJNCKSDNCSJKDCBSDCBVSDJHKVFWEFIFBDCARBBDVBVHDFBVDFHBVRIEUVUIOBVNDBV" +
                "SDFBVDFUIVBDFJKVBDFVISBFVJKFBVSDFJKBVDFJKLBVDFKBJVFDJKVBSJKVBVJKBSVJKBSFVJKDF" +
                "JSDNCJKSDNCJNCKSDNCSJKDCBSDCBVSDJHKVFWEFIFBDCARBBDVBVHDFBVDFHBVRIEUVUIOBVNDBV" +
                "SDFBVDFUIVBDFJKVBDFVISBFVJKFBVSDFJKBVDFJKLBVDFKBJVFDJKVBSJKVBVJKBSVJKBSFVJKDF" +
                "JSDNCJKSDNCJNCKSDNCSJKDCBSDCBVSDJHKVFWEFIFBDCARBBDVBVHDFBVDFHBVRIEUVUIOBVNDBV" +
                "SDFBVDFUIVBDFJKVBDFVISBFVJKFBVSDFJKBVDFJKLBVDFKBJVFDJKVBSJKVBVJKBSVJKBSFVJKDF" +
                "JSDNCJKSDNCJNCKSDNCSJKDCBSDCBVSDJHKVFWEFIFBDCARBBDVBVHDFBVDFHBVRIEUVUIOBVNDBV" +
                "SDFBVDFUIVBDFJKVBDFVISBFVJKFBVSDFJKBVDFJKLBVDFKBJVFDJKVBSJKVBVJKBSVJKBSFVJKDF" +
                "JSDNCJKSDNCJNCKSDNCSJKDCBSDCBVSDJHKVFWEFIFBDCARBBDVBVHDFBVDFHBVRIEUVUIOBVNDBV" +
                "SDFBVDFUIVBDFJKVBDFVISBFVJKFBVSDFJKBVDFJKLBVDFKBJVFDJKVBSJKVBVJKBSVJKBSFVJKDF" +
                "JSDNCJKSDNCJNCKSDNCSJKDCBSDCBVSDJHKVFWEFIFBDCARBBDVBVHDFBVDFHBVRIEUVUIOBVNDBV" +
                "SDFBVDFUIVBDFJKVBDFVISBFVJKFBVSDFJKBVDFJKLBVDFKBJVFDJKVBSJKVBVJKBSVJKBSFVJKDF" +
                "JSDNCJKSDNCJNCKSDNCSJKDCBSDCBVSDJHKVFWEFIFBDCARBBDVBVHDFBVDFHBVRIEUVUIOBVNDBV" +
                "SDFBVDFUIVBDFJKVBDFVISBFVJKFBVSDFJKBVDFJKLBVDFKBJVFDJKVBSJKVBVJKBSVJKBSFVJKDF" +
                "JSDNCJKSDNCJNCKSDNCSJKDCBSDCBVSDJHKVFWEFIFBDCARBBDVBVHDFBVDFHBVRIEUVUIOBVNDBV" +
                "SDFBVDFUIVBDFJKVBDFVISBFVJKFBVSDFJKBVDFJKLBVDFKBJVFDJKVBSJKVBVJKBSVJKBSFVJKDF" +
                "JSDNCJKSDNCJNCKSDNCSJKDCBSDCBVSDJHKVFWEFIFBDCARBBDVBVHDFBVDFHBVRIEUVUIOBVNDBV" +
                "SDFBVDFUIVBDFJKVBDFVISBFVJKFBVSDFJKBVDFJKLBVDFKBJVFDJKVBSJKVBVJKBSVJKBSFVJKDF" +
                "JSDNCJKSDNCJNCKSDNCSJKDCBSDCBVSDJHKVFWEFIFBDCARBBDVBVHDFBVDFHBVRIEUVUIOBVNDBV" +
                "SDFBVDFUIVBDFJKVBDFVISBFVJKFBVSDFJKBVDFJKLBVDFKBJVFDJKVBSJKVBVJKBSVJKBSFVJKDF" +
                "JSDNCJKSDNCJNCKSDNCSJKDCBSDCBVSDJHKVFWEFIFBDCARBBDVBVHDFBVDFHBVRIEUVUIOBVNDBV" +
                "SDFBVDFUIVBDFJKVBDFVISBFVJKFBVSDFJKBVDFJKLBVDFKBJVFDJKVBSJKVBVJKBSVJKBSFVJKDF" +
                "SDFBVDFUIVBDFJKVBDFVISBFVJKFBVSDFJKBVDFJKLBVDFKBJVFDJKVBSJKVBVJKBSVJKBSFVJKDF" +
                "JSDNCJKSDNCJNCKSDNCSJKDCBSDCBVSDJHKVFWEFIFBDCARBBDVBVHDFBVDFHBVRIEUVUIOBVNDBV" +
                "SDFBVDFUIVBDFJKVBDFVISBFVJKFBVSDFJKBVDFJKLBVDFKBJVFDJKVBSJKVBVJKBSVJKBSFVJKDF" +
                "JSDNCJKSDNCJNCKSDNCSJKDCBSDCBVSDJHKVFWEFIFBDCARBBDVBVHDFBVDFHBVRIEUVUIOBVNDBV" +
                "SDFBVDFUIVBDFJKVBDFVISBFVJKFBVSDFJKBVDFJKLBVDFKBJVFDJKVBSJKVBVJKBSVJKBSFVJKDF" +
                "JSDNCJKSDNCJNCKSDNCSJKDCBSDCBVSDJHKVFWEFIFBDCARBBDVBVHDFBVDFHBVRIEUVUIOBVNDBV" +
                "SDFBVDFUIVBDFJKVBDFVISBFVJKFBVSDFJKBVDFJKLBVDFKBJVFDJKVBSJKVBVJKBSVJKBSFVJKDF" +
                "JSDNCJKSDNCJNCKSDNCSJKDCBSDCBVSDJHKVFWEFIFBDCARBBDVBVHDFBVDFHBVRIEUVUIOBVNDBV" +
                "SDFBVDFUIVBDFJKVBDFVISBFVJKFBVSDFJKBVDFJKLBVDFKBJVFDJKVBSJKVBVJKBSVJKBSFVJKDF" +
                "JSDNCJKSDNCJNCKSDNCSJKDCBSDCBVSDJHKVFWEFIFBDCARBBDVBVHDFBVDFHBVRIEUVUIOBVNDBV" +
                "SDFBVDFUIVBDFJKVBDFVISBFVJKFBVSDFJKBVDFJKLBVDFKBJVFDJKVBSJKVBVJKBSVJKBSFVJKDF" +
                "JSDNCJKSDNCJNCKSDNCSJKDCBSDCBVSDJHKVFWEFIFBDCARBBDVBVHDFBVDFHBVRIEUVUIOBVNDBV" +
                "SDFBVDFUIVBDFJKVBDFVISBFVJKFBVSDFJKBVDFJKLBVDFKBJVFDJKVBSJKVBVJKBSVJKBSFVJKDF" +
                "JSDNCJKSDNCJNCKSDNCSJKDCBSDCBVSDJHKVFWEFIFBDCARBBDVBVHDFBVDFHBVRIEUVUIOBVNDBV" +
                "SDFBVDFUIVBDFJKVBDFVISBFVJKFBVSDFJKBVDFJKLBVDFKBJVFDJKVBSJKVBVJKBSVJKBSFVJKDF" +
                "JSDNCJKSDNCJNCKSDNCSJKDCBSDCBVSDJHKVFWEFIFBDCARBBDVBVHDFBVDFHBVRIEUVUIOBVNDBV" +
                "SDFBVDFUIVBDFJKVBDFVISBFVJKFBVSDFJKBVDFJKLBVDFKBJVFDJKVBSJKVBVJKBSVJKBSFVJKDF" +
                "JSDNCJKSDNCJNCKSDNCSJKDCBSDCBVSDJHKVFWEFIFBDCARBBDVBVHDFBVDFHBVRIEUVUIOBVNDBV" +
                "SDFBVDFUIVBDFJKVBDFVISBFVJKFBVSDFJKBVDFJKLBVDFKBJVFDJKVBSJKVBVJKBSVJKBSFVJKDF" +
                "JSDNCJKSDNCJNCKSDNCSJKDCBSDCBVSDJHKVFWEFIFBDCARBBDVBVHDFBVDFHBVRIEUVUIOBVNDBV" +
                "SDFBVDFUIVBDFJKVBDFVISBFVJKFBVSDFJKBVDFJKLBVDFKBJVFDJKVBSJKVBVJKBSVJKBSFVJKDF" +
                "JSDNCJKSDNCJNCKSDNCSJKDCBSDCBVSDJHKVFWEFIFBDCARBBDVBVHDFBVDFHBVRIEUVUIOBVNDBV" +
                "SDFBVDFUIVBDFJKVBDFVISBFVJKFBVSDFJKBVDFJKLBVDFKBJVFDJKVBSJKVBVJKBSVJKBSFVJKDF" +
                "JSDNCJKSDNCJNCKSDNCSJKDCBSDCBVSDJHKVFWEFIFBDCARBBDVBVHDFBVDFHBVRIEUVUIOBVNDBV" +
                "SDFBVDFUIVBDFJKVBDFVISBFVJKFBVSDFJKBVDFJKLBVDFKBJVFDJKVBSJKVBVJKBSVJKBSFVJKDF" +
                "BSVJKSDFBVJKSDFBVIFUDJBVFJKBVDFUIBVDFUIBVSDFJKBVDFJKVBSDLVJKBFDVJKLBDFVJKBFSD" +
                "VJKBSDVJKBSDLVJKBSDFKL");
        long stopMillis = System.currentTimeMillis();
        long cpuTimeUsed = stopMillis - startMillis;
        assertTrue(cpuTimeUsed < 3);
    }

}
