package com.jayway.maven.plugins.android.standalonemojos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;

import org.apache.maven.it.VerificationException;
import org.apache.maven.it.Verifier;
import org.junit.Test;

import com.jayway.maven.plugins.android.VerifierTestHelper;

public class ZipalignMojoVerifierTest  {

    
    @Test
    public void testVerifier() throws VerificationException 
    {
        File testFolder = new File("target/verifier/", getClass().getSimpleName() + "/" + "testVerifier");
        testFolder.mkdirs();
        Verifier verifier = new Verifier(testFolder.getAbsolutePath());
        assertTrue(verifier != null);
    }
    
    @Test
    public void testZipalignMojoDefaultConfig() throws VerificationException
    {
        String testProjectFolder = VerifierTestHelper.getTestProjectFolder("zipalign-config-project0");
        Verifier verifier = new Verifier(testProjectFolder);
        verifier.executeGoal("com.jayway.maven.plugins.android.generation2:android-maven-plugin:zipalign");
    }

}
