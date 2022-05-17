node {  
    stage('Build') { 
        echo "Stage1"
    }
    stage('Test') { 
        echo "Stage2"
    }
    stage('Deploy') { 
        echo "Stage3"
    }
}