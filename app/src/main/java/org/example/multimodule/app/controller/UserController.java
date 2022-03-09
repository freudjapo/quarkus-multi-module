package org.example.multimodule.app.controller;

import org.example.multimodule.persistence.domain.User;
import org.example.multimodule.persistence.mapper.UserMapper;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Date;
import java.util.List;

/**
 * @author Jap
 * 2022-02-27 12:14
 */
@Path("user")
public class UserController {
    
    @Inject
    UserMapper mapper;
    
    @POST
    @Path("insert")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Transactional
    public User save(@FormParam("nickname") String nickname){
        var user = new User();
        user.setNickname(nickname);
        user.setCreateTime(new Date());
        user.setUpdateTime(new Date());
        mapper.insertSelective(user);
        return user;
    }
    
    @GET
    @Path("select")
    @Produces(MediaType.APPLICATION_JSON)
    public List<User> select(){
        return mapper.select(null);
    }
}
