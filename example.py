# v1

class Duck:
	def __init__(self, name): 
		self.name = name 
	def fly(self): 
		print(f"{self.name} is flying not very high") 
	def swim(self): 
		print(f"{self.name} swims in the lake and quacks") 
	def do_sound(self) -> str: 
		return "Quack" 
	def greet(self, duck2: Duck): 
		print(f"{self.name}: {self.do_sound()}, hello {duck2.name}")

# v2
class Duck:
    def __init__(self, name):
        self.name = name
    def fly(self):
        print(f"{self.name} is flying not very high")
    def swim(self):
        print(f"{self.name} swims in the lake and quacks")
    def do_sound(self) -> str:
        return "Quack"

class Communicator:
    def __init__(self, channel):
        self.channel = channel
    def communicate(self, duck1 : Duck, duck2: Duck):
        sentence1 = f"{duck1.name}: {duck1.do_sound()}, hello {duck2.name}"
        sentence2 = f"{duck2.name}: {duck2.do_sound()}, hello {duck1.name}"
        conversation = [sentence1, sentence2]
        print(*conversation, f"(via {self.channel})", sep = '\n')

# v3
class AbstractConversation:
    def do_conversation(self) -> list:
        pass

class SimpleConversation(AbstractConversation):
    def __init__(self, duck1: Duck, duck2: Duck):
        self.duck1 = duck1
        self.duck2 = duck2
    def do_conversation(self) -> list:
        sentence1 = f"{self.duck1.name}: {self.duck1.do_sound()}, hello {self.duck2.name}"
        sentence2 = f"{self.duck2.name}: {self.duck2.do_sound()}, hello {self.duck1.name}"
        return [sentence1, sentence2]

class Communicator:  
    def __init__(self, channel):
        self.channel = channel
    @final
    def communicate(self, conversation: AbstractConversation):
        print(*conversation.do_conversation(), f"(via {self.channel})",sep = '\n')


# v4
class Bird(ABC):
    def __init__(self, name):
        self.name = name
    @abstractmethod
    def fly(self):
        pass
    @abstractmethod
    def swim(self):
        pass
    @abstractmethod
    def do_sound(self) -> str:
        pass

class Crow(Bird):
    def fly(self):
        print(f"{self.name} is flying high and fast!")
    def swim(self):
        raise NotImplementedError("Crows don't swim!")
    def do_sound(self) -> str:
        return "Caw"

class Duck(Bird):
    def fly(self):
        print(f"{self.name} is flying not very high")
    def swim(self):
        print(f"{self.name} swims in the lake and quacks")
    def do_sound(self) -> str:
        return "Quack"

class SimpleConversation(AbstractConversation):
    def __init__(self, bird1: Bird, bird2: Bird):
        self.bird1 = bird1
        self.bird2 = bird2
    def do_conversation(self) -> list:
        sentence1 = f"{self.bird1.name}: {self.bird1.do_sound()}, hello {self.bird2.name}"
        sentence2 = f"{self.bird2.name}: {self.bird2.do_sound()}, hello {self.bird1.name}"
        return [sentence1, sentence2]



# v5
class Bird(ABC):
    def __init__(self, name):
        self.name = name
    @abstractmethod
    def do_sound(self) -> str:
        pass

class FlyingBird(Bird):
    @abstractmethod
    def fly(self):
        pass

class SwimmingBird(Bird):
    @abstractmethod
    def swim(self):
        pass

class Crow(FlyingBird):
    def fly(self):
        print(f"{self.name} is flying high and fast!")
    def do_sound(self) -> str:
        return "Caw"

class Duck(SwimmingBird, FlyingBird):
    def fly(self):
        print(f"{self.name} is flying not very high")
    def swim(self):
        print(f"{self.name} swims in the lake and quacks")
    def do_sound(self) -> str:
        return "Quack"

	
# V6
class AbstractChannel(ABC):
    def get_channel_message(self) -> str:
        pass

class AbstractCommunicator(ABC):
    def get_channel(self) -> AbstractChannel:
        pass
    @final
    def communicate(self, conversation: AbstractConversation):
        print(*conversation.do_conversation(),
              self.get_channel().get_channel_message(),
              sep = '\n')

class SMSChannel(AbstractChannel):
    def get_channel_message(self) -> str:
        return "(via SMS)"

class SMSCommunicator(AbstractCommunicator):  
    def __init__(self):
        self._channel = SMSChannel()
    def get_channel(self) -> AbstractChannel:
        return self._channel

class SMSCommunicator(AbstractCommunicator):  

    def __init__(self, channel : AbstractChannel):
        self._channel = channel
   
    def get_channel(self) -> str:
        return self._channel 