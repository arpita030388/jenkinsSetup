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

        stage('Build') {
            steps {
                echo 'Compiling..'
                bat 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                echo 'testing..'
                bat 'mvn test'
            }
        }
    }
    post {
    always {
        publishHTML(target: [
            reportDir: 'target/surefire-reports',
            reportFiles: 'index.html',
            reportName: 'TestNG HTML Report',
            keepAll: true,
            alwaysLinkToLastBuild: true
        ])
    }
}

}
