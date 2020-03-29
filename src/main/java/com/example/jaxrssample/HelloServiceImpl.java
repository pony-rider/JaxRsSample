package com.example.jaxrssample;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
@RequiredArgsConstructor
public class HelloServiceImpl implements HelloService {
    private final SimpleBean simpleBean;

    @Override
    public String hello(HttpServletRequest request) {
        String name = request.getParameter("name");
        return name != null ? "hello, " + name : "hello, " + simpleBean.getProperty();
    }
}
