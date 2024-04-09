pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git url: 'https://github.com/Sanskar-Sisodia/Calculator_App.git', branch: 'main'
            }
        }

        stage('Set up environment') {
            steps {
                script {
                    sh 'wget -qP /tmp https://chromedriver.storage.googleapis.com/LATEST_RELEASE'
                    sh 'LATEST_CHROMEDRIVER_VERSION=$(cat /tmp/LATEST_RELEASE)'
                    sh 'wget -qP /tmp https://chromedriver.storage.googleapis.com/$LATEST_CHROMEDRIVER_VERSION/chromedriver_linux64.zip'
                    sh 'unzip -o /tmp/chromedriver_linux64.zip -d /tmp'
                    sh 'chmod +x /tmp/chromedriver'
                    sh 'sudo mv /tmp/chromedriver /usr/local/bin/'
                    sh 'java -version' // Check Java version
                }
            }
        }

        stage('Build') {
            steps {
                script {
                    sh './gradlew build'
                }
            }
        }

        stage('Run Tests') {
            steps {
                script {
                    sh './gradlew test'
                }
            }
        }
    }
}
