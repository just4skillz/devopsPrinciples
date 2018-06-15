pipeline {
  agent any
  stages {
    stage('First Stage') {
      steps {
        echo 'Hello World'
      }
    }
    stage('Second Stage') {
      steps {
        echo 'Second stage'
      }
    }
    stage('Compile stage') {
        steps {
            withMaven(maven : 'maven_3_5_3') {
                bat 'mvn clean compile'
            }
        }
    }
  }
}