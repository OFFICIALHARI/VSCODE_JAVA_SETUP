# How to Set Up Visual Studio Code for Java Programming - CP and DSA

## Step-by-Step Guide with Visuals

### 1. Install Visual Studio Code
- Download Visual Studio Code from [official website](https://code.visualstudio.com/).
- Install it by following the setup instructions.

![Install VS Code](imhttps://www.google.com/imgres?q=vscode%20install%20image&imgurl=https%3A%2F%2Fashutoshtripathi.com%2Fwp-content%2Fuploads%2F2021%2F04%2Fvs-code-installation-featured-image.png%3Fw%3D1200&imgrefurl=https%3A%2F%2Fashutoshtripathi.com%2F2021%2F04%2F05%2Fhow-to-install-vscode-ide-on-windows-visual-studio-code%2F&docid=BRxxYeOGIJq2YM&tbnid=xT5M-dLnpdn_-M&vet=12ahUKEwjO7YKF_-SKAxUtxzgGHXduHeAQM3oECGsQAA..i&w=1200&h=735&hcb=2&ved=2ahUKEwjO7YKF_-SKAxUtxzgGHXduHeAQM3oECGsQAA)

### 2. Install Java JDK
- Download Java JDK (latest version) from [Oracle's official site](https://www.oracle.com/java/technologies/javase-downloads.html).
- Install and configure the `JAVA_HOME` environment variable.

![Install Java JDK](image_link_here)

### 3. Install Java Extensions in VS Code
- Open VS Code.
- Go to Extensions Marketplace (Ctrl+Shift+X).
- Search for **"Java Extension Pack"**.
- Click **Install**.

![Install Java Extension Pack](image_link_here)

### 4. Set Up Input and Output Files
- Create two text files in your project directory:
  - `input.txt` for test inputs.
  - `output.txt` for storing program output.

![Create Input and Output Files](image_link_here)

### 5. Configure tasks.json for Input/Output Redirection
- Open the Command Palette (Ctrl+Shift+P) and select **"Tasks: Configure Task"**.
- Add the following configuration in the `tasks.json` file:
```json
{
  "version": "2.0.0",
  "tasks": [
    {
      "label": "Run Java Program",
      "type": "shell",
      "command": "javac ${file} && java ${fileBasenameNoExtension} < input.txt > output.txt",
      "group": {
        "kind": "build",
        "isDefault": true
      }
    }
  ]
}
```

![Configure tasks.json](image_link_here)

### 6. Write Your Java Code
- Open a new file and save it with a `.java` extension (e.g., `Main.java`).
- Write your program using the `Scanner` class for input handling.

Example Code:
```java
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a + b);
    }
}
```

![Write Java Code](image_link_here)

### 7. Run Your Program
- Open the Terminal in VS Code.
- Run the task using **Ctrl+Shift+B**.
- Check the output in the `output.txt` file.

![Run Program](image_link_here)

### 8. Debugging (Optional)
- Use breakpoints and the debugging tool for step-by-step execution.

![Debugging](image_link_here)

---

This guide helps you streamline Java programming for Competitive Programming (CP) and Data Structures & Algorithms (DSA). Happy Coding!
