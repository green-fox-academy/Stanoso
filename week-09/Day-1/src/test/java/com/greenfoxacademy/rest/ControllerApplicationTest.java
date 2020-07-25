package com.greenfoxacademy.rest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import javax.persistence.Table;

@AutoConfigureMockMvc
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ControllerApplicationTest {

    @LocalServerPort
    private int port;

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void doubling_OKInput() throws Exception {
        this.mockMvc.perform(get("http://localhost:" + port + "/doubling?input=2"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.result").value(4));
    }

    @Test
    public void doubling_KOInput() throws Exception {
        this.mockMvc.perform(get("http://localhost:" + port + "/doubling?input="))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.error").isString())
                .andExpect(jsonPath("$.error").value("Please provide an input!"));
    }

    @Test
    public void greeter_OKInput() throws Exception {
        this.mockMvc.perform(get("http://localhost:" + port + "/greeter?name=Vader&title=Sith"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.welcome_message").isString())
                .andExpect(jsonPath("$.welcome_message").value("Oh, hi there Vader, my dear Sith!"));
    }

    @Test
    public void greeter_KOInput() throws Exception {
        this.mockMvc.perform(get("http://localhost:" + port + "/greeter"))
                .andExpect(status().is4xxClientError())
                .andExpect(jsonPath("$.error").isString())
                .andExpect(jsonPath("$.error").value("Please provide a name and a title!"));
    }

    @Test
    public void appendA_OKInput() throws Exception {
        this.mockMvc.perform(get("http://localhost:" + port + "/appenda/kuty"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.appended").isString())
                .andExpect(jsonPath("$.appended").value("kutya"));
    }

    @Test
    public void appendA_KOInput() throws Exception {
        this.mockMvc.perform(get("http://localhost:" + port + "/appenda"))
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void doUntil_OKInput_sumOfInput() throws  Exception {
        mockMvc.perform(post("http://localhost:" + port + "/dountil/sum")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"until\":\"7\"}"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.result").value(28));
    }

    @Test
    public void doUntil_OKInput_factorOfInput() throws  Exception {
        mockMvc.perform(post("http://localhost:" + port + "/dountil/factor")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"until\":\"4\"}"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.result").value(24));
    }

    @Test
    public void doUntil_OKInput_returnError() throws  Exception {
        mockMvc.perform(post("http://localhost:" + port + "/dountil/whatever")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"until\":\"4\"}"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.error").value("Please provide a number!"));
    }

    @Test
    public void arrays_OKInput_returnSum() throws  Exception {
        mockMvc.perform(post("http://localhost:" + port + "/arrays")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"what\":\"sum\", \"numbers\":[1,2,5,10]}"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.result").value(18))
                .andExpect(jsonPath("$.numbers").exists())
                .andExpect(jsonPath("$.numbers").isArray())
                .andExpect(jsonPath("$.numbers").isNotEmpty());
    }

    @Test
    public void arrays_KOInput_returnError() throws  Exception {
        mockMvc.perform(post("http://localhost:" + port + "/arrays")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"what\":\"sum\", \"number\":[1,2,5,10]}"))
                .andExpect(status().is4xxClientError())
                .andExpect(jsonPath("$.error").value("Please provide what to do with the numbers!"));
    }


}
