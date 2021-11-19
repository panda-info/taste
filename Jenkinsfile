pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh "./mvnw clean package"
            }

            post {
                success {
                    junit '**/target/surefire-reports/TEST-*.xml'
                    archiveArtifacts 'target/*.jar'
                    jacoco runAlways: true
                }
            }
        }

        stage('Deploy') {
            steps {
                sh "docker build --tag=pick-and-pack:latest ."
            }

            post {
                success {
                    junit '**/target/surefire-reports/TEST-*.xml'
                    archiveArtifacts 'target/*.jar'
                    jacoco runAlways: true
                }
            }
        }
    }
}
