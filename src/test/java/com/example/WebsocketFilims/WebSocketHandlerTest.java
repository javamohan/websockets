package com.example.WebsocketFilims;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doThrow;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;

@RunWith(SpringRunner.class)
@WebMvcTest(value = WebSocketHandlerTest.class)
public class WebSocketHandlerTest {

	@Mock
	private WebSocketHandler webSocketHandler;
	@Mock
	WebSocketSession session;
	@Mock
	TextMessage message;

	@Before
	public void setup() {

	}

	@Test(expected = Exception.class)
	public void addMaterials_test() throws Exception {
		webSocketHandler.handleMessage(session, message);
		session.sendMessage(message);
		doNothing().when(session.sendMessage(message));
	}

}
