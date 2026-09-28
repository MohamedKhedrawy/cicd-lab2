def call() {
    echo "Running Maven unit tests..."
    sh 'mvn test'
}
