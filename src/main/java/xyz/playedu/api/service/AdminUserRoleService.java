package xyz.playedu.api.service;

import xyz.playedu.api.domain.AdminUserRole;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @author tengteng
 * @description 针对表【admin_user_role】的数据库操作Service
 * @createDate 2023-02-21 16:25:43
 */
public interface AdminUserRoleService extends IService<AdminUserRole> {

    void removeUserRolesByUserId(Integer userId);

}
