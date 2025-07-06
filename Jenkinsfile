pipeline {
    agent any
  options {
        skipDefaultCheckout(true) 
    }
    stages {
        stage('Checkout') {
            steps {
                step{
                git url: 'https://github.com/arpita030388/jenkinsSetup.git'
                }
                step {
                checkout scm
            }
            }
        }
        stage('Build') {
            steps {
                echo 'building..'
            }
        }
              stage('Test') {
            steps {
                echo 'testing..'
            }
        }
    }
}
