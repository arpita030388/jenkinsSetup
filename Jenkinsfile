pipeline {
    agent any
  options {
        skipDefaultCheckout(true) 
    }
    stages {
        stage('Checkout') {
            steps {
               git url: 'https://github.com/arpita030388/jenkinsSetup.git'
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
