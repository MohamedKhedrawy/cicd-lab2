pipeline {

    agent any

    stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Compile') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Unit Test') {
            steps {
                sh 'mvn test'
            }
            post {
                always {
                    junit '**/target/surefire-reports/*.xml'
                }
            }
        }

        stage('Package') {
            steps {
                sh 'mvn package -DskipTests'
            }
            post {
                success {
                    archiveArtifacts artifacts: 'target/*.jar, target/*.war', allowEmptyArchive: true
                }
            }
        }
    }

    post {
        success {
            echo 'Declarative Pipeline executed successfully!'
        }
        failure {
            echo 'Declarative Pipeline failed. Check the console output.'
        }
    }
}
