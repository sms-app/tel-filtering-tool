pipeline {
    agent any
    stages {
        stage('Checkout from SCM') {
        	steps {
	            bat 'git clone git@github.com:sms-app/tel-filtering-tool.git'
	        }
        }
        stage('Maven Unit Test case') {
        	steps {
	            bat 'mvn clean install'
	        }
        }
        stage('Build Docker Image') {
           steps {
               bat 'docker build -t tel-filtering-tool .'
           }
        }
        stage('Tag and Push Docker Image into Dockerhub') {
           steps {
               bat 'docker tag tel-filtering-tool:latest dineshgngwr/my-repo:latest'
               bat 'docker push dineshgngwr/my-repo:latest'
               bat 'Image pushed successfully.......'
           }
        }
    }
}