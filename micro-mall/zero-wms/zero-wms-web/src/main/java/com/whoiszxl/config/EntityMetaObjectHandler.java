package com.whoiszxl.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * TODO
 *
 * @author whoiszxl
 * @date 2021/7/12
 */
@Component
public class EntityMetaObjectHandler implements MetaObjectHandler {

    @Override
    public void insertFill(MetaObject metaObject) {
        this.setFieldValByName("createdBy", "default", metaObject);
        this.setFieldValByName("updatedBy", "default", metaObject);
        this.setFieldValByName("createdAt", new Date(), metaObject);
        this.setFieldValByName("updatedAt", new Date(), metaObject);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        this.setFieldValByName("updatedAt", new Date(), metaObject);
        this.setFieldValByName("updatedBy", "default", metaObject);
    }
}
