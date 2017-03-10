Spring Boot CXF Integration
===========================

Spring Boot with CXF & Swagger capabilities, running as a WAR deployment

## Usage ##

1. Install the WAR file on WAS
2. Specify a Context root of your choosing
3. Update classloader to Run as PARENT_LAST: Websphere Enterprise Apps > SB-CXF-WAS_war > Manage Modules > SB-CXF-WAS_war: 
- Update Classloader order to: Classes load with local class loader first (parent last)  
4. Start the WAR, it may take a little longer than expected due to WAS Annotation Scanning... this can be updated by specifting JARs to ignore scanning in the META-INF/MANIFEST.MF
5. Goto : http://{hostname}:{port}/{contextRoot}/services/sayHello/{Your Name}

## Versions ##

Spring Boot : 1.4.3-RELEASE
CXF : 3.1.7

## Other ##

WAS sucks so be ready for some dependency hell ;) 

