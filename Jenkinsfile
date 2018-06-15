pipeline {
  agent any
  stages {
    stage('Compile stage') {
        steps {
            withMaven(maven : 'maven_3_5_3') {
                bat 'mvn clean compile'
            }
        }
    }
    stage('Test stage') {
        steps {
            withMaven(maven : 'maven_3_5_3') {
                bat 'mvn test'
            }
        }
    }
  }
}