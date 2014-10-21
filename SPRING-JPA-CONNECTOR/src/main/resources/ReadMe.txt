Herhangi bir projeye Spring-Hibernate 'in modül olarak eklenmesi için oluşturdum.

------------------------------------------------------------------------------------------
Derleme anında db bağlantı testi yapıyor. Maven da testler atlamak için şöyle yapılabilir

clean package -Dmaven.test.skip=true
------------------------------------------------------------------------------------------

Eklenecek projenin applicationContext.xml inde yada sen hangi ismi verirsen

<import resource="classpath*:spring-db.xml"/> olarak tanımla.

Sonra aynı xml de Project.properties dosyasını da tanıtmalısın. Oda aşağıdaki gibi

p:location="Project.properties" senin projendeki yerine göre değişebilir.

<bean id="propertyConfigurer"
          class="org.springframework.beans.factory.config.PropertyPlaceholderConfigurer"
          p:location="Project.properties">
</bean>

----------------------------------------------------------------------------------------------

Project.properties içeriği aşağıdaki gibi olmalı paramtreleri istediğin gibi değiştirebilirsin.

##DATABASE PROPERTIES
jdbc.driverClassName    = com.mysql.jdbc.Driver
jdbc.dialect            = org.hibernate.dialect.MySQLDialect
jdbc.databaseurl        = jdbc:mysql://127.0.0.1:3306/test
jdbc.username           = root
jdbc.password           = 1234

#HIBERNATE PROPERTIES
show_sql                = true
format_sql              = false
entities.packagesToScan = com.beto.test.model.entity
hbm2ddl.auto            = update
hb.persistenceUnitName  = SPRING_TESTER
importFile              = import.sql
----------------------------------------------------------------------------------------------

Örnek applicationContext.xml

<?xml  version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
 xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
 xmlns:task="http://www.springframework.org/schema/task"
 xmlns:util="http://www.springframework.org/schema/util"
 xmlns:context="http://www.springframework.org/schema/context"
 xmlns:p="http://www.springframework.org/schema/p"
 xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-3.0.xsd
        http://www.springframework.org/schema/context http://www.springframework.org/schema/context/spring-context.xsd
        http://www.springframework.org/schema/util http://www.springframework.org/schema/util/spring-util.xsd
        http://www.springframework.org/schema/task http://www.springframework.org/schema/task/spring-task-3.0.xsd">
<!--	<import resource="classpath:configurations/DataSource.xml" />
	<import resource="classpath:configurations/Hibernate.xml" />-->

    <task:annotation-driven/>
	<context:annotation-config />
	<context:component-scan base-package="com.beto.test" />

    <import resource="classpath*:spring-db.xml"/>

    <bean id="propertyConfigurer"
          class="org.springframework.beans.factory.config.PropertyPlaceholderConfigurer"
          p:location="Project.properties">
    </bean>

</beans>

----------------------------------------------------------------------------------------------