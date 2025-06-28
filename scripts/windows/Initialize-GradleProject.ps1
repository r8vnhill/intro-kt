function Initialize-GradleProject {
    [CmdletBinding()]
    param (
        # Name of the project directory to create and initialize.
        [Parameter(Mandatory)]
        [string] $ProjectName
    )

    # Get the current working directory
    $currentLocation = Get-Location

    # Combine current location with the project name to get the full path
    $projectPath = Join-Path -Path $currentLocation -ChildPath $ProjectName

    # If the directory doesn't exist, create it
    if (-not (Test-Path -Path $projectPath)) {
        New-Item -Path $projectPath -ItemType Directory
    } else {
        # Otherwise, warn and reuse the existing directory
        Write-Warning "Directory '$ProjectName' already exists. Reusing it."
    }

    # Change the current location to the new/existing project directory
    Push-Location -Path $projectPath
    try {
        # Initialize a Gradle project with default settings using the Kotlin application template
        gradle init --use-defaults --type kotlin-application
    } finally {
        # Return to the original directory regardless of success or failure
        Pop-Location
    }
}

# Call the function with a specific project name
Initialize-GradleProject -ProjectName "intro-kt"
