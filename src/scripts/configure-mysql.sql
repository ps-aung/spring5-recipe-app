## Use to run mysql db docker image, optional if you're not using a local mysqldb
# docker run --name mysqldb -p 3306:3306 -e MYSQL_ALLOW_EMPTY_PASSWORD=yes -d mysql

# connect to mysql and run as root user
#Create Databases
CREATE DATABASE psa_dev;

#Create database service accounts
CREATE USER 'psa_dev_user'@'localhost' IDENTIFIED BY 'psa';
CREATE USER 'psa_dev_user'@'%' IDENTIFIED BY 'psa';

#Database grants
GRANT SELECT ON psa_dev.* to 'psa_dev_user'@'localhost';
GRANT INSERT ON psa_dev.* to 'psa_dev_user'@'localhost';
GRANT DELETE ON psa_dev.* to 'psa_dev_user'@'localhost';
GRANT UPDATE ON psa_dev.* to 'psa_dev_user'@'localhost';
GRANT SELECT ON psa_dev.* to 'psa_dev_user'@'%';
GRANT INSERT ON psa_dev.* to 'psa_dev_user'@'%';
GRANT DELETE ON psa_dev.* to 'psa_dev_user'@'%';
GRANT UPDATE ON psa_dev.* to 'psa_dev_user'@'%';