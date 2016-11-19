package cn.zeus.bookcase.boot.config;

import cn.zeus.bookcase.web.filter.CORSFilter;
import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.embedded.FilterRegistrationBean;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.filter.HttpPutFormContentFilter;

import javax.servlet.Filter;
import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * Created by lvzimou on 16-8-19.
 */
@Configuration
@EnableTransactionManagement
@ComponentScan("cn.zeus.bookcase")
@EnableAutoConfiguration
public class BCBootConfig {

    // 初始化时数据库连接数
    private static final int INITIAL_THREAD = 5;
    // 空闲时保存数据库连接数
    private static final int MINIDLE_THREAD = 2;
    // 数据库连接池最大连接数
    private static final int MAX_ACTIVE_THREAD = 100;
    // 数据库连接等待的最长时间
    private static final int MAX_WAIT = 1000;
    // 检查连接是否正常的查询
    private static final String CHECK_CONNECTION_QUERY = "Select 'X'";
    // 连接池状态监控过滤器名
    private static final String STAT_FILETER = "mergeStat";
    // 连接池监控的路径
    private static final String DURID_MONITOR_PATH = "/duridmonitor/*";

    //MyBait sql文件
    private static final String MY_BAITS_MAPPER_PATH = "classpath*:mapper/**/**.xml";

    @Autowired
    private DataSourceProperties dataSourceProperties;

    /**
     * durid数据源
     *
     * @return
     * @throws SQLException
     */
    @Bean
    public DataSource dataSource() throws SQLException {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setInitialSize(INITIAL_THREAD);
        dataSource.setMinIdle(MINIDLE_THREAD);
        dataSource.setMaxActive(MAX_ACTIVE_THREAD);
        dataSource.setMaxWait(MAX_WAIT);
        dataSource.setTimeBetweenEvictionRunsMillis(60000);
        dataSource.setValidationQuery(CHECK_CONNECTION_QUERY);
        dataSource.setTestWhileIdle(true);
        dataSource.setTestOnBorrow(false);
        dataSource.setTestOnReturn(false);
        dataSource.setPoolPreparedStatements(false);
        dataSource.setFilters(STAT_FILETER);

        dataSource.setUrl(dataSourceProperties.getUrl());
        dataSource.setDriverClassName(dataSourceProperties.getDriverClassName());
        dataSource.setUsername(dataSourceProperties.getUsername());
        dataSource.setPassword(dataSourceProperties.getPassword());

        return dataSource;
    }

    /**
     * durid 监控Servlet
     *
     * @return durid StatView
     */
    @Bean
    public StatViewServlet getStatViewServlet() {
        return new StatViewServlet();
    }

    @Bean
    public ServletRegistrationBean registrationDuridServlet() {
        return new ServletRegistrationBean(getStatViewServlet(), DURID_MONITOR_PATH);
    }

    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource());
        PathMatchingResourcePatternResolver loader = new PathMatchingResourcePatternResolver();
        sessionFactory.setMapperLocations(loader.getResources(MY_BAITS_MAPPER_PATH));
        return sessionFactory.getObject();
    }

    @Bean
    public SqlSession sqlSession() throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory());
    }

    @Bean
    public FilterRegistrationBean HttpMethodFilterRegistration() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(HttpMethodFilter());
        registration.addUrlPatterns("/*");
        return registration;
    }

    @Bean(name = "HttpMethodFilter")
    public Filter HttpMethodFilter() {
        return new HttpPutFormContentFilter();
    }

    @Bean(name = "corsFilter")
    public Filter corsFilter() {
        return new CORSFilter();
    }
}
