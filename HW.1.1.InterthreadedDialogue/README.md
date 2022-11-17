# Working with threads
## InterthreadedDialogue-Multithreading
### Description
It is necessary to create several threads (3-4 threads), which every 2-3 seconds send some message to the console, necessarily containing the name of the thread that
was specified during creation. The thread must perform an infinite loop of message output and sleep (delay). The main thread of the program (the main method) should 
allow the rest of the threads to work for some time (15 seconds), and then complete all previously created threads with one method.

The functionality of the program:
1. Creating 4 threads, each of which has its own name.
2. Every 2-3 seconds, the thread prints a message to the console. The name of the stream must necessarily appear in the message
3. After some time (for example, 15 seconds), the main thread must complete all previously created threads in one method
