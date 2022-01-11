job('First-Maven-Project-Via-DSL') {
    description("First Maven job generated by the DSL on ${new Date()}, the project is a small Maven project hosted on github")
    scm {
        git("https://github.com/cciprianc/Jenkins_Upgradev3.git", 'master')
    }
    triggers {
        scm('* * * * *')
        cron('* * * * *')
    }
    publishers {
        publishBuild {
            discardOldBuild(5, 5)
        }
    }
    steps {
        maven {
            goals('clean')
            goals('package')
            rootPOM('maven-samples/single-module/pom.xml')
            properties('user.home': '/home/cchirnoa/Documents/jenkins')
            mavenInstallation('LocalMaven')
            // providedSettings('/home/cchirnoa/Documents/apache-maven-3.6.3/conf/settings.xml')
        }
        // maven('clean package', 'maven-samples/single-module/pom.xml')
    }
    publishers {
        //archive the war file generated
        archiveArtifacts '**/*.jar'
    }
}