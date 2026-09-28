@Library('shared-lib') _

pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Compile') {
            steps {
                mvnCompile()
            }
        }

        stage('Unit Test') {
            steps {
                mvnTest()
            }
        }

        stage('Package') {
            steps {
                mvnPackage()
            }
        }
    }

    post {
        success {
            echo 'Pipeline succeeded!'
        }
        failure {
            echo 'Pipeline failed'
        }
    }
}
