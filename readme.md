##1.表结构，很粗糙凑合看
CREATE TABLE `s_user` (
  `id_` bigint(20) NOT NULL,
  `name_` varchar(20) DEFAULT NULL,
  `sex_` int(3) DEFAULT NULL,
  `age_` int(10) DEFAULT NULL,
  `status_` int(10) DEFAULT NULL,
  `username_` varchar(20) DEFAULT NULL,
  `password_` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id_`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

##整合swagger

访问地址:http://localhost:9003/swagger-ui.html#


##nginx配置参考如下

user  nobody;
worker_processes  1;

events {
    worker_connections  1024;
}


http {

    include       mime.types;
    default_type  application/octet-stream; 
    sendfile        on;
    keepalive_timeout  65;

    #前台地址配置
    server {
        listen       9002;
        server_name  localhost;
        root D:\\demoprojectpackage\\ning-parent\\ning-ui\\portal;

        location / {   # 路由配置
            if ( !-e $request_filename) {
				  proxy_pass http://127.0.0.1:9001;
			}
		
        }
		   
    }
	
	#后台地址配置
	server {
        listen       9003;
        server_name  localhost;
        root D:\\demoprojectpackage\\ning-parent\\ning-ui\\server;
        location / {   # 路由配置
            if ( !-e $request_filename) {
				  proxy_pass http://127.0.0.1:9001;
			}
        }
    
    }




    

}


