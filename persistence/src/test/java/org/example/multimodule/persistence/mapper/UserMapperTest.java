package org.example.multimodule.persistence.mapper;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

/**
 * @author Jap
 * 2022-02-28 22:25
 */
@QuarkusTest
class UserMapperTest {
    
    @Inject
    UserMapper mapper;
    
    @Test
    void get(){
        var id = 1;
        var user = mapper.selectByPrimaryKey(id).orElse(null);
        Assertions.assertNotNull(user);
    }
}
