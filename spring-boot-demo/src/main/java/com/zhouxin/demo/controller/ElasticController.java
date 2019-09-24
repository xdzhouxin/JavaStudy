package com.zhouxin.demo.controller;

import com.zhouxin.demo.dao.BookRepository;
import com.zhouxin.demo.data.Book;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


/**
 * ElasticController
 *
 * @author zhouxin
 * @since 2019/09/24
 */
@Slf4j
@RestController
public class ElasticController {
    @Resource
    private BookRepository bookRepository;

    @RequestMapping("/save")
    @ResponseBody
    public void save(){
        Book book = new Book("1","ElasticSearch实战", "杜拉·乔戈");
        Book res = bookRepository.save(book);
        log.info("bookBean: {}", res);
    }
    @RequestMapping("/delete")
    public void delete() {
        bookRepository.deleteById("1");
    }

}