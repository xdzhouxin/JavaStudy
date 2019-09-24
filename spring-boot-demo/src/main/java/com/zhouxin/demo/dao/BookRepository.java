package com.zhouxin.demo.dao;

import com.zhouxin.demo.data.Book;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;

/**
 * ElasticsearchRepository
 *
 * @author zhouxin
 * @since 2019/09/24
 */
@Component
public interface BookRepository extends ElasticsearchRepository<Book, String> {

}