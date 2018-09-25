package com.dusk.getsomething.mapper;

import com.dusk.getsomething.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import javafx.scene.control.Pagination;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author yuanwei
 * @since 2018-09-25
 */
@Repository
public interface UserMapper extends BaseMapper<User> {
    List<User> selectUserList(Pagination page, Integer state);
}
