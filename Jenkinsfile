pipeline {
      agent any
      options {
            buildDiscarder(logRotator(daysToKeepStr: '3', numToKeepStr: '5', artifactNumToKeepStr: '5', artifactDaysToKeepStr: '5'))
      }
      stages {
            stage('Init') {
                  steps {
                        echo 'Hi, this is Anshul from LevelUp360'
                        echo 'We are Starting the Testing'
                  }
            }
            stage('Build') {
                  steps {
//                      properties([buildDiscarder(logRotator(daysToKeepStr: '3', numToKeepStr: '3')),])
                        echo 'Building Sample Maven Project'
                  }
            }
            stage('Deploy') {
                  steps {
                        echo "Deploying in Staging Area"
                  }
            }
            stage('Deploy Production') {
                  steps {
                        echo "Deploying in Production Area"
                  }
            }
            stage('Deploy QA') {
                  steps {
                        echo "Deploying in QA Area"
                  }
            }
      }
}