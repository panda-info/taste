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
    }
}
