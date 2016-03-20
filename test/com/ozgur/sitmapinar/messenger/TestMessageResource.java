package com.ozgur.sitmapinar.messenger;

import static org.junit.Assert.assertEquals;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.junit.Test;

import com.ozgur.sitmapinar.messenger.model.Message;
import com.ozgur.sitmapinar.messenger.resources.MessageResource;

public class TestMessageResource extends JerseyTest {

    @Override
    protected Application configure() {
        return new ResourceConfig(MessageResource.class);
    }

    @Test
    public void testPOST() {
        Message msg = new Message(16L, "this jersey test framework", "ozzy osbourne");

        final Response createdMsg = this.target("/messages").request().post(Entity.entity(msg, MediaType.APPLICATION_JSON));

        assertEquals(createdMsg.getStatus(), 200);

    }
}
