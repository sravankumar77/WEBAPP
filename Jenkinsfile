pipeline{
    agent {label 'java'}
    environment{
       PATH = "/usr/share/maven/bin:$PATH"
    }
    
    stages{
        stage("checkout"){
            steps{
                
                sh "ls"
                sh "pwd"
            }   
        } 
        stage("maven build"){
            steps{
                
                sh "hostname"
                sh "mvn clean package"
            }   
        } 
         stage("Email"){
            steps{
                
                emailext (to: 'durgamsanthosh141@gmail.com', replyTo: 'durgamsanthosh141@gmail.com', subject: "Email Report from - '${env.JOB_NAME}' ", 
                          body: readFile("target/surefire-repors/AppTest.txt"), mimeType: 'text/plain');
            }   
        } 
        
        
        stage("deploy"){
            steps{
                sh "sudo cp target/java-tomcat-maven-example.war /usr/share/tomcat/webapps"
                 
                //step([$class: 'DockerComposeBuilder', dockerComposeFile: 'docker-compose.yml', option: [$class: 'StartAllServices'], useCustomDockerComposeFile: true])
            }   
        }
        
        
    }   
}
