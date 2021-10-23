pipeline {
  agent any 
  tools {
      maven "Apache Maven 3.3.9"
  }
  stages {
  
  	stage('Clone git repository') {
	     steps {
     	    bat 'git clone https://github.com/sms-app/tel-filtering-tool.git'
     	}
	  }
    stage('Build') {
      steps {
        bat 'mvn clean install -Dmaven.test.skip=false'
      }
    }
    stage('Docker Build Image') {
      steps {
        bat 'docker build -t tel-filtering-tool .'
        echo 'All steps done successfullt!'
      }
    }
  }
}