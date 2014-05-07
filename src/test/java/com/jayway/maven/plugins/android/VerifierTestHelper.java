package com.jayway.maven.plugins.android;

import java.io.File;

import org.apache.commons.io.FilenameUtils;

public class VerifierTestHelper {

    public static String getTestProjectFolder(String testProject) {
        String testResourcePath = "target/test-classes/" + testProject;
        testResourcePath = FilenameUtils.separatorsToSystem(testResourcePath);
        return new File(testResourcePath).getAbsolutePath();
    }

}
