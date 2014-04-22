package com.jayway.maven.plugins.android.standalonemojos;

import static org.junit.Assert.assertTrue;

import java.io.File;

import org.apache.maven.it.VerificationException;
import org.apache.maven.it.Verifier;
import org.junit.Test;

public class ZipalignMojoVerifierTest  {

    
    @Test
    public void testVerifier() throws VerificationException 
    {
        File testFolder = new File("target/verifier/", getClass().getSimpleName() + "/" + "testVerifier");
        testFolder.mkdirs();
        Verifier verifier = new Verifier(testFolder.getAbsolutePath());
        assertTrue(verifier != null);
    }
}
