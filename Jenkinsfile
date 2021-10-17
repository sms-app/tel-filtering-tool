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
        stage('Build Docker Image') {
           steps {
               echo 'docker build -t tel-filtering-tool'
           }
        }
        stage('Tag and Push Docker Image into Dockerhub') {
           steps {
               echo 'docker tag tel-filtering-tool:latest docker.io/dineshgngwr/tel-filtering-tool:latest'
               echo 'docker push docker.io/dineshgngwr/tel-filtering-tool:latest'
               echo 'Image pushed successfully.......'
           }
        }
    }
}