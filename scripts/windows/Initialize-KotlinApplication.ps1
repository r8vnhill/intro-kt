# Enable advanced parameter binding and metadata support
[CmdletBinding()]
param (
    # Name of the project directory to create and initialize
    [Parameter(Mandatory)]
    [string]
    $ProjectName
)

# Build the full path to the new project directory
$projectPath = Join-Path -Path (Get-Location) -ChildPath $ProjectName

# Create the project directory if it doesn't exist
if (-not (Test-Path -Path $projectPath)) {
    New-Item -Path $projectPath -ItemType Directory | Out-Null
} else {
    Write-Warning "Directory '$ProjectName' already exists. Reusing it."
}

# Change into the project directory
Push-Location -Path $projectPath
try {
    # Run Gradle to initialize a basic Kotlin application project
    & gradle init --use-defaults --type kotlin-application
} finally {
    # Return to the original directory after initialization
    Pop-Location
}
