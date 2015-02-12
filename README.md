en local : 
 java -jar target/aws-demo-0.0.1-SNAPSHOT.jar --spring.config.location=src/test/resources/application.yml

ApplicationConfigurationBeanPostProcessor - No AWS cloud environment ...
GET http://localhost:8080 => { property1: "local1", property2: "local2"}

sur aws :
 java -Daws.accessKeyId=$1 -Daws.secretKey=$2 -Daws.conf.bucket=xxx -Daws.s3.app.path=xxx -jar aws-demo-0.0.1-SNAPSHOT.jar

The application is starting on AWS cloud environment
Register "appConfig" from aws:s3 : {"property1":"aws1","property2":"aws2"}

sur aws, si on passe egalement :  --spring.config.location=... c'est la conf aws qui est chargée
GET http://... => { property1: "aws1", property2: "aws2"}

AppConfig => peut pointer sur une portion de application.yml (app:)

