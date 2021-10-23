pipeline {
  agent any 
  tools {
      maven "Apache Maven 3.3.9"
  }
  stages {
  
  	stage('Example Build') {
	     steps {
     	    sh 'git clone https://github.com/sms-app/tel-filtering-tool.git'
     	}
	  }
    stage('Build') {
      steps {
        sh 'mvn clean install -Dmaven.test.skip=false'
      }
    }
    stage('Dcoker Build Image') {
      steps {
        sh 'docker build -t tel-filtering-tool .'
        echo 'All steps done successfullt!'
      }
    }
  }
}