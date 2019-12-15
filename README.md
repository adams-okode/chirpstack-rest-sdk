https://chirpstack.io

How To Configure:
=================
The generated client class accepts the configuration parameters in its constructors.

The generated code uses a java library namely UniRest. The reference to this
library is already added as a maven dependency in the generated pom.xml
file. Therefore, you will need internet access to resolve this dependency.

How to build and install via Maven: 
=============

    1. Extract the zip file to a new folder named JavaSDK.
    2. Open a command prompt and navigate to the JavaSDK/LoRaServerRESTAPILib folder.
    3. Execute "mvn install", this will install dependencies and also add the generated JAR in your local maven repository.
    4.In your own maven application, add the following lines which will refer to newly installed SDK: 
        <dependency>
            <groupId>LoRaServerRESTAPILib</groupId>
            <artifactId>LoRaServerRESTAPILib</artifactId>
            <version>0.0.1-SNAPSHOT</version>
            <scope>compile</scope>
        </dependency>

How to build via Eclipse: 
=============

For build process do the following:

    1. Open Eclipse and click on the "Import" option in "File" menu.
    2. Select "General -> Existing Projects into Workspace" option from the tree list.
    3. In "Select root directory", provide path to the unzipped archive for the generated code.
    4. Click "Finish" and ensure that "Project -> Build Automatically" option is enabled in the menu.


How to Use:
===========
Export the compiled classes as a java libray (jar). The exported jar can be used as library.
See the following links for more information on this topic.

Exporting JARs:
    1. Click on the "Export" option in "File" menu.
    2. Select "Java -> JAR file" and click on "Next". 
    3. Check the box beside "LoRaServerRESTAPILib" and click on "Finish".

For further details on exporting JARs follow up on the following link.
http://help.eclipse.org/mars/topic/org.eclipse.jdt.doc.user/tasks/tasks-33.htm

Using JARs:
http://help.eclipse.org/juno/topic/org.eclipse.jst.j2ee.doc.user/topics/tjimpapp.html
