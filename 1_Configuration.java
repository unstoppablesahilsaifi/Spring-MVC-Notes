1. If .jsp file gives error:
Right click on projects -> properties -> Java Build Path -> remove existing JRE file and Add latest library in library section.
then add tomcat library also -> add library -> server runtime -> Apache tomcat. Apply.
//Error resolve

2. If Pom.xml give error like (cannot access defaults field of properties):
How to solve the maven error “cannot access defaults field of properties” in the pom.xml. In this blog
I will show you a simple solution to fix this issue in the maven project pom.xml.

The error is coming due to the version mismatch of the maven plugins so make sure you are using the correct plugin same as maven installed on your machine.
Below are the required plugins to solve the maven error “Cannot access defaults field of properties in pom.xml” 


<pluginManagement>
   <!-- lock down plugins versions to avoid using Maven defaults (may be moved to parent pom) -->
   <plugins>
    <plugin>
     <artifactId>maven-clean-plugin</artifactId>
     <version>3.1.0</version>
    </plugin>
    <!-- see http://maven.apache.org/ref/current/maven-core/default-bindings.html#Plugin_bindings_for_war_packaging -->
    <plugin>
     <artifactId>maven-resources-plugin</artifactId>
     <version>3.0.2</version>
    </plugin>
    <plugin>
     <artifactId>maven-compiler-plugin</artifactId>
     <version>3.8.0</version>
    </plugin>
    <plugin>
     <artifactId>maven-surefire-plugin</artifactId>
     <version>2.22.1</version>
    </plugin>
    <plugin>
     <artifactId>maven-war-plugin</artifactId>
     <version>3.2.2</version>
    </plugin>
    <plugin>
     <artifactId>maven-install-plugin</artifactId>
     <version>2.5.2</version>
    </plugin>
    <plugin>
     <artifactId>maven-deploy-plugin</artifactId>
     <version>2.8.2</version>
    </plugin>
   </plugins>
  </pluginManagement>
  
        
        
 Add this between builg tag after the final name tag.
        
 For more-----  Refer this link ->    https://codebun.com/cannot-access-defaults-field-of-properties-in-pom-xml/


    
