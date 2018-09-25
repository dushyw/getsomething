package com.dusk.getsomething.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dusk.getsomething.entity.User;
import com.dusk.getsomething.mapper.UserMapper;
import com.dusk.getsomething.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yuanwei
 * @since 2018-09-25
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Autowired
    private  UserMapper userMapper;

    public Page<User> selectUserPage(Page<User> page, Integer state) {
        // 不进行 count sql 优化，解决 MP 无法自动优化 SQL 问题
        // page.setOptimizeCountSql(false);
        // 不查询总记录数
        // page.setSearchCount(false);
        // 注意！！ 分页 total 是经过插件自动 回写 到传入 page 对象
//        return page.setRecords(userMapper.selectUserList(page, state));
        return null;
    }
}
