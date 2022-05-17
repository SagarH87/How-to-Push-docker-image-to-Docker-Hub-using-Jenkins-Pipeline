node {
    stage('SCM Checkout'){
        git credentialsId: 'GitHub', url: 'https://github.com/SagarH87/my-app'
    }
    stage('Mvn Package'){
        def mvnHome = tool name: 'maven-3', type: 'maven'
        def mvnCMD = "${mvnHome}/bin/mvn"
        sh "${mvnCMD} clean package"
    }
}