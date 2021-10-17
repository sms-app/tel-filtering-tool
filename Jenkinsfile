pipeline {
    agent any
    stages {
        stage('Checkout from SCM') {
        	steps {
	            echo 'git clone git@github.com:sms-app/tel-filtering-tool.git'
	        }
        }
        stage('Maven Unit Test case') {
        	steps {
	            echo 'mvn clean install'
	        }
        }
    }
}