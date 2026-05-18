pipeline {
    agent any

    tools {
        maven 'Maven-3.9.15'   // same name as in Jenkins
        jdk 'JDK-25'           // same name as configured
    }

    stages {

        stage('Checkout Code') {
            steps {
                git branch: 'master', 
                url: 'https://github.com/nicks586/Cucumber-Practice.git'
            }
        }

        stage('Clean & Build') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Run Tests') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Generate Cucumber Report') {
            steps {
                echo 'Cucumber JSON should be generated in target folder'
            }
        }
    }

    post {

        always {
            // Archive reports (even if build fails)
            archiveArtifacts artifacts: 'target/**/*', allowEmptyArchive: true

            // Publish TestNG results
            junit 'target/surefire-reports/*.xml'
        }

        success {
            echo 'Build SUCCESS ✅'
        }

        failure {
            echo 'Build FAILED ❌'
        }
    }
}