pipeline {
    agent any

    tools {
        // Specify the Maven installation name configured in Jenkins
        maven 'Maven'
    }

    stages {
        stage('Checkout') {
            steps {
                git url: 'https://github.com/Sanskar-Sisodia/Calculator_App.git', branch: 'main'
            }
        }

        stage('Clean') {
            steps {
                script {
                    // Execute Maven clean
                    bat 'mvn clean'
                }
            }
        }

        stage('Test') {
            steps {
                script {
                    // Execute Maven test
                    bat 'mvn test'
                }
            }
        }
    }
}
