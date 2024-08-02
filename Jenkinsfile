pipeline {
    agent any
    stages {
        stage('Checkout Repositories') {
            steps {
                git url: 'https://github.com/repo1.git'
                git url: 'https://github.com/repo2.git'
            }
        }
        stage('Build and Test') {
            steps {
                sh 'cd repo2 && mvn test'
            }
        }
    }
}
