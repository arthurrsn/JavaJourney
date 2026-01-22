package com.learn.java.OmdbApi.service;

import com.learn.java.OmdbApi.model.ReturnOmdb;
import org.springframework.stereotype.Service;
import tools.jackson.databind.ObjectMapper;

import java.io.IOException;

@Service
public class OmbdService implements IOmbdService{
    @Override
    public ReturnOmdb search(String name) throws IOException, InterruptedException {
        final String uri = "http://www.omdbapi.com/?i=tt3896198&apikey=74638d03&s=" + name;

        String response = MakeRequest.makeRequest(uri);

        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(response, ReturnOmdb.class);
    }
}
