from py4j.java_gateway import JavaGateway


class ApplicationWrapper:
    def __init__(self):
        self.gateway = JavaGateway.launch_gateway(jarpath="/Users/sagarl/Downloads/py4j-0.10.9.7.jar",
                                                  classpath="/Users/sagarl/learning/Py4J/target/Py4J-1.0-SNAPSHOT.jar")
        self.application = self.gateway.jvm.org.example.application.Application()

    def add(self, a, b):
        return self.application.add(a, b)

    def subtract(self, a, b):
        return self.application.subtract(a, b)
