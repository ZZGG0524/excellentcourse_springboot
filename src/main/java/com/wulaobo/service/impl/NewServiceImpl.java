package com.wulaobo.service.impl;

import com.wulaobo.bean.News;
import com.wulaobo.mapper.NewsMapper;
import com.wulaobo.service.NewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class NewServiceImpl implements NewService {


    @Autowired
    private NewsMapper newsMapper;

    @Override
    public List<News> getAllNews() {
        return newsMapper.getAllNews();
    }

    @Override
    public News getNewsById(Integer id) {
        return newsMapper.getNewsById(id);
    }
}
