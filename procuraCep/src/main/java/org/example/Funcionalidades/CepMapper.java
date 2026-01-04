package org.example.Funcionalidades;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.records.Cep;

public class CepMapper {
    private static final ObjectMapper mapper = new ObjectMapper();

    public static Cep fromJson(String json) throws Exception {
        return mapper.readValue(json, Cep.class);
    }
}
