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
        stage('Build Docker Image') {
           steps {
               sh 'docker build -t tel-filtering-tool .'
           }
        }
        stage('Tag and Push Docker Image into Dockerhub') {
           steps {
               sh 'docker tag tel-filtering-tool:latest dineshgngwr/my-repo:latest'
               sh 'docker push dineshgngwr/my-repo:latest'
               sh 'Image pushed successfully.......'
           }
        }
    }
}