package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

public class CepMapper {
    private static final ObjectMapper mapper = new ObjectMapper();

    public static Cep fromJson(String json) throws Exception {
        return mapper.readValue(json, Cep.class);
    }
}
