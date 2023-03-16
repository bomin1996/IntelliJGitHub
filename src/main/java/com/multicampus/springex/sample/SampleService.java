package com.multicampus.springex.sample;

import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

//DI 실습
@Service
@ToString
@RequiredArgsConstructor
public class SampleService {
    /*@Autowired
    * private SampleDAO sampleDAO;  //field Injection */
    @Qualifier("normal")
    private final SampleDAO sampleDAO; //생성자 injection
}
