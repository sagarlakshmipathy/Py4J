from setuptools import setup, find_packages

with open("README.md", "r", encoding="utf-8") as fh:
    long_description = fh.read()

setup(
    name="py4j-example",
    version="0.1.0",
    packages=find_packages(),
    long_description=long_description,
    long_description_content_type="text/markdown",
)