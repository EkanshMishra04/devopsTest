pipeline {
    agent any

    tools {
        maven "MavenHome"
    }

    stages {
        stage('CheckOut'){
		steps{
            git 'https://github.com/EkanshMishra04/devopsTest.git'
            echo 'Checkout Success'
        	}
	}
	    stage('Build'){
		steps{
             bat "mvn clean test install"
             echo 'Build Success'
        	}
	}
	stage('Quality') {
            steps {
               bat "mvn clean verify sonar:sonar -Dsonar.projectKey=devops-project -Dsonar.host.url=http://localhost:9000 -Dsonar.login=sqp_5ab5cccd04e04a4cfdebe1cf2bd60e398a41276f"
               echo 'Quality step Success'
            }
        }
    stage('Docker Image Build'){
		steps{
             bat "docker build -t ekanshmishra/devops-docker-image ."
             echo 'Build Success'
        	}
	}
	stage('Push Image to DockerHub'){
	    steps{
	        script{
	            withCredentials([string(credentialsId: 'dockerhubpwd', variable: 'dockerhubpwd')]) {
                bat "docker login -u ekanshmishra -p${dockerhubpwd}"
                
                }
                echo "login success"
                bat "docker push ekanshmishra/devops-docker-image"
	        }
	    }
	}
stage('Deploy to k8s'){
	    steps{
	        script{
	            kubernetesDeploy (configs: 'deploymentservice.yaml', kubeconfigId: 'k8sconfigpwd')
	        }
	        
	    }
	}
	
	
    }
}
