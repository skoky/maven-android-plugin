package com.jayway.maven.plugins.android;

import java.util.Arrays;

import io.takari.maven.testing.TestResources;
import io.takari.maven.testing.it.VerifierRuntime;

import org.junit.Rule;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public abstract class AbstractAndroidMojoIntegrationTest {

  @Rule
  public final TestResources resources;

  public final VerifierRuntime verifier;

  protected AbstractAndroidMojoIntegrationTest(String mavenVersion) throws Exception {
    this.resources = new TestResources("src/test/its", "target/it/" + mavenVersion + "/");
    this.verifier = VerifierRuntime.builder(mavenVersion).build();
  }

  /**
   * The Maven versions used for running the IT tests. Requires config in pom.xml 
   * with dependency plugin unpacking Maven version into ${project.build.directory}/maven-installation.
   * @return
   */
  @Parameters(name = "maven-{0}")
  public static Iterable<Object[]> mavenVersions() {
    return Arrays.<Object[]>asList( 
        //    new Object[] {"3.0.5"},
        new Object[] {"3.2.2"} 
        );
  }  
}
