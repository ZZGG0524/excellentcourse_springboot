package com.wulaobo.mapper;

import com.wulaobo.bean.Answer;

public interface AnswerMapper {

    int getReplyNumById(Integer id);

    boolean addAnswer(Answer answer);
}
