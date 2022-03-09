package org.example.multimodule.persistence;

import io.quarkus.test.junit.QuarkusTestProfile;

/**
 * @author Jap
 * 2022-03-03 22:40
 */
public class TestProfile implements QuarkusTestProfile {
    
    @Override
    public String getConfigProfile() {
        return "dev";
    }
}
