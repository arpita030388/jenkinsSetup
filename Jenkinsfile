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
    script{
       def logFile = "${env.WORKSPACE}/consoleOutput.txt"
                def buildLog = currentBuild.rawBuild.getLog(1000).join('\n')
                writeFile file: logFile, text: buildLog
                archiveArtifacts artifacts: 'consoleOutput.txt', allowEmptyArchive: false
            }

        publishHTML(target: [
            reportDir: 'target/surefire-reports',
            reportFiles: 'index.html',
            reportName: 'TestNG HTML Report',
            keepAll: true,
            alwaysLinkToLastBuild: true
        ])
           publishHTML(target: [
            reportDir: 'target/test-output',
            reportFiles: 'ExtentReport.html',
            reportName: 'Extent HTML Report',
            keepAll: true,
            alwaysLinkToLastBuild: true
        ])
        allure([
            includeProperties: false,
            jdk: '',
            results: [[path: 'target/allure-results']]
        ])
    }
}

}
