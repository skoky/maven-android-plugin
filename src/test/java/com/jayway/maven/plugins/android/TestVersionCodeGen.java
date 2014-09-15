package com.jayway.maven.plugins.android;

import com.jayway.maven.plugins.android.standalonemojos.ManifestUpdateMojo;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ladislav.skokan on 12.9.2014.
 */
public class TestVersionCodeGen {

    @Test
    public void testVersionCodeGen() {
        ManifestUpdateMojo m = new ManifestUpdateMojo();
        String v = m.generateVersionCodeFromVersionName("1.3.35.99.123");
        assertEquals("133599123",v);
        v = m.generateVersionCodeFromVersionName("1.3.35.09.002");
        assertEquals("133509002",v);

    }
}
