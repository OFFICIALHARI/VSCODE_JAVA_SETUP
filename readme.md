# How to Set Up Visual Studio Code for Java Programming (CP and DSA)

Follow these simple steps to configure Visual Studio Code (VS Code) for Competitive Programming (CP) and Data Structures & Algorithms (DSA) in Java.

---

## Step 1: Install Prerequisites

1. **Install Java Development Kit (JDK):**
   - Download and install [JDK](https://www.oracle.com/java/technologies/javase-downloads.html).
   - Verify installation:
     ```bash
     javac -version
     java -version
     ```

2. **Install Visual Studio Code:**
   - Download and install [VS Code](https://code.visualstudio.com/).

3. **Install Extensions:**
   - Open VS Code.
   - Go to Extensions (`Ctrl+Shift+X`).
   - Search and install:
     - **Language Support for Java(TM) by Red Hat**
     - **Debugger for Java**
     - **Code Runner (optional)**

---

## Step 2: Set Up a Java Workspace

1. **Create a Folder:**
   - Create a folder for your Java projects (e.g., `JavaProjects`).

2. **Open Folder in VS Code:**
   - Click `File` > `Open Folder` > Select your folder.

3. **Create Files:**
   - Inside the folder, create these files:
     - `th.java` (Java program)
     - `input.txt` (for input data)
     - `output.txt` (for output data)

---

## Step 3: Configure tasks.json

1. **Open Tasks Configuration:**
   - Press `Ctrl+Shift+P` > Search "Tasks: Configure Default Build Task".

2. **Add the Following Code:**
   - In `.vscode/tasks.json`, add:
     ```json
     {
         "version": "2.0.0",
         "tasks": [
             {
                 "label": "Run Java with Input and Output Files",
                 "type": "shell",
                 "command": "cmd.exe",
                 "args": ["/c", "javac th.java && java th < input.txt > output.txt"],
                 "group": {
                     "kind": "build",
                     "isDefault": true
                 },
                 "presentation": {
                     "reveal": "always",
                     "panel": "dedicated"
                 },
                 "problemMatcher": []
             }
         ]
     }
     ```

---

## Step 4: Write and Test Your Code

1. **Write Code:**
   - Open `th.java` and write your Java program. For example:
     ```java
     import java.util.*;

     class th {
         public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);
             int a = sc.nextInt();
             int b = sc.nextInt();
             System.out.println("The sum is: " + (a + b));
         }
     }
     ```

2. **Prepare Input:**
   - Add input to `input.txt`. For example:
     ```
     10
     20
     ```

3. **Run the Task:**
   - Press `Ctrl+Shift+P` > Search "Run Task" > Select "Run Java with Input and Output Files".

4. **View Output:**
   - Check `output.txt` for results. For example:
     ```
     The sum is: 30
     ```

---

## Step 5: Debugging (Optional)

1. **Add Debug Configuration:**
   - Go to `Run and Debug` (Ctrl+Shift+D) > Add Configuration > Select "Java".

2. **Set Breakpoints:**
   - Click on the line number to set breakpoints in your code.

3. **Start Debugging:**
   - Click the green play button or press `F5`.

---

Congratulations! You are now set up to use Visual Studio Code for Java programming for Competitive Programming and DSA!
