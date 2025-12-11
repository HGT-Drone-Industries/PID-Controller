#Code to be able to run the code on a school PC with locked terminal
import subprocess
import os

def compile_and_run_java(java_file):
    # Change to the directory where the Java file is
    os.chdir("C:/Users/KrutzlingerJakob/OneDrive - Hertzhaimer Gymnasium Trostberg/11a/P-Seminar Informatik/PID Controller Github Connection/PID-Controller/")

    if not os.path.isfile(java_file):
        print(f"Error: {java_file} not found.")
        return

    class_name = os.path.splitext(os.path.basename(java_file))[0]

    try:
        # Compile with optional target version
        compile_result = subprocess.run(
            ["javac", "--release", "8", java_file],
            capture_output=True,
            text=True
        )

        if compile_result.returncode != 0:
            print("Compilation failed:")
            print(compile_result.stderr)
            return

        print("Compilation successful.")

        # Run the compiled Java class
        run_result = subprocess.run(
            ["java", class_name],
            capture_output=True,
            text=True
        )

        # Print Java output
        print(run_result.stdout)
        if run_result.stderr:
            print(run_result.stderr)

    except FileNotFoundError:
        print("Error: Java compiler 'javac' or runtime 'java' not found. Make sure JDK is in PATH.")

if __name__ == "__main__":
    compile_and_run_java("Drone.java")