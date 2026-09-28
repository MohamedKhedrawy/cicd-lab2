def call() {
    echo "Compiling Java source code..."
    sh 'mvn clean compile'
}
