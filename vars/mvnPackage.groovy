def call() {
    echo "Packaging application into JAR..."
    sh 'mvn package -DskipTests'
}
