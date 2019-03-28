package com.example.learningservice.service.impl;

import com.example.learningservice.mapper.SubjectMapper;
import com.example.learningservice.model.Subject;
import com.example.learningservice.service.ISubjectService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * 科目菜单表 服务实现类
 * </p>
 *
 * @author SunYing
 * @since 2019-02-24
 */
@Service
@Transactional
public class SubjectServiceImpl extends ServiceImpl<SubjectMapper, Subject> implements ISubjectService {

}
