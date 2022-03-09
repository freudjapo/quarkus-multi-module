package org.example.multimodule.persistence;

import io.quarkus.logging.Log;
import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.junit.TestProfile;
import org.eclipse.microprofile.config.ConfigProvider;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Jap
 * 2022-02-28 15:47
 */
@QuarkusTest
@TestProfile(value = org.example.multimodule.persistence.TestProfile.class)
class PersistenceTest {
    
    @Test
    void getProperties(){
        String name = "greeting.info";
        String value = ConfigProvider.getConfig().getValue(name, String.class);
        Log.info("the value is: " + value);
        Assertions.assertNotNull(value);
    }
}
