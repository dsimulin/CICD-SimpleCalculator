pipeline {  
    agent any  
    stages {  
            stage ('Git-Clone') {  
                steps{
                    git credentialsId: '9a0a93d2-46ba-4f8f-8d02-c0d420e061ca', url: 'https://github.com/dsimulin/CICD-SimpleCalculator.git'
                    echo "Repository cloned!";
                } 
            }
            stage ('Compile') {  
                  steps{
                    bat label: '', script: 'mvn compile'
                    echo "Compilation successful!";
                    
                } 
            }
            stage ('Build') {  
                  steps{
                    bat label: '', script: 'mvn clean'
                    bat label: '', script: 'mvn package'
                    echo "Building completed!";
                    
                } 
            }
             stage ('Test') {  
                  steps{
                    bat label: '', script: 'mvn test'
                    echo "Testing successful!";
                } 
            }
            
        stage ('Deploy') {
            steps{
            deploy adapters: [tomcat9(credentialsId: 'a6348393-28b3-4afd-8e08-d03232c03fbb', path: '', url: 'http://localhost:8081/')], contextPath: 'simple-calculator', onFailure: false, war: '**/*.war'
             echo "Deployment completed!";
            }
        }
        stage ('Monitor') { 
           steps{ 
             echo "Application can be monitored!";
           }
        }
    }
}