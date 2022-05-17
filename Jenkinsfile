pipeline{

	agent {label 'JAVA_AGENT'}

	environment {
		DOCKERHUB_CREDENTIALS=credentials('dockerhub')
	}

	stages {
	    
	    stage('gitclone') {

			steps {
				git 'https://github.com/SagarH87/How-to-Push-docker-image-to-Docker-Hub-using-Jenkins-Pipeline.git'
			}
		}

		stage('Build') {

			steps {
				sh 'docker build -t sagarhegde87/nodeapp_test:latest .'
			}
		}

		stage('Login') {

			steps {
				sh 'echo $DOCKERHUB_CREDENTIALS_PSW | docker login -u $DOCKERHUB_CREDENTIALS_USR --password-stdin'
			}
		}

		stage('Push') {

			steps {
				sh 'docker push sagarhegde87/nodeapp_test:latest'
			}
		}
	}

	post {
		always {
			sh 'docker logout'
		}
	}

}
