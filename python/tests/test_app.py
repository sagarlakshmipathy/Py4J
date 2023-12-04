# test cases for functions in app.py
from python.app import ApplicationWrapper


class TestApp:
    """
    Test class for the ApplicationWrapper class.
    """
    def setup_method(self):
        """
        Initializes the TestApp object.
        """
        self.app = ApplicationWrapper()  # Initialize the ApplicationWrapper object
        self.num1 = 1  # Set the initial value of num1 to 1
        self.num2 = 2  # Set the initial value of num2 to 2
        self.lst = [1, 2, 3, 4, 5]  # Create a list with values 1, 2, 3, 4, and 5

    def test_add(self):
        assert self.app.add(self.num1, self.num2) == 3

    def test_subtract(self):
        assert self.app.subtract(self.num1, self.num2) == -1

    def test_getArrayLength(self):
        assert self.app.getArrayLength(self.lst) == len(self.lst)

    def test_getListLength(self):
        assert self.app.getListLength(self.lst) == len(self.lst)
