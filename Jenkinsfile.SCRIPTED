node {
    try {
        stage('Checkout') {
            checkout scm
        }

        stage('Compile') {
            sh 'mvn clean compile'
        }

        stage('Unit Test') {
            sh 'mvn test'
        }

        stage('Package') {
            sh 'mvn package -DskipTests'
        }

        echo 'Scripted Pipeline executed successfully!'
    } catch (Exception e) {
        echo "Scripted Pipeline failed: ${e.getMessage()}"
        currentBuild.result = 'FAILURE'
        throw e
    }
}
