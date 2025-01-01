//package com.ai.Bea.message.controller;
//
//import com.ai.Bea.message.dto.MessageDTO;
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//
//import static org.mockito.Mockito.when;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
//
//class MessageControllerTest {
//
//    @Autowired
//    private MessageDTO messageDTO;
//
//    @Autowired
//    private MessageController messageController;
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @Test
//    void sendMessagePython() throws Exception {
//        // Configura o mock do MockMvc
//        mockMvc = MockMvcBuilders.standaloneSetup(messageController).build();
//
//        // Configura o comportamento esperado do método
//        when(messageDTO.message()).thenReturn("Test Message");
//
//        // Realiza a requisição POST e valida a resposta
//        mockMvc.perform(post("/bea/send")
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content("{\"message\":\"Test Message\"}"))
//                .andExpect(status().isOk())
//                .andExpect(content().string("Done!"));
//    }
//}
