definition
	Ensure a class has only one instance and provide a global point of access to it. 
	
participants

    The classes and/or objects participating in this pattern are:

    * Singleton   (LoadBalancer)
          o defines an Instance operation that lets clients access its unique instance. Instance is a class operation.
          o responsible for creating and maintaining its own unique instance.