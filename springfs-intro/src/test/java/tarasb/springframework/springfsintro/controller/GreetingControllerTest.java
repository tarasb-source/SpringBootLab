package tarasb.springframework.springfsintro.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import tarasb.springframework.springfsintro.model.GreetingDto;
import tarasb.springframework.springfsintro.services.GreetingService;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
public class GreetingControllerTest {
  @Mock
  private GreetingService greetingService;

  private MockMvc mockMvc;

  @BeforeEach
  void setUp() {
    MockitoAnnotations.openMocks(this);
    GreetingController greetingController = new GreetingController(greetingService);
    mockMvc = MockMvcBuilders.standaloneSetup(greetingController).build();
  }

  @Test
  public void testGetGreeting() throws Exception {
    GreetingDto expectedGreeting = new GreetingDto(1, "Hello World");
    when(greetingService.getGreeting()).thenReturn(expectedGreeting);

    mockMvc.perform(get("/api/v1/greeting"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.id").value(1))
        .andExpect(jsonPath("$.greeting").value("Hello World"));
  }
}
