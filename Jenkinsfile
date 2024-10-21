pipeline {
    agent any

    tools {
        maven 'Maven3' // Assuming Maven is installed with name 'Maven3' in Jenkins
        jdk 'JDK11' // Assuming JDK 11 is configured in Jenkins
    }

    stages {
//        stage('Checkout') {
//            steps {
                // Checkout the source code from your version control system (e.g., Git)
//                checkout scm
//            }
        }
        stage('Install Dependencies') {
            steps {
                // Clean and install the project dependencies
                sh 'mvn clean install'
            }
        }
        stage('Run Tests') {
            steps {
                // Run the Selenium test (main class)
                sh 'mvn exec:java -Dexec.mainClass="seleniumpractice.Basics"'
            }
        }
    }

    post {
        always {
            // Clean up actions like sending notifications or archiving logs
            archiveArtifacts artifacts: '**/target/*.jar', allowEmptyArchive: true
        }
        failure {
            // Actions on pipeline failure
            mail to: 'team@example.com',
                 subject: "Pipeline Failed",
                 body: "The Jenkins pipeline failed. Please check the logs."
        }
    }
}
