pipeline {
    agent any
    stages {
        stage('Checkout from SCM') {
        	steps {
	            sh 'git clone git@github.com:sms-app/tel-filtering-tool.git'
	        }
        }
        stage('Maven Unit Test case') {
        	steps {
	            sh 'mvn clean install'
	        }
        }
    }
}