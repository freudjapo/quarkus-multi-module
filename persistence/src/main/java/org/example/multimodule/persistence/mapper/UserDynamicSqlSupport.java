package org.example.multimodule.persistence.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class UserDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-03-09T22:27:21.321044+08:00", comments="Source Table: user")
    public static final User user = new User();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-03-09T22:27:21.328823+08:00", comments="Source field: user.id")
    public static final SqlColumn<Integer> id = user.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-03-09T22:27:21.330052+08:00", comments="Source field: user.nickname")
    public static final SqlColumn<String> nickname = user.nickname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-03-09T22:27:21.331009+08:00", comments="Source field: user.create_time")
    public static final SqlColumn<Date> createTime = user.createTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-03-09T22:27:21.331763+08:00", comments="Source field: user.update_time")
    public static final SqlColumn<Date> updateTime = user.updateTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-03-09T22:27:21.328495+08:00", comments="Source Table: user")
    public static final class User extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> nickname = column("nickname", JDBCType.VARCHAR);

        public final SqlColumn<Date> createTime = column("create_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> updateTime = column("update_time", JDBCType.TIMESTAMP);

        public User() {
            super("user");
        }
    }
}