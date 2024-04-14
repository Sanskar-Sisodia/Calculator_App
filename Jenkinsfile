pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/Sanskar-Sisodia/Calculator_App.git'
            }
        }

        stage('Build') {
            steps {
                echo 'Building...'
                // Add your build steps here
                sh 'mvn clean package'
            }
        }

        stage('Test') {
            steps {
                echo 'Testing...'
                // Add your test steps here
                sh 'mvn test'
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploying...'
                // Add your deployment steps here
                // For example: deploy to a server, publish artifacts, etc.
            }
        }
    }
}
