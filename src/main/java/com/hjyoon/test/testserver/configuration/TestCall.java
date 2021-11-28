package com.hjyoon.test.testserver.configuration;

import com.hjyoon.repo.TestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestCall {

    private final TestUtils testUtils;

    @Autowired
    public TestCall(TestUtils testUtils) {
        this.testUtils = testUtils;

        System.out.println(this.testUtils.getParams());
    }
}
