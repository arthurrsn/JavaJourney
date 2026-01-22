package com.learn.java.OmdbApi.service;

import com.learn.java.OmdbApi.model.ReturnOmdb;

import java.io.IOException;

public interface IOmbdService<T> {
    ReturnOmdb search(String name) throws IOException, InterruptedException;
}
