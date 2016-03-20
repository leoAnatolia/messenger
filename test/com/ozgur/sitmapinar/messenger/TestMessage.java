package com.ozgur.sitmapinar.messenger;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.ozgur.sitmapinar.messenger.model.Message;

public class TestMessage {

    @Test
    public void controlToString() throws Exception {

        Message msg1 = new Message(18L, "same message", "ozzy");
        Message msg2 = new Message(18L, "same message", "ozzy");

        assertTrue(msg1.equals(msg2));

    }
}
