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
                    // Execute build commands here
                    // For example, for Gradle:
                    bat './gradlew build'
                }
            }
        }

        stage('Run Tests') {
            steps {
                script {
                    // Execute test commands here
                    // For example, for Gradle:
                    bat './gradlew test'
                }
            }
        }
    }
}
