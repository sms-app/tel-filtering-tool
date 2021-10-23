pipeline {
  agent any 
  tools {
      maven "Apache Maven 3.3.9"
  }
  stages {
    stage('Build') {
      steps {
        bat 'mvn clean package'
      }
    }
    stage('Deploy') {
      steps {
        bat 'mvn deploy -DmuleDeploy'
      }
    }
  }
}