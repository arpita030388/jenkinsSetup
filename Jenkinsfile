pipeline {
    agent any
  options {
        skipDefaultCheckout(true) 
    }
    stages {
        stage('Checkout') {
            steps {
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
