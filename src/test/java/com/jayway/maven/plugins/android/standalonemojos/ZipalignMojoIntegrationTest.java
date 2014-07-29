package com.jayway.maven.plugins.android.standalonemojos;

import io.takari.maven.testing.it.VerifierResult;

import java.io.File;

import org.junit.Test;

import com.jayway.maven.plugins.android.AbstractAndroidMojoIntegrationTest;

public class ZipalignMojoIntegrationTest extends AbstractAndroidMojoIntegrationTest {

  public ZipalignMojoIntegrationTest(String mavenVersion) throws Exception {
    super(mavenVersion);
  }
  
  
  @Test
  public void testBasic() throws Exception {
    File basedir = resources.getBasedir("zipalign-config-project0");

//    File basedir = new File("target/verifier/", getClass().getSimpleName() + "/" + "testVerifier");
//    basedir.mkdirs();
    
    VerifierResult result = verifier
          .forProject(basedir)
          // switch on debug logging
          // .withCliOptions("-X") // somehow this is not on the classpath, must have old version or so
          //.execute("compile");
    .execute("com.jayway.maven.plugins.android.generation2:android-maven-plugin:zipalign");

    result.assertErrorFreeLog();

    result.assertLogText("Skipping zipalign on jar"); 

    //TestResources.assertFilesPresent(basedir, "target/sample/sample.txt");
  }

}
