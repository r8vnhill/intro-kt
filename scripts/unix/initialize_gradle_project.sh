#!/usr/bin/env bash
set -euo pipefail
# -e: Exit immediately if a command exits with a non-zero status
# -u: Treat unset variables as an error
# -o pipefail: Return the exit code of the last command in the pipeline that failed

# Function to initialize a new Gradle project
initialize_gradle_project() {
    local project_name="${1:-}" # Get the first argument passed, or empty string if not provided

    # Check if project name was given
    if [[ -z "$project_name" ]]; then
        echo "Error: Project name is required." >&2
        echo "Usage: initialize_gradle_project <project_name>" >&2
        return 1
    fi

    # Get the current working directory
    local current_dir
    current_dir="$(pwd)"
    local project_path="$current_dir/$project_name" # Build the path for the new project

    # If the project directory doesn't exist, create it
    if [[ ! -d "$project_path" ]]; then
        echo "Creating project directory: $project_path"
        mkdir -p "$project_path"
    else
        # Warn if the directory already exists
        echo "Warning: Directory '$project_name' already exists. Reusing it." >&2
    fi

    # Change to the project directory
    pushd "$project_path" >/dev/null

    # Initialize a Gradle Kotlin application with default settings
    gradle init --use-defaults --type kotlin-application

    # Return to the original directory
    popd >/dev/null
}

# Only run if the script is executed directly (not sourced)
if [[ "${BASH_SOURCE[0]}" == "${0}" ]]; then
    initialize_gradle_project "intro-kt"
fi
