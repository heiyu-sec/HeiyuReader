package com.imooc.reader.service;

import com.imooc.reader.mapper.TestMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * 描述：TODO
 */

@Service
public class TestService {


    @Resource
    private TestMapper testMapper;

    @Transactional
    public void batchImport(){
        for(int i = 0 ; i < 5 ;i++){
            if(i==2){
                throw new RuntimeException("未处理异常");
            }
            testMapper.insertSample();
        }
    }
}