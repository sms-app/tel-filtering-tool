pipeline {
	environment {
	   registry = 'dineshgngwr/tel-filtering-tool'
       registryCredential = 'dockerhub' 
       dockerImage = ''  
	}
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
	stage('Maven build') {
      steps {
        bat 'mvn clean install -Dmaven.test.skip=false'
      }
    }
	stage('Building docker image') {
	   steps {
   	    script {
    	      dockerImage = docker.build registry + ":$BUILD_NUMBER" 
    	   }
   		}
	}
	stage('Example Build') {
	   steps {
   	    	script {
	    	       docker.withRegistry('', registryCredential){
	    	       		dockerImage.push()
	    	       }
	    	   }
   		}
	}
	stage('Cleaning up') {
	   steps {
   	    	bat 'docker rmi $registry:$BUILD_NUMBER'
   		}
	}
    /*stage('Maven build') {
      steps {
        bat 'mvn clean install -Dmaven.test.skip=false'
      }
    }
    stage('Delete existing docker image') {
       steps {
           bat 'docker image rm tel-filtering-tool'
       }
    }
    stage('Docker build new image') {
      steps {
        bat 'docker build -t tel-filtering-tool .'
      }
    }
    stage('Run docker image') {
       steps {
           bat 'docker run -p 9090:9090 tel-filtering-tool'
           echo 'All steps done successfully!'
       }
    }*/
  }
}