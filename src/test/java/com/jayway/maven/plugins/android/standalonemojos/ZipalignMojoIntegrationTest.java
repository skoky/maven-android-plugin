package com.jayway.maven.plugins.android.standalonemojos;

import static org.junit.Assert.assertTrue;
import io.takari.maven.testing.it.VerifierResult;

import java.io.File;

import org.apache.maven.it.Verifier;
import org.junit.Test;

import com.jayway.maven.plugins.android.AbstractAndroidMojoIntegrationTest;

public class ZipalignMojoIntegrationTest extends AbstractAndroidMojoIntegrationTest {

  protected ZipalignMojoIntegrationTest(String mavenVersion) throws Exception {
    super(mavenVersion);
  }
  
  @Test
  public void testBasic() throws Exception {
    // File basedir = resources.getBasedir("basic");

    File basedir = new File("target/verifier/", getClass().getSimpleName() + "/" + "testVerifier");
    basedir.mkdirs();
    
    VerifierResult result = verifier
          .forProject(basedir)
          // switch on debug logging
          // .withCliOptions("-X") // somehow this is not on the classpath, must have old version or so
          .execute("compile");

    result.assertErrorFreeLog();

    //result.assertLogText(""); 

    //TestResources.assertFilesPresent(basedir, "target/sample/sample.txt");
  }

}
