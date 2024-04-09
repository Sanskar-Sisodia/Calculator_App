pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git url: 'https://github.com/Sanskar-Sisodia/Calculator_App.git', branch: 'main'
            }
        }

        stage('Build') {
            steps {
                script {
                    // Execute Maven build
                    bat 'mvn clean install'
                }
            }
        }

        stage('Run Tests') {
            steps {
                script {
                    // Execute Maven test
                    bat 'mvn test'
                }
            }
        }
    }
}
