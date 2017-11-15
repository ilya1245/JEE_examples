pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        git(url: 'https://github.com/ilya1245/JEE_examples.git', branch: 'master')
      }
    }
    stage('Test') {
      steps {
        echo 'Testing...'
      }
    }
    stage('Deploy') {
      steps {
        echo 'Deploying...'
      }
    }
  }
}