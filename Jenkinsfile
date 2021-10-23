pipeline {
    agent any
    tools {
        maven 'Apache Maven 3.3.9'
    }
    stages {
       

        stage ('Build') {
            steps {
                sh 'mvn -Dmaven.test.failure.ignore=true install' 
            }
            post {
                success {
                    junit 'target/surefire-reports/**/*.xml' 
                }
            }
        }
    }
}